package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arn extends js.Object {
  var arn: String
  var name: String
  var ownerIdentity: Anon_PrincipalIdString
}

object Anon_Arn {
  @scala.inline
  def apply(arn: String, name: String, ownerIdentity: Anon_PrincipalIdString): Anon_Arn = {
    val __obj = js.Dynamic.literal(arn = arn, name = name, ownerIdentity = ownerIdentity)
  
    __obj.asInstanceOf[Anon_Arn]
  }
}

