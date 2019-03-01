package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrincipalId extends js.Object {
  var PrincipalId: java.lang.String
  var Type: java.lang.String
}

object Anon_PrincipalId {
  @scala.inline
  def apply(PrincipalId: java.lang.String, Type: java.lang.String): Anon_PrincipalId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PrincipalId")(PrincipalId)
    __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[Anon_PrincipalId]
  }
}

