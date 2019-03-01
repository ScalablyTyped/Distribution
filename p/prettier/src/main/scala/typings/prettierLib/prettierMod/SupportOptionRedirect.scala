package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportOptionRedirect extends js.Object {
  var options: java.lang.String
  var value: SupportOptionValue
}

object SupportOptionRedirect {
  @scala.inline
  def apply(options: java.lang.String, value: SupportOptionValue): SupportOptionRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportOptionRedirect]
  }
}

