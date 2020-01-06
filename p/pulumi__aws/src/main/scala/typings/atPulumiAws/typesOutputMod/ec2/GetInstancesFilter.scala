package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesFilter extends js.Object {
  var name: String = js.native
  var values: js.Array[String] = js.native
}

object GetInstancesFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetInstancesFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstancesFilter]
  }
}

