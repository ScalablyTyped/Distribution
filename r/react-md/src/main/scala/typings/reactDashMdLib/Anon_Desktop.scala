package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Desktop extends js.Object {
  var desktop: scala.Boolean
  var mobile: scala.Boolean
  var tablet: scala.Boolean
}

object Anon_Desktop {
  @scala.inline
  def apply(desktop: scala.Boolean, mobile: scala.Boolean, tablet: scala.Boolean): Anon_Desktop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("desktop")(desktop)
    __obj.updateDynamic("mobile")(mobile)
    __obj.updateDynamic("tablet")(tablet)
    __obj.asInstanceOf[Anon_Desktop]
  }
}

