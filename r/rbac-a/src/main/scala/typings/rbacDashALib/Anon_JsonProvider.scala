package typings
package rbacDashALib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JsonProvider extends js.Object {
  /** Basic JSON permissions provider */
  var JsonProvider: Anon_Roles
}

object Anon_JsonProvider {
  @scala.inline
  def apply(JsonProvider: Anon_Roles): Anon_JsonProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("JsonProvider")(JsonProvider)
    __obj.asInstanceOf[Anon_JsonProvider]
  }
}

