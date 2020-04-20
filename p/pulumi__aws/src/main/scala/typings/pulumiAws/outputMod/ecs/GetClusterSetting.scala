package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterSetting extends js.Object {
  var name: String = js.native
  var value: String = js.native
}

object GetClusterSetting {
  @scala.inline
  def apply(name: String, value: String): GetClusterSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterSetting]
  }
}

