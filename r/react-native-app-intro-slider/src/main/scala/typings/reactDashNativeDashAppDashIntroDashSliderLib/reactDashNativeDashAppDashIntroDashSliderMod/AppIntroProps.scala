package typings
package reactDashNativeDashAppDashIntroDashSliderLib.reactDashNativeDashAppDashIntroDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppIntroProps extends js.Object {
  var activeDotStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var bottomButton: js.UndefOr[scala.Boolean] = js.undefined
  var buttonStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ButtonProps] = js.undefined
  var buttonTextStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextProps] = js.undefined
  var doneLabel: js.UndefOr[java.lang.String] = js.undefined
  var dotStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var hidePagination: js.UndefOr[scala.Boolean] = js.undefined
  var nextLabel: js.UndefOr[java.lang.String] = js.undefined
  var onDone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSkip: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSlideChange: js.UndefOr[js.Function2[/* index */ scala.Double, /* lastIndex */ scala.Double, scala.Unit]] = js.undefined
  var paginationStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextProps] = js.undefined
  var prevLabel: js.UndefOr[java.lang.String] = js.undefined
  var renderDoneButton: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderItem: js.UndefOr[js.Function1[/* item */ js.Any, reactLib.reactMod.ReactElement]] = js.undefined
  var renderNextButton: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderPrevButton: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderSkipButton: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var showDoneButton: js.UndefOr[scala.Boolean] = js.undefined
  var showNextButton: js.UndefOr[scala.Boolean] = js.undefined
  var showPrevButton: js.UndefOr[scala.Boolean] = js.undefined
  var showSkipButton: js.UndefOr[scala.Boolean] = js.undefined
  var skipLabel: js.UndefOr[java.lang.String] = js.undefined
  var slides: js.Array[_]
}

object AppIntroProps {
  @scala.inline
  def apply(
    slides: js.Array[_],
    activeDotStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    bottomButton: js.UndefOr[scala.Boolean] = js.undefined,
    buttonStyle: reactDashNativeLib.reactDashNativeMod.ButtonProps = null,
    buttonTextStyle: reactDashNativeLib.reactDashNativeMod.TextProps = null,
    doneLabel: java.lang.String = null,
    dotStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    hidePagination: js.UndefOr[scala.Boolean] = js.undefined,
    nextLabel: java.lang.String = null,
    onDone: () => scala.Unit = null,
    onSkip: () => scala.Unit = null,
    onSlideChange: (/* index */ scala.Double, /* lastIndex */ scala.Double) => scala.Unit = null,
    paginationStyle: reactDashNativeLib.reactDashNativeMod.TextProps = null,
    prevLabel: java.lang.String = null,
    renderDoneButton: () => scala.Unit = null,
    renderItem: /* item */ js.Any => reactLib.reactMod.ReactElement = null,
    renderNextButton: () => scala.Unit = null,
    renderPrevButton: () => scala.Unit = null,
    renderSkipButton: () => scala.Unit = null,
    showDoneButton: js.UndefOr[scala.Boolean] = js.undefined,
    showNextButton: js.UndefOr[scala.Boolean] = js.undefined,
    showPrevButton: js.UndefOr[scala.Boolean] = js.undefined,
    showSkipButton: js.UndefOr[scala.Boolean] = js.undefined,
    skipLabel: java.lang.String = null
  ): AppIntroProps = {
    val __obj = js.Dynamic.literal(slides = slides)
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle)
    if (!js.isUndefined(bottomButton)) __obj.updateDynamic("bottomButton")(bottomButton)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle)
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel)
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle)
    if (!js.isUndefined(hidePagination)) __obj.updateDynamic("hidePagination")(hidePagination)
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel)
    if (onDone != null) __obj.updateDynamic("onDone")(js.Any.fromFunction0(onDone))
    if (onSkip != null) __obj.updateDynamic("onSkip")(js.Any.fromFunction0(onSkip))
    if (onSlideChange != null) __obj.updateDynamic("onSlideChange")(js.Any.fromFunction2(onSlideChange))
    if (paginationStyle != null) __obj.updateDynamic("paginationStyle")(paginationStyle)
    if (prevLabel != null) __obj.updateDynamic("prevLabel")(prevLabel)
    if (renderDoneButton != null) __obj.updateDynamic("renderDoneButton")(js.Any.fromFunction0(renderDoneButton))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1(renderItem))
    if (renderNextButton != null) __obj.updateDynamic("renderNextButton")(js.Any.fromFunction0(renderNextButton))
    if (renderPrevButton != null) __obj.updateDynamic("renderPrevButton")(js.Any.fromFunction0(renderPrevButton))
    if (renderSkipButton != null) __obj.updateDynamic("renderSkipButton")(js.Any.fromFunction0(renderSkipButton))
    if (!js.isUndefined(showDoneButton)) __obj.updateDynamic("showDoneButton")(showDoneButton)
    if (!js.isUndefined(showNextButton)) __obj.updateDynamic("showNextButton")(showNextButton)
    if (!js.isUndefined(showPrevButton)) __obj.updateDynamic("showPrevButton")(showPrevButton)
    if (!js.isUndefined(showSkipButton)) __obj.updateDynamic("showSkipButton")(showSkipButton)
    if (skipLabel != null) __obj.updateDynamic("skipLabel")(skipLabel)
    __obj.asInstanceOf[AppIntroProps]
  }
}

