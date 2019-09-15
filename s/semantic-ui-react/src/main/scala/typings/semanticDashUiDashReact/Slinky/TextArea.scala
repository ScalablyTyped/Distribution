package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.FormEvent
import typings.semanticDashUiDashReact.distCommonjsAddonsTextAreaMod.default
import typings.semanticDashUiDashReact.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: value */
object TextArea
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsAddonsTextAreaMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    onChange: (/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit = null,
    onInput: (/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit = null,
    rows: Double | String = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction2(onInput))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TextAreaProps
}

