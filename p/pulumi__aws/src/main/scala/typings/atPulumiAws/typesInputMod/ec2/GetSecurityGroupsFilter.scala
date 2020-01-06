package typings.atPulumiAws.typesInputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityGroupsFilter extends js.Object {
  var name: String = js.native
  var values: js.Array[String] = js.native
}

object GetSecurityGroupsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetSecurityGroupsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSecurityGroupsFilter]
  }
}

