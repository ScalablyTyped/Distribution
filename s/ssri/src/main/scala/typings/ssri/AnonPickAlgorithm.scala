package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPickAlgorithm extends js.Object {
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonPickAlgorithm {
  @scala.inline
  def apply(
    pickAlgorithm: (/* algo1 */ String, /* algo2 */ String) => String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): AnonPickAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2(pickAlgorithm))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPickAlgorithm]
  }
}

