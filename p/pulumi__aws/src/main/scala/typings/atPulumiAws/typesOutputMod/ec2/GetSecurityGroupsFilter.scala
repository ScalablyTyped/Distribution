package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityGroupsFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetSecurityGroupsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetSecurityGroupsFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetSecurityGroupsFilter]
  }
}

