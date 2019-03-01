package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShowType extends js.Object {
  var show: scala.Boolean
  var `type`: java.lang.String
}

object Anon_ShowType {
  @scala.inline
  def apply(show: scala.Boolean, `type`: java.lang.String): Anon_ShowType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_ShowType]
  }
}

