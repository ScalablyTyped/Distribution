package typings.ssri

import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgorithmsOptions extends js.Object {
  var Promise: js.UndefOr[PromiseConstructorLike] = js.undefined
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_AlgorithmsOptions {
  @scala.inline
  def apply(
    Promise: PromiseConstructorLike = null,
    algorithms: js.Array[String] = null,
    options: js.Array[String] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Anon_AlgorithmsOptions = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_AlgorithmsOptions]
  }
}

