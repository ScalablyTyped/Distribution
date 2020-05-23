package typings.promiseFs.anon

import typings.node.BufferEncoding
import typings.promiseFs.promiseFsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithFileTypes extends js.Object {
  var encoding: BufferEncoding | Null
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object WithFileTypes {
  @scala.inline
  def apply(encoding: BufferEncoding = null, withFileTypes: `false` = null): WithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithFileTypes]
  }
}

