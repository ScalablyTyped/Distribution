package typings.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoreLikeThisOptions extends js.Object {
  var boost: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var fl: js.UndefOr[String | js.Array[String]] = js.undefined
  var maxntp: js.UndefOr[Double] = js.undefined
  var maxqt: js.UndefOr[Double] = js.undefined
  var maxwl: js.UndefOr[Double] = js.undefined
  var mindf: js.UndefOr[Double] = js.undefined
  var mintf: js.UndefOr[Double] = js.undefined
  var minwl: js.UndefOr[Double] = js.undefined
  var on: Boolean
  var qf: js.UndefOr[String | js.Object] = js.undefined
}

object MoreLikeThisOptions {
  @scala.inline
  def apply(
    on: Boolean,
    boost: js.UndefOr[Boolean] = js.undefined,
    count: js.UndefOr[Double] = js.undefined,
    fl: String | js.Array[String] = null,
    maxntp: js.UndefOr[Double] = js.undefined,
    maxqt: js.UndefOr[Double] = js.undefined,
    maxwl: js.UndefOr[Double] = js.undefined,
    mindf: js.UndefOr[Double] = js.undefined,
    mintf: js.UndefOr[Double] = js.undefined,
    minwl: js.UndefOr[Double] = js.undefined,
    qf: String | js.Object = null
  ): MoreLikeThisOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    if (!js.isUndefined(boost)) __obj.updateDynamic("boost")(boost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (fl != null) __obj.updateDynamic("fl")(fl.asInstanceOf[js.Any])
    if (!js.isUndefined(maxntp)) __obj.updateDynamic("maxntp")(maxntp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxqt)) __obj.updateDynamic("maxqt")(maxqt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxwl)) __obj.updateDynamic("maxwl")(maxwl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mindf)) __obj.updateDynamic("mindf")(mindf.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mintf)) __obj.updateDynamic("mintf")(mintf.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minwl)) __obj.updateDynamic("minwl")(minwl.get.asInstanceOf[js.Any])
    if (qf != null) __obj.updateDynamic("qf")(qf.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreLikeThisOptions]
  }
}

