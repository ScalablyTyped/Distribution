package typings.ssri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sep extends js.Object {
  var sep: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Anon_Sep {
  @scala.inline
  def apply(sep: String = null, strict: js.UndefOr[Boolean] = js.undefined): Anon_Sep = {
    val __obj = js.Dynamic.literal()
    if (sep != null) __obj.updateDynamic("sep")(sep)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_Sep]
  }
}

