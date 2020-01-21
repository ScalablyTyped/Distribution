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
    count: Int | Double = null,
    fl: String | js.Array[String] = null,
    maxntp: Int | Double = null,
    maxqt: Int | Double = null,
    maxwl: Int | Double = null,
    mindf: Int | Double = null,
    mintf: Int | Double = null,
    minwl: Int | Double = null,
    qf: String | js.Object = null
  ): MoreLikeThisOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    if (!js.isUndefined(boost)) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
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

