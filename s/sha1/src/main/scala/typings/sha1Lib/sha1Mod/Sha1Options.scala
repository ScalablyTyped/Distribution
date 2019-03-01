package typings
package sha1Lib.sha1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha1Options extends js.Object {
  var asBytes: js.UndefOr[scala.Boolean] = js.undefined
  var asString: js.UndefOr[scala.Boolean] = js.undefined
}

object Sha1Options {
  @scala.inline
  def apply(
    asBytes: js.UndefOr[scala.Boolean] = js.undefined,
    asString: js.UndefOr[scala.Boolean] = js.undefined
  ): Sha1Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asBytes)) __obj.updateDynamic("asBytes")(asBytes)
    if (!js.isUndefined(asString)) __obj.updateDynamic("asString")(asString)
    __obj.asInstanceOf[Sha1Options]
  }
}

