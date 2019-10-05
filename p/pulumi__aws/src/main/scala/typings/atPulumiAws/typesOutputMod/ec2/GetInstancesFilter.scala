package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetInstancesFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetInstancesFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetInstancesFilter]
  }
}

