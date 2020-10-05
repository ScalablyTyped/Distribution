package typings.storybookAddons.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effect extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit] | Unit] = js.native
  def create(): js.Function0[Unit] | Unit = js.native
}

object Effect {
  @scala.inline
  def apply(create: () => js.Function0[Unit] | Unit): Effect = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[Effect]
  }
  @scala.inline
  implicit class EffectOps[Self <: Effect] (val x: Self) extends AnyVal {
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
    def setCreate(value: () => js.Function0[Unit] | Unit): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroyFunction0(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: js.Function0[Unit] | Unit): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
  }
  
}

