package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArnNameOwnerIdentity extends js.Object {
  var arn: java.lang.String
  var name: java.lang.String
  var ownerIdentity: Anon_PrincipalIdString
}

object Anon_ArnNameOwnerIdentity {
  @scala.inline
  def apply(arn: java.lang.String, name: java.lang.String, ownerIdentity: Anon_PrincipalIdString): Anon_ArnNameOwnerIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ownerIdentity")(ownerIdentity)
    __obj.asInstanceOf[Anon_ArnNameOwnerIdentity]
  }
}

