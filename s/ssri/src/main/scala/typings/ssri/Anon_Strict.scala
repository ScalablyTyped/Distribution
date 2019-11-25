package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Strict extends js.Object {
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_Strict {
  @scala.inline
  def apply(strict: js.UndefOr[Boolean] = js.undefined): Anon_Strict = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Strict]
  }
}

