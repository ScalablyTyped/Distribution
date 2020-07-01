package typings.reactVis.mod

import typings.reactVis.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BordersProps extends js.Object {
  var innerHeight: js.UndefOr[Double] = js.undefined
  var innerWidth: js.UndefOr[Double] = js.undefined
  var marginBottom: js.UndefOr[Double] = js.undefined
  var marginLeft: js.UndefOr[Double] = js.undefined
  var marginRight: js.UndefOr[Double] = js.undefined
   // default: {'all':{},'bottom':{},'left':{},'right':{},'top':{}}
  var marginTop: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Bottom] = js.undefined
}

object BordersProps {
  @scala.inline
  def apply(
    innerHeight: js.UndefOr[Double] = js.undefined,
    innerWidth: js.UndefOr[Double] = js.undefined,
    marginBottom: js.UndefOr[Double] = js.undefined,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginRight: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    style: Bottom = null
  ): BordersProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(innerHeight)) __obj.updateDynamic("innerHeight")(innerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerWidth)) __obj.updateDynamic("innerWidth")(innerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BordersProps]
  }
}

