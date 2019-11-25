package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algo1Algo2Error extends js.Object {
  var error: js.UndefOr[Boolean] = js.undefined
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_Algo1Algo2Error {
  @scala.inline
  def apply(
    error: js.UndefOr[Boolean] = js.undefined,
    pickAlgorithm: (/* algo1 */ String, /* algo2 */ String) => String = null,
    size: Int | Double = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Anon_Algo1Algo2Error = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2(pickAlgorithm))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Algo1Algo2Error]
  }
}

