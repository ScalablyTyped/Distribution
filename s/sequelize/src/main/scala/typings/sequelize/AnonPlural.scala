package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlural extends js.Object {
  var plural: String
  var singular: String
}

object AnonPlural {
  @scala.inline
  def apply(plural: String, singular: String): AnonPlural = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPlural]
  }
}

