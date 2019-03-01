package typings
package reactDashStripeDashElementsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[Anon_Declinecode] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: Anon_Declinecode = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_Error]
  }
}

