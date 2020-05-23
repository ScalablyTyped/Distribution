package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionInformation extends js.Object {
  var domain: js.UndefOr[java.lang.String | Null] = js.undefined
}

object ExceptionInformation {
  @scala.inline
  def apply(domain: js.UndefOr[Null | java.lang.String] = js.undefined): ExceptionInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionInformation]
  }
}

