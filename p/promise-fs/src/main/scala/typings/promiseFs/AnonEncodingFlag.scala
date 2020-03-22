package typings.promiseFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingFlag extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
}

object AnonEncodingFlag {
  @scala.inline
  def apply(encoding: String = null, flag: String = null): AnonEncodingFlag = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingFlag]
  }
}

