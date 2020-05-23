package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arn extends js.Object {
  var arn: String = js.native
  var name: String = js.native
  var ownerIdentity: PrincipalIdString = js.native
}

object Arn {
  @scala.inline
  def apply(arn: String, name: String, ownerIdentity: PrincipalIdString): Arn = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arn]
  }
}

