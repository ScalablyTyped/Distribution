package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactVis.anon.Box
import typings.reactVis.anon.Title
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var innerHeight: js.UndefOr[Double] = js.undefined
  var innerWidth: js.UndefOr[Double] = js.undefined
  var itemsFormat: js.UndefOr[js.Function1[/* x */ js.Any, js.Array[Title]]] = js.undefined
  var marginLeft: js.UndefOr[Double] = js.undefined
  var marginTop: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[left | right] = js.undefined
  var series: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var style: js.UndefOr[Box] = js.undefined
  var titleFormat: js.UndefOr[js.Function1[/* x */ js.Any, Title]] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object CrosshairProps {
  @scala.inline
  def apply(
    className: String = null,
    innerHeight: js.UndefOr[Double] = js.undefined,
    innerWidth: js.UndefOr[Double] = js.undefined,
    itemsFormat: /* x */ js.Any => js.Array[Title] = null,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    orientation: left | right = null,
    series: StringDictionary[js.Any] = null,
    style: Box = null,
    titleFormat: /* x */ js.Any => Title = null,
    values: js.Array[_] = null
  ): CrosshairProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(innerHeight)) __obj.updateDynamic("innerHeight")(innerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerWidth)) __obj.updateDynamic("innerWidth")(innerWidth.get.asInstanceOf[js.Any])
    if (itemsFormat != null) __obj.updateDynamic("itemsFormat")(js.Any.fromFunction1(itemsFormat))
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (titleFormat != null) __obj.updateDynamic("titleFormat")(js.Any.fromFunction1(titleFormat))
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrosshairProps]
  }
}

