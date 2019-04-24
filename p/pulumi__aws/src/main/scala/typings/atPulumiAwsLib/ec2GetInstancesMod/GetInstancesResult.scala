package typings
package atPulumiAwsLib.ec2GetInstancesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesResult extends js.Object {
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * IDs of instances found through the filter
    */
  val ids: js.Array[java.lang.String]
  val instanceStateNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
    publicIps: js.Array[java.lang.String],
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    instanceStateNames: js.Array[java.lang.String] = null
  ): GetInstancesResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids, instanceTags = instanceTags, privateIps = privateIps, publicIps = publicIps)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (instanceStateNames != null) __obj.updateDynamic("instanceStateNames")(instanceStateNames)
    __obj.asInstanceOf[GetInstancesResult]
  }
}

