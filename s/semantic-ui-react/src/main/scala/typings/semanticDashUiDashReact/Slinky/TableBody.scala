package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsCollectionsTableTableBodyMod.TableBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, children */
object TableBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsCollectionsTableTableBodyMod.^.default.asInstanceOf[String | js.Object]
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, as: js.Any = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableBodyProps
}

