package typings.atPulumiAws.typesInputMod.ssm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskParameter extends js.Object {
  /**
    * The parameter name.
    */
  var name: Input[String]
  /**
    * The array of strings.
    */
  var values: Input[js.Array[Input[String]]]
}

object MaintenanceWindowTaskTaskParameter {
  @scala.inline
  def apply(name: Input[String], values: Input[js.Array[Input[String]]]): MaintenanceWindowTaskTaskParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaintenanceWindowTaskTaskParameter]
  }
}

