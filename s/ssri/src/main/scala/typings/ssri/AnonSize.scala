package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object AnonSize {
  @scala.inline
  def apply(
    options: js.Array[String] = null,
    pickAlgorithm: (/* algo1 */ String, /* algo2 */ String) => String = null,
    size: Int | Double = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): AnonSize = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2(pickAlgorithm))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

