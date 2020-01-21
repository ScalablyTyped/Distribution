package typings.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArn extends js.Object {
  var arn: String = js.native
  var name: String = js.native
  var ownerIdentity: AnonPrincipalIdString = js.native
}

object AnonArn {
  @scala.inline
  def apply(arn: String, name: String, ownerIdentity: AnonPrincipalIdString): AnonArn = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArn]
  }
}

