package typings.ssri.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithms extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Algorithms {
  @scala.inline
  def apply(
    algorithms: js.Array[String] = null,
    options: js.Array[String] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Algorithms = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms]
  }
}

