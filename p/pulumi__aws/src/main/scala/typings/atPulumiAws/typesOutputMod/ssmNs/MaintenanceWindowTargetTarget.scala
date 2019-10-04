package typings.atPulumiAws.typesOutputMod.ssmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTargetTarget extends js.Object {
  var key: String
  var values: js.Array[String]
}

object MaintenanceWindowTargetTarget {
  @scala.inline
  def apply(key: String, values: js.Array[String]): MaintenanceWindowTargetTarget = {
    val __obj = js.Dynamic.literal(key = key, values = values)
  
    __obj.asInstanceOf[MaintenanceWindowTargetTarget]
  }
}

