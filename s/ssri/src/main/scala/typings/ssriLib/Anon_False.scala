package typings
package ssriLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var single: js.UndefOr[ssriLib.ssriLibNumbers.`false`] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(single: ssriLib.ssriLibNumbers.`false` = null, strict: js.UndefOr[scala.Boolean] = js.undefined): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (single != null) __obj.updateDynamic("single")(single)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_False]
  }
}

