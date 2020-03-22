package typings.semanticUiDimmer

import typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typings.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typings.semanticUiDimmer.semanticUiDimmerStrings.auto
import typings.semanticUiDimmer.semanticUiDimmerStrings.click
import typings.semanticUiDimmer.semanticUiDimmerStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var closable: js.UndefOr[auto | Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var dimmerName: js.UndefOr[`false` | String] = js.undefined
  var duration: js.UndefOr[Double | DurationSettings] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[`false` | hover | click] = js.undefined
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var opacity: js.UndefOr[auto | Double] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[TemplateSettings] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var useCSS: js.UndefOr[Boolean] = js.undefined
  var variation: js.UndefOr[`false` | String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    className: ClassNameSettings = null,
    closable: auto | Boolean = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dimmerName: `false` | String = null,
    duration: Double | DurationSettings = null,
    error: ErrorSettings = null,
    name: String = null,
    namespace: String = null,
    on: `false` | hover | click = null,
    onChange: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onHide: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onShow: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    opacity: auto | Double = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    template: TemplateSettings = null,
    transition: String = null,
    useCSS: js.UndefOr[Boolean] = js.undefined,
    variation: `false` | String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closable != null) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (dimmerName != null) __obj.updateDynamic("dimmerName")(dimmerName.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

