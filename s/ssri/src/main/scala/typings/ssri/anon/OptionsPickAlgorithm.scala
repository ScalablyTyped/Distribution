package typings.ssri.anon

import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPickAlgorithm extends js.Object {
  var Promise: js.UndefOr[PromiseConstructorLike] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object OptionsPickAlgorithm {
  @scala.inline
  def apply(
    Promise: PromiseConstructorLike = null,
    options: js.Array[String] = null,
    pickAlgorithm: (/* algo1 */ String, /* algo2 */ String) => String = null,
    size: js.UndefOr[Double] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): OptionsPickAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pickAlgorithm != null) __obj.updateDynamic("pickAlgorithm")(js.Any.fromFunction2(pickAlgorithm))
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPickAlgorithm]
  }
}

