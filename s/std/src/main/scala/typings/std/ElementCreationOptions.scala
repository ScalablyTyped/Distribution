package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementCreationOptions extends js.Object {
  var is: js.UndefOr[java.lang.String] = js.undefined
}

object ElementCreationOptions {
  @scala.inline
  def apply(is: java.lang.String = null): ElementCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCreationOptions]
  }
}

