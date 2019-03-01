package typings
package atPulumiAwsLib.ec2GetInstancesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * IDs of instances found through the filter
    */
  val ids: js.Array[java.lang.String]
  val instanceTags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Private IP addresses of instances found through the filter
    */
  val privateIps: js.Array[java.lang.String]
  /**
    * Public IP addresses of instances found through the filter
    */
  val publicIps: js.Array[java.lang.String]
}

object GetInstancesResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    ids: js.Array[java.lang.String],
    instanceTags: org.scalablytyped.runtime.StringDictionary[js.Any],
    privateIps: js.Array[java.lang.String],
    publicIps: js.Array[java.lang.String]
  ): GetInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ids")(ids)
    __obj.updateDynamic("instanceTags")(instanceTags)
    __obj.updateDynamic("privateIps")(privateIps)
    __obj.updateDynamic("publicIps")(publicIps)
    __obj.asInstanceOf[GetInstancesResult]
  }
}

