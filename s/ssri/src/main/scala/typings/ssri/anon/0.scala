package typings.ssri.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
}

object `0` {
  @scala.inline
  def apply(pickAlgorithm: (/* algo1 */ String, /* algo2 */ String) => String = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2(pickAlgorithm))
    __obj.asInstanceOf[`0`]
  }
}

