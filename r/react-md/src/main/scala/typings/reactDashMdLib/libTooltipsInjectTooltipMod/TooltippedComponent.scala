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
  def apply(getComposedComponent: js.Function0[reactLib.reactMod.ReactNs.ReactInstance]): TooltippedComponent = {
    val __obj = js.Dynamic.literal(getComposedComponent = getComposedComponent)
  
    __obj.asInstanceOf[TooltippedComponent]
  }
}

