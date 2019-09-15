package typings.reactDashTransitionDashGroup.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashTransitionDashGroup.switchTransitionMod.SwitchTransitionProps
import typings.reactDashTransitionDashGroup.switchTransitionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: mode */
object SwitchTransition
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashTransitionDashGroup.switchTransitionMod.default].asInstanceOf[String | js.Object]
  def apply(): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwitchTransitionProps
}

