package typings.reduxSagaCore.effectsMod

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEffectDescriptor[A /* <: Action[_] */] extends js.Object {
  var action: A = js.native
  var channel: Null = js.native
  var resolve: js.UndefOr[Boolean] = js.native
}

object PutEffectDescriptor {
  @scala.inline
  def apply[/* <: typings.redux.mod.Action[_] */ A](action: A, channel: Null): PutEffectDescriptor[A] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEffectDescriptor[A]]
  }
  @scala.inline
  implicit class PutEffectDescriptorOps[Self <: PutEffectDescriptor[_], /* <: typings.redux.mod.Action[_] */ A] (val x: Self with PutEffectDescriptor[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: A): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: Null): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolve(value: Boolean): Self = this.set("resolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
  
}

