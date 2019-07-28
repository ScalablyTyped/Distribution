package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithms extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_Algorithms {
  @scala.inline
  def apply(
    algorithms: js.Array[String] = null,
    options: js.Array[String] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Anon_Algorithms = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_Algorithms]
  }
}

