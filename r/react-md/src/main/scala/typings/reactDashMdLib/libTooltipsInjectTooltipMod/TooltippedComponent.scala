package typings
package reactDashMdLib.libTooltipsInjectTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltippedComponent extends js.Object {
  def getComposedComponent(): reactLib.reactMod.ReactNs.ReactInstance
}

object TooltippedComponent {
  @scala.inline
  def apply(getComposedComponent: () => reactLib.reactMod.ReactNs.ReactInstance): TooltippedComponent = {
    val __obj = js.Dynamic.literal(getComposedComponent = js.Any.fromFunction0(getComposedComponent))
  
    __obj.asInstanceOf[TooltippedComponent]
  }
}

