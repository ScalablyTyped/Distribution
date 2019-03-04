package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Role extends js.Object {
  var role: java.lang.String
  var rules: js.Array[Anon_Destination]
}

object Anon_Role {
  @scala.inline
  def apply(role: java.lang.String, rules: js.Array[Anon_Destination]): Anon_Role = {
    val __obj = js.Dynamic.literal(role = role, rules = rules)
  
    __obj.asInstanceOf[Anon_Role]
  }
}

