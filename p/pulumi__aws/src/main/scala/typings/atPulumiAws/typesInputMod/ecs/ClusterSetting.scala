package typings.atPulumiAws.typesInputMod.ecs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSetting extends js.Object {
  /**
    * The name of the cluster (up to 255 letters, numbers, hyphens, and underscores)
    */
  var name: Input[String]
  var value: Input[String]
}

object ClusterSetting {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): ClusterSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterSetting]
  }
}

