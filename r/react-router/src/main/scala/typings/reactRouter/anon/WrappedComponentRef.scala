package typings.reactRouter.anon

import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedComponentRef[C /* <: ComponentType[_] */] extends js.Object {
  var wrappedComponentRef: js.UndefOr[Ref[InstanceType[C]]] = js.native
}

object WrappedComponentRef {
  @scala.inline
  def apply[/* <: typings.react.mod.ComponentType[_] */ C](): WrappedComponentRef[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrappedComponentRef[C]]
  }
  @scala.inline
  implicit class WrappedComponentRefOps[Self <: WrappedComponentRef[_], /* <: typings.react.mod.ComponentType[_] */ C] (val x: Self with WrappedComponentRef[C]) extends AnyVal {
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
    def setWrappedComponentRefFunction1(value: /* instance */ InstanceType[C] | Null => Unit): Self = this.set("wrappedComponentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setWrappedComponentRef(value: Ref[InstanceType[C]]): Self = this.set("wrappedComponentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrappedComponentRef: Self = this.set("wrappedComponentRef", js.undefined)
    @scala.inline
    def setWrappedComponentRefNull: Self = this.set("wrappedComponentRef", null)
  }
  
}

