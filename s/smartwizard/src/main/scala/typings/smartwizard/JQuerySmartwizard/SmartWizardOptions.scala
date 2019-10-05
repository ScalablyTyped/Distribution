package typings.smartwizard.JQuerySmartwizard

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartWizardOptions extends js.Object {
  var ajaxSettings: js.UndefOr[JQueryAjaxSettings] = js.undefined
  var anchorSettings: js.UndefOr[AnchorSettings] = js.undefined
  var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
  var backButtonSupport: js.UndefOr[Boolean] = js.undefined
  var contentCache: js.UndefOr[Boolean] = js.undefined
  var contentURL: js.UndefOr[Null | String] = js.undefined
  var cycleSteps: js.UndefOr[Boolean] = js.undefined
  var disabledSteps: js.UndefOr[js.Array[Double]] = js.undefined
  var errorSteps: js.UndefOr[js.Array[Double]] = js.undefined
  var hiddenSteps: js.UndefOr[js.Array[Double]] = js.undefined
  var keyNavigation: js.UndefOr[Boolean] = js.undefined
  var lang: js.UndefOr[Lang] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
  var showStepURLhash: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  var transitionEffect: js.UndefOr[TransitionEffect] = js.undefined
  var transitionSpeed: js.UndefOr[String | Double] = js.undefined
  var useURLhash: js.UndefOr[Boolean] = js.undefined
}

object SmartWizardOptions {
  @scala.inline
  def apply(
    ajaxSettings: JQueryAjaxSettings = null,
    anchorSettings: AnchorSettings = null,
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    backButtonSupport: js.UndefOr[Boolean] = js.undefined,
    contentCache: js.UndefOr[Boolean] = js.undefined,
    contentURL: String = null,
    cycleSteps: js.UndefOr[Boolean] = js.undefined,
    disabledSteps: js.Array[Double] = null,
    errorSteps: js.Array[Double] = null,
    hiddenSteps: js.Array[Double] = null,
    keyNavigation: js.UndefOr[Boolean] = js.undefined,
    lang: Lang = null,
    selected: Int | Double = null,
    showStepURLhash: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    toolbarSettings: ToolbarSettings = null,
    transitionEffect: TransitionEffect = null,
    transitionSpeed: String | Double = null,
    useURLhash: js.UndefOr[Boolean] = js.undefined
  ): SmartWizardOptions = {
    val __obj = js.Dynamic.literal()
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings)
    if (anchorSettings != null) __obj.updateDynamic("anchorSettings")(anchorSettings)
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight)
    if (!js.isUndefined(backButtonSupport)) __obj.updateDynamic("backButtonSupport")(backButtonSupport)
    if (!js.isUndefined(contentCache)) __obj.updateDynamic("contentCache")(contentCache)
    if (contentURL != null) __obj.updateDynamic("contentURL")(contentURL)
    if (!js.isUndefined(cycleSteps)) __obj.updateDynamic("cycleSteps")(cycleSteps)
    if (disabledSteps != null) __obj.updateDynamic("disabledSteps")(disabledSteps)
    if (errorSteps != null) __obj.updateDynamic("errorSteps")(errorSteps)
    if (hiddenSteps != null) __obj.updateDynamic("hiddenSteps")(hiddenSteps)
    if (!js.isUndefined(keyNavigation)) __obj.updateDynamic("keyNavigation")(keyNavigation)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showStepURLhash)) __obj.updateDynamic("showStepURLhash")(showStepURLhash)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings)
    if (transitionEffect != null) __obj.updateDynamic("transitionEffect")(transitionEffect)
    if (transitionSpeed != null) __obj.updateDynamic("transitionSpeed")(transitionSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(useURLhash)) __obj.updateDynamic("useURLhash")(useURLhash)
    __obj.asInstanceOf[SmartWizardOptions]
  }
}

