package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeckProps extends js.Object {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var autoplayDuration: js.UndefOr[scala.Double] = js.undefined
  var autoplayLoop: js.UndefOr[scala.Boolean] = js.undefined
  var autoplayOnStart: js.UndefOr[scala.Boolean] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var globalStyles: js.UndefOr[scala.Boolean] = js.undefined
  var history: js.UndefOr[js.Any] = js.undefined
  var onStateChange: js.UndefOr[
    js.Function2[
      /* previousState */ js.UndefOr[java.lang.String], 
      /* nextState */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var progress: js.UndefOr[progressType] = js.undefined
   // Needs a type, see https://github.com/ReactTraining/history
  var showFullscreenControl: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var transition: js.UndefOr[js.Array[transitionType]] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

object DeckProps {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayDuration: scala.Int | scala.Double = null,
    autoplayLoop: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayOnStart: js.UndefOr[scala.Boolean] = js.undefined,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    globalStyles: js.UndefOr[scala.Boolean] = js.undefined,
    history: js.Any = null,
    onStateChange: (/* previousState */ js.UndefOr[java.lang.String], /* nextState */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    progress: progressType = null,
    showFullscreenControl: js.UndefOr[scala.Boolean] = js.undefined,
    theme: Theme = null,
    transition: js.Array[transitionType] = null,
    transitionDuration: scala.Int | scala.Double = null
  ): DeckProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayDuration != null) __obj.updateDynamic("autoplayDuration")(autoplayDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayLoop)) __obj.updateDynamic("autoplayLoop")(autoplayLoop)
    if (!js.isUndefined(autoplayOnStart)) __obj.updateDynamic("autoplayOnStart")(autoplayOnStart)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (!js.isUndefined(globalStyles)) __obj.updateDynamic("globalStyles")(globalStyles)
    if (history != null) __obj.updateDynamic("history")(history)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction2(onStateChange))
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (!js.isUndefined(showFullscreenControl)) __obj.updateDynamic("showFullscreenControl")(showFullscreenControl)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeckProps]
  }
}

