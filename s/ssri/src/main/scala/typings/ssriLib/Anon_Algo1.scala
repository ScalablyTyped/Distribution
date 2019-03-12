package typings
package ssriLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algo1 extends js.Object {
  var pickAlgorithm: js.UndefOr[
    js.Function2[/* algo1 */ java.lang.String, /* algo2 */ java.lang.String, java.lang.String]
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Algo1 {
  @scala.inline
  def apply(
    pickAlgorithm: (/* algo1 */ java.lang.String, /* algo2 */ java.lang.String) => java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Algo1 = {
    val __obj = js.Dynamic.literal()
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2(pickAlgorithm))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_Algo1]
  }
}

