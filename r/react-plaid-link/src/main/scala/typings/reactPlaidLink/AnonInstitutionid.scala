package typings.reactPlaidLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstitutionid extends js.Object {
  var institution_id: String
  var name: String
}

object AnonInstitutionid {
  @scala.inline
  def apply(institution_id: String, name: String): AnonInstitutionid = {
    val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInstitutionid]
  }
}

