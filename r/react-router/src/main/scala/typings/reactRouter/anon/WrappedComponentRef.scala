package typings.reactRouter.anon

import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedComponentRef[C /* <: ComponentType[_] */] extends js.Object {
  var wrappedComponentRef: js.UndefOr[Ref[InstanceType[C]]] = js.undefined
}

object WrappedComponentRef {
  @scala.inline
  def apply[C](wrappedComponentRef: js.UndefOr[Null | Ref[InstanceType[C]]] = js.undefined): WrappedComponentRef[C] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(wrappedComponentRef)) __obj.updateDynamic("wrappedComponentRef")(wrappedComponentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentRef[C]]
  }
}

