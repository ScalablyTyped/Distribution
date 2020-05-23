package typings.promiseFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingFlag extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
}

object EncodingFlag {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | String] = js.undefined, flag: String = null): EncodingFlag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingFlag]
  }
}

