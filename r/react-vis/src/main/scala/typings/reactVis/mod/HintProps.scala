package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactVis.anon.Horizontal
import typings.reactVis.anon.Title
import typings.reactVis.anon.Vertical
import typings.reactVis.reactVisStrings.bottomleft
import typings.reactVis.reactVisStrings.bottomright
import typings.reactVis.reactVisStrings.topleft
import typings.reactVis.reactVisStrings.topright
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HintProps extends js.Object {
   // default: {}
  var align: js.UndefOr[Vertical] = js.undefined
  var format: js.UndefOr[js.Function1[/* x */ js.Any, js.Array[Title]]] = js.undefined
   // default: {'horizontal':'auto','vertical':'auto'}
  var getAlignStyle: js.UndefOr[RVGetAlignStyle] = js.undefined
  var innerHeight: js.UndefOr[Double] = js.undefined
  var innerWidth: js.UndefOr[Double] = js.undefined
  var marginLeft: js.UndefOr[Double] = js.undefined
  var marginTop: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[bottomleft | bottomright | topleft | topright] = js.undefined
  var scales: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object HintProps {
  @scala.inline
  def apply(
    align: Vertical = null,
    format: /* x */ js.Any => js.Array[Title] = null,
    getAlignStyle: (/* align */ Horizontal, /* x */ Double, /* y */ Double) => CSSProperties = null,
    innerHeight: js.UndefOr[Double] = js.undefined,
    innerWidth: js.UndefOr[Double] = js.undefined,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    orientation: bottomleft | bottomright | topleft | topright = null,
    scales: StringDictionary[js.Any] = null,
    style: CSSProperties = null,
    value: StringDictionary[js.Any] = null
  ): HintProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (getAlignStyle != null) __obj.updateDynamic("getAlignStyle")(js.Any.fromFunction3(getAlignStyle))
    if (!js.isUndefined(innerHeight)) __obj.updateDynamic("innerHeight")(innerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerWidth)) __obj.updateDynamic("innerWidth")(innerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HintProps]
  }
}

