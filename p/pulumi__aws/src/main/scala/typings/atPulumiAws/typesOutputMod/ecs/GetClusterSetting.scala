package typings.atPulumiAws.typesOutputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterSetting extends js.Object {
  var name: String
  var value: String
}

object GetClusterSetting {
  @scala.inline
  def apply(name: String, value: String): GetClusterSetting = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[GetClusterSetting]
  }
}

