package typings.atSemanticDashUiDashReactEventDashStack.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atSemanticDashUiDashReactEventDashStack.atSemanticDashUiDashReactEventDashStackMod.default
import typings.atSemanticDashUiDashReactEventDashStack.libTypesEventStackMod.EventStackProps
import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputEventListener
import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputTargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: name */
object EventDashStack
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atSemanticDashUiDashReactEventDashStack.atSemanticDashUiDashReactEventDashStackMod.default].asInstanceOf[String | js.Object]
  def apply(on: InputEventListener, pool: String = null, target: InputTargetElement = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EventStackProps
}

