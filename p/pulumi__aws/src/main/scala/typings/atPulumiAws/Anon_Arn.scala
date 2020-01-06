package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arn extends js.Object {
  var arn: String = js.native
  var name: String = js.native
  var ownerIdentity: Anon_PrincipalIdString = js.native
}

object Anon_Arn {
  @scala.inline
  def apply(arn: String, name: String, ownerIdentity: Anon_PrincipalIdString): Anon_Arn = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Arn]
  }
}

