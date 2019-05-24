package typings
package sha1Lib.sha1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha1AsStringOptions extends Sha1Options {
  var asBytes: js.UndefOr[sha1Lib.sha1LibNumbers.`false`] = js.undefined
  var asString: js.UndefOr[scala.Boolean] = js.undefined
}

object Sha1AsStringOptions {
  @scala.inline
  def apply(asBytes: sha1Lib.sha1LibNumbers.`false` = null, asString: js.UndefOr[scala.Boolean] = js.undefined): Sha1AsStringOptions = {
    val __obj = js.Dynamic.literal()
    if (asBytes != null) __obj.updateDynamic("asBytes")(asBytes)
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString)
    __obj.asInstanceOf[Sha1AsStringOptions]
  }
}

