package typings.atPulumiAws.typesOutputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTarget extends js.Object {
  var key: String
  /**
    * The array of strings.
    */
  var values: js.Array[String]
}

object MaintenanceWindowTaskTarget {
  @scala.inline
  def apply(key: String, values: js.Array[String]): MaintenanceWindowTaskTarget = {
    val __obj = js.Dynamic.literal(key = key, values = values)
  
    __obj.asInstanceOf[MaintenanceWindowTaskTarget]
  }
}

