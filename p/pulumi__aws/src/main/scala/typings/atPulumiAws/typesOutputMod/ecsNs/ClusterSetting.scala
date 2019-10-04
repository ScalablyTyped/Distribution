package typings.atPulumiAws.typesOutputMod.ecsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSetting extends js.Object {
  /**
    * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
    */
  var name: String
  var value: String
}

object ClusterSetting {
  @scala.inline
  def apply(name: String, value: String): ClusterSetting = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[ClusterSetting]
  }
}

