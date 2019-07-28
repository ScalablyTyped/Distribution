package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SingleStrict extends js.Object {
  var single: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_SingleStrict {
  @scala.inline
  def apply(single: js.UndefOr[Boolean] = js.undefined, strict: js.UndefOr[Boolean] = js.undefined): Anon_SingleStrict = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_SingleStrict]
  }
}

