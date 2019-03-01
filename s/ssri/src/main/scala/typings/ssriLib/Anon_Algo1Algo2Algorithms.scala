package typings
package ssriLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algo1Algo2Algorithms extends js.Object {
  var algorithms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var integrity: js.UndefOr[java.lang.String | ssriLib.ssriMod.IntegrityLike | ssriLib.ssriMod.HashLike] = js.undefined
  var options: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pickAlgorithm: js.UndefOr[
    js.Function2[/* algo1 */ java.lang.String, /* algo2 */ java.lang.String, java.lang.String]
  ] = js.undefined
  var single: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Algo1Algo2Algorithms {
  @scala.inline
  def apply(
    algorithms: js.Array[java.lang.String] = null,
    integrity: java.lang.String | ssriLib.ssriMod.IntegrityLike | ssriLib.ssriMod.HashLike = null,
    options: js.Array[java.lang.String] = null,
    pickAlgorithm: js.Function2[/* algo1 */ java.lang.String, /* algo2 */ java.lang.String, java.lang.String] = null,
    single: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Algo1Algo2Algorithms = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(pickAlgorithm)
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_Algo1Algo2Algorithms]
  }
}

