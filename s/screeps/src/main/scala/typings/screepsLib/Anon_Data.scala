package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: java.lang.String
  var id: scala.Double
  var username: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(data: java.lang.String, id: scala.Double, username: java.lang.String): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Data]
  }
}

