package typings.pulumiAws.getRouteTablesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetRouteTablesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteTablesResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetRouteTablesFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * A list of all the route table ids found. This data source will fail if none are found.
    */
  val ids: js.Array[String] = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: js.UndefOr[String] = js.native
}

object GetRouteTablesResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    tags: StringDictionary[js.Any],
    filters: js.Array[GetRouteTablesFilter] = null,
    vpcId: String = null
  ): GetRouteTablesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTablesResult]
  }
}

