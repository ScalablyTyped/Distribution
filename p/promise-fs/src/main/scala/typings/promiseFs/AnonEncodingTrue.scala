package typings.promiseFs

import typings.promiseFs.promiseFsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingTrue extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var withFileTypes: `true`
}

object AnonEncodingTrue {
  @scala.inline
  def apply(withFileTypes: `true`, encoding: String = null): AnonEncodingTrue = {
    val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingTrue]
  }
}

