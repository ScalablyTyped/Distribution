package typings.promiseDashFs

import typings.promiseDashFs.promiseDashFsNumbers.`false`
import typings.promiseDashFs.promiseDashFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferEncoding extends js.Object {
  var encoding: buffer
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object Anon_BufferEncoding {
  @scala.inline
  def apply(encoding: buffer, withFileTypes: `false` = null): Anon_BufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BufferEncoding]
  }
}

