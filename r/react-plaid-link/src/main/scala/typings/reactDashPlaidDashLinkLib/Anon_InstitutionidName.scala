package typings
package reactDashPlaidDashLinkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstitutionidName extends js.Object {
  var institution_id: java.lang.String | scala.Null
  var name: java.lang.String | scala.Null
}

object Anon_InstitutionidName {
  @scala.inline
  def apply(institution_id: java.lang.String = null, name: java.lang.String = null): Anon_InstitutionidName = {
    val __obj = js.Dynamic.literal()
    if (institution_id != null) __obj.updateDynamic("institution_id")(institution_id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_InstitutionidName]
  }
}

