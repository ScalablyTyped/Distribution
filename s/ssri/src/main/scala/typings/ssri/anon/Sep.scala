package typings.ssri.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sep extends js.Object {
  var sep: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Sep {
  @scala.inline
  def apply(sep: String = null, strict: js.UndefOr[Boolean] = js.undefined): Sep = {
    val __obj = js.Dynamic.literal()
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sep]
  }
}

