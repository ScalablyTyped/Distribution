package typings
package atPulumiAwsLib.getAutoscalingGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAutoscalingGroupsResult extends js.Object {
  /**
    * A list of the Autoscaling Groups Arns in the current region.
    */
  val arns: js.Array[java.lang.String]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A list of the Autoscaling Groups in the current region.
    */
  val names: js.Array[java.lang.String]
}

object GetAutoscalingGroupsResult {
  @scala.inline
  def apply(arns: js.Array[java.lang.String], id: java.lang.String, names: js.Array[java.lang.String]): GetAutoscalingGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arns")(arns)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("names")(names)
    __obj.asInstanceOf[GetAutoscalingGroupsResult]
  }
}

