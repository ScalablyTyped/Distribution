package typings.atPulumiAws.ec2GetInstancesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesResult extends js.Object {
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * IDs of instances found through the filter
    */
  val ids: js.Array[String]
  val instanceStateNames: js.UndefOr[js.Array[String]] = js.undefined
  val instanceTags: StringDictionary[js.Any]
  /**
    * Private IP addresses of instances found through the filter
    */
  val privateIps: js.Array[String]
  /**
    * Public IP addresses of instances found through the filter
    */
  val publicIps: js.Array[String]
}

object GetInstancesResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    instanceTags: StringDictionary[js.Any],
    privateIps: js.Array[String],
    publicIps: js.Array[String],
    filters: js.Array[Anon_NameValues] = null,
    instanceStateNames: js.Array[String] = null
  ): GetInstancesResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids, instanceTags = instanceTags, privateIps = privateIps, publicIps = publicIps)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (instanceStateNames != null) __obj.updateDynamic("instanceStateNames")(instanceStateNames)
    __obj.asInstanceOf[GetInstancesResult]
  }
}

