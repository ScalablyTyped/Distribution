package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Endcursor extends js.Object {
  var end_cursor: java.lang.String
  var has_next_page: scala.Boolean
}

object Anon_Endcursor {
  @scala.inline
  def apply(end_cursor: java.lang.String, has_next_page: scala.Boolean): Anon_Endcursor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end_cursor")(end_cursor)
    __obj.updateDynamic("has_next_page")(has_next_page)
    __obj.asInstanceOf[Anon_Endcursor]
  }
}

