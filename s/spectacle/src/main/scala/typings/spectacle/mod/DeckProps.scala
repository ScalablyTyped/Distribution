package typings.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeckProps extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var autoplayDuration: js.UndefOr[Double] = js.undefined
  var autoplayLoop: js.UndefOr[Boolean] = js.undefined
  var autoplayOnStart: js.UndefOr[Boolean] = js.undefined
  var contentHeight: js.UndefOr[String] = js.undefined
  var contentWidth: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var disableKeyboardControls: js.UndefOr[Boolean] = js.undefined
  var disableTouchControls: js.UndefOr[Boolean] = js.undefined
  var globalStyles: js.UndefOr[Boolean] = js.undefined
  var history: js.UndefOr[js.Any] = js.undefined
  var onStateChange: js.UndefOr[
    js.Function2[/* previousState */ js.UndefOr[String], /* nextState */ js.UndefOr[String], Unit]
  ] = js.undefined
  var progress: js.UndefOr[progressType] = js.undefined
   // Needs a type, see https://github.com/ReactTraining/history
  var showFullscreenControl: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var transition: js.UndefOr[js.Array[transitionType]] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object DeckProps {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayDuration: js.UndefOr[Double] = js.undefined,
    autoplayLoop: js.UndefOr[Boolean] = js.undefined,
    autoplayOnStart: js.UndefOr[Boolean] = js.undefined,
    contentHeight: String = null,
    contentWidth: String = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardControls: js.UndefOr[Boolean] = js.undefined,
    disableTouchControls: js.UndefOr[Boolean] = js.undefined,
    globalStyles: js.UndefOr[Boolean] = js.undefined,
    history: js.Any = null,
    onStateChange: (/* previousState */ js.UndefOr[String], /* nextState */ js.UndefOr[String]) => Unit = null,
    progress: progressType = null,
    showFullscreenControl: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null,
    transition: js.Array[transitionType] = null,
    transitionDuration: js.UndefOr[Double] = js.undefined
  ): DeckProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayDuration)) __obj.updateDynamic("autoplayDuration")(autoplayDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayLoop)) __obj.updateDynamic("autoplayLoop")(autoplayLoop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayOnStart)) __obj.updateDynamic("autoplayOnStart")(autoplayOnStart.get.asInstanceOf[js.Any])
    if (contentHeight != null) __obj.updateDynamic("contentHeight")(contentHeight.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardControls)) __obj.updateDynamic("disableKeyboardControls")(disableKeyboardControls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchControls)) __obj.updateDynamic("disableTouchControls")(disableTouchControls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(globalStyles)) __obj.updateDynamic("globalStyles")(globalStyles.get.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction2(onStateChange))
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (!js.isUndefined(showFullscreenControl)) __obj.updateDynamic("showFullscreenControl")(showFullscreenControl.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeckProps]
  }
}

