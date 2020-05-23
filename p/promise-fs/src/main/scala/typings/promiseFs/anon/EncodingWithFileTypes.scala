package typings.promiseFs.anon

import typings.promiseFs.promiseFsBooleans.`false`
import typings.promiseFs.promiseFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingWithFileTypes extends js.Object {
  var encoding: buffer
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object EncodingWithFileTypes {
  @scala.inline
  def apply(encoding: buffer, withFileTypes: `false` = null): EncodingWithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingWithFileTypes]
  }
}

