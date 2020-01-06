package typings.atPulumiAws.typesOutputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationalUnitsChildren extends js.Object {
  /**
    * ARN of the organizational unit
    */
  var arn: String = js.native
  /**
    * ID of the organizational unit
    */
  var id: String = js.native
  /**
    * Name of the organizational unit
    */
  var name: String = js.native
}

object GetOrganizationalUnitsChildren {
  @scala.inline
  def apply(arn: String, id: String, name: String): GetOrganizationalUnitsChildren = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOrganizationalUnitsChildren]
  }
}

