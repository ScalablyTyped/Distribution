package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.FormEvent
import typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormMod.FormProps
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.equal
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className, action */
object Form
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsCollectionsFormMod.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    error: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onSubmit: (/* event */ FormEvent[HTMLFormElement], /* data */ FormProps) => Unit = null,
    reply: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    success: js.UndefOr[Boolean] = js.undefined,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    warning: js.UndefOr[Boolean] = js.undefined,
    widths: equal = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction2(onSubmit))
    if (!js.isUndefined(reply)) __obj.updateDynamic("reply")(reply)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormProps
}

