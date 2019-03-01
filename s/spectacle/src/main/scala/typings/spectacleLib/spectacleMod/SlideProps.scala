package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideProps extends BaseProps {
  var align: js.UndefOr[alignType] = js.undefined
  var contentStyles: js.UndefOr[CSSProperties] = js.undefined
  var controlColor: js.UndefOr[java.lang.String] = js.undefined
  var dispatch: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var hash: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var history: js.UndefOr[js.Any] = js.undefined
   // Needs a type, see https://github.com/ReactTraining/history
  var id: js.UndefOr[java.lang.String] = js.undefined
  var lastSlideIndex: js.UndefOr[scala.Double] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var onActive: js.UndefOr[js.Function1[/* slideIndex */ java.lang.String | scala.Double, scala.Unit]] = js.undefined
  var progressColor: js.UndefOr[java.lang.String] = js.undefined
  var slideIndex: js.UndefOr[scala.Double] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var transition: js.UndefOr[coreDashJsLib.Array[transitionType]] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  var transitionIn: js.UndefOr[coreDashJsLib.Array[transitionType]] = js.undefined
  var transitionOut: js.UndefOr[coreDashJsLib.Array[transitionType]] = js.undefined
}

object SlideProps {
  @scala.inline
  def apply(
    align: alignType = null,
    bgColor: java.lang.String = null,
    bgDarken: scala.Int | scala.Double = null,
    bgImage: java.lang.String = null,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    caps: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    contentStyles: CSSProperties = null,
    controlColor: java.lang.String = null,
    dispatch: js.Function0[scala.Unit] = null,
    hash: scala.Double | java.lang.String = null,
    history: js.Any = null,
    id: java.lang.String = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    lastSlideIndex: scala.Int | scala.Double = null,
    margin: scala.Double | java.lang.String = null,
    notes: java.lang.String = null,
    onActive: js.Function1[/* slideIndex */ java.lang.String | scala.Double, scala.Unit] = null,
    padding: scala.Double | java.lang.String = null,
    progressColor: java.lang.String = null,
    slideIndex: scala.Int | scala.Double = null,
    state: java.lang.String = null,
    style: CSSProperties = null,
    textAlign: java.lang.String = null,
    textColor: java.lang.String = null,
    textFont: java.lang.String = null,
    textSize: java.lang.String = null,
    transition: coreDashJsLib.Array[transitionType] = null,
    transitionDuration: scala.Int | scala.Double = null,
    transitionIn: coreDashJsLib.Array[transitionType] = null,
    transitionOut: coreDashJsLib.Array[transitionType] = null
  ): SlideProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (bgDarken != null) __obj.updateDynamic("bgDarken")(bgDarken.asInstanceOf[js.Any])
    if (bgImage != null) __obj.updateDynamic("bgImage")(bgImage)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(caps)) __obj.updateDynamic("caps")(caps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentStyles != null) __obj.updateDynamic("contentStyles")(contentStyles)
    if (controlColor != null) __obj.updateDynamic("controlColor")(controlColor)
    if (dispatch != null) __obj.updateDynamic("dispatch")(dispatch)
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (lastSlideIndex != null) __obj.updateDynamic("lastSlideIndex")(lastSlideIndex.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (onActive != null) __obj.updateDynamic("onActive")(onActive)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (progressColor != null) __obj.updateDynamic("progressColor")(progressColor)
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (textFont != null) __obj.updateDynamic("textFont")(textFont)
    if (textSize != null) __obj.updateDynamic("textSize")(textSize)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn)
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut)
    __obj.asInstanceOf[SlideProps]
  }
}

