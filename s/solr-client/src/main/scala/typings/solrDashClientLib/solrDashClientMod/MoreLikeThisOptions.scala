package typings
package solrDashClientLib.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoreLikeThisOptions extends js.Object {
  var boost: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var fl: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var maxntp: js.UndefOr[scala.Double] = js.undefined
  var maxqt: js.UndefOr[scala.Double] = js.undefined
  var maxwl: js.UndefOr[scala.Double] = js.undefined
  var mindf: js.UndefOr[scala.Double] = js.undefined
  var mintf: js.UndefOr[scala.Double] = js.undefined
  var minwl: js.UndefOr[scala.Double] = js.undefined
  var on: scala.Boolean
  var qf: js.UndefOr[java.lang.String | js.Object] = js.undefined
}

object MoreLikeThisOptions {
  @scala.inline
  def apply(
    on: scala.Boolean,
    boost: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    fl: java.lang.String | js.Array[java.lang.String] = null,
    maxntp: scala.Int | scala.Double = null,
    maxqt: scala.Int | scala.Double = null,
    maxwl: scala.Int | scala.Double = null,
    mindf: scala.Int | scala.Double = null,
    mintf: scala.Int | scala.Double = null,
    minwl: scala.Int | scala.Double = null,
    qf: java.lang.String | js.Object = null
  ): MoreLikeThisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(on)
    if (!js.isUndefined(boost)) __obj.updateDynamic("boost")(boost)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fl != null) __obj.updateDynamic("fl")(fl.asInstanceOf[js.Any])
    if (maxntp != null) __obj.updateDynamic("maxntp")(maxntp.asInstanceOf[js.Any])
    if (maxqt != null) __obj.updateDynamic("maxqt")(maxqt.asInstanceOf[js.Any])
    if (maxwl != null) __obj.updateDynamic("maxwl")(maxwl.asInstanceOf[js.Any])
    if (mindf != null) __obj.updateDynamic("mindf")(mindf.asInstanceOf[js.Any])
    if (mintf != null) __obj.updateDynamic("mintf")(mintf.asInstanceOf[js.Any])
    if (minwl != null) __obj.updateDynamic("minwl")(minwl.asInstanceOf[js.Any])
    if (qf != null) __obj.updateDynamic("qf")(qf.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreLikeThisOptions]
  }
}

