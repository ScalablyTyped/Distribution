package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkInterfaceFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetNetworkInterfaceFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetNetworkInterfaceFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetNetworkInterfaceFilter]
  }
}

