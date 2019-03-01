package typings
package ssriLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algo1Algo2Error extends js.Object {
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var pickAlgorithm: js.UndefOr[
    js.Function2[/* algo1 */ java.lang.String, /* algo2 */ java.lang.String, java.lang.String]
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Algo1Algo2Error {
  @scala.inline
  def apply(
    error: js.UndefOr[scala.Boolean] = js.undefined,
    pickAlgorithm: js.Function2[/* algo1 */ java.lang.String, /* algo2 */ java.lang.String, java.lang.String] = null,
    size: scala.Int | scala.Double = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Algo1Algo2Error = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(pickAlgorithm)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_Algo1Algo2Error]
  }
}

