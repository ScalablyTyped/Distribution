package typings.ssri.anon

import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promise extends js.Object {
  var Promise: js.UndefOr[PromiseConstructorLike] = js.undefined
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Promise {
  @scala.inline
  def apply(
    Promise: PromiseConstructorLike = null,
    algorithms: js.Array[String] = null,
    options: js.Array[String] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Promise = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
}

