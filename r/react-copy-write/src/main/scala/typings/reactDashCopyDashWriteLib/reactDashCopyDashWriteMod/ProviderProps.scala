package typings
package reactDashCopyDashWriteLib.reactDashCopyDashWriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps[T] extends js.Object {
  var children: reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element]
  var initialState: js.UndefOr[stdLib.Partial[T]] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply[T](
    children: reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element],
    initialState: stdLib.Partial[T] = null
  ): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    __obj.asInstanceOf[ProviderProps[T]]
  }
}

