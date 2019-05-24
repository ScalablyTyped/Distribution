package typings
package sha1Lib.sha1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha1AsBytesOptions extends Sha1Options {
  var asBytes: sha1Lib.sha1LibNumbers.`true`
  var asString: js.UndefOr[sha1Lib.sha1LibNumbers.`false`] = js.undefined
}

object Sha1AsBytesOptions {
  @scala.inline
  def apply(asBytes: sha1Lib.sha1LibNumbers.`true`, asString: sha1Lib.sha1LibNumbers.`false` = null): Sha1AsBytesOptions = {
    val __obj = js.Dynamic.literal(asBytes = asBytes)
    if (asString != null) __obj.updateDynamic("asString")(asString)
    __obj.asInstanceOf[Sha1AsBytesOptions]
  }
}

