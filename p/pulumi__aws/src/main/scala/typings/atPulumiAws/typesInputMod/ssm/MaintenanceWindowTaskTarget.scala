package typings.atPulumiAws.typesInputMod.ssm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTarget extends js.Object {
  var key: Input[String]
  /**
    * The array of strings.
    */
  var values: Input[js.Array[Input[String]]]
}

object MaintenanceWindowTaskTarget {
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): MaintenanceWindowTaskTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaintenanceWindowTaskTarget]
  }
}

