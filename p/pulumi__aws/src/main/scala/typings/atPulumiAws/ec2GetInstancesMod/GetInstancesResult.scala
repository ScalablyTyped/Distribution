package typings.atPulumiAws.ec2GetInstancesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetInstancesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetInstancesFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * IDs of instances found through the filter
    */
  val ids: js.Array[String] = js.native
  val instanceStateNames: js.UndefOr[js.Array[String]] = js.native
  val instanceTags: StringDictionary[js.Any] = js.native
  /**
    * Private IP addresses of instances found through the filter
    */
  val privateIps: js.Array[String] = js.native
  /**
    * Public IP addresses of instances found through the filter
    */
  val publicIps: js.Array[String] = js.native
}

object GetInstancesResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    instanceTags: StringDictionary[js.Any],
    privateIps: js.Array[String],
    publicIps: js.Array[String],
    filters: js.Array[GetInstancesFilter] = null,
    instanceStateNames: js.Array[String] = null
  ): GetInstancesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], instanceTags = instanceTags.asInstanceOf[js.Any], privateIps = privateIps.asInstanceOf[js.Any], publicIps = publicIps.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (instanceStateNames != null) __obj.updateDynamic("instanceStateNames")(instanceStateNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancesResult]
  }
}

