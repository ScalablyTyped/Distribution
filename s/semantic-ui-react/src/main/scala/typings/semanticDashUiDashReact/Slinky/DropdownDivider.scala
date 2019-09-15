package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsModulesDropdownDropdownDividerMod.DropdownDividerProps
import typings.semanticDashUiDashReact.distCommonjsModulesDropdownDropdownDividerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object DropdownDivider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsModulesDropdownDropdownDividerMod.default].asInstanceOf[String | js.Object]
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, as: js.Any = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DropdownDividerProps
}

