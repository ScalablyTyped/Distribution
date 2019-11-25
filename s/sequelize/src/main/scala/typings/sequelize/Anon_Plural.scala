package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plural extends js.Object {
  var plural: String
  var singular: String
}

object Anon_Plural {
  @scala.inline
  def apply(plural: String, singular: String): Anon_Plural = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Plural]
  }
}

