package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(pickAlgorithm: (/* algo1 */ String, /* algo2 */ String) => String = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2(pickAlgorithm))
    __obj.asInstanceOf[Anon0]
  }
}

