package typings.pulumiAws.getRouteTablesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetRouteTablesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteTablesArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetRouteTablesFilter]] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired route tables.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The VPC ID that you want to filter from.
    */
  val vpcId: js.UndefOr[String] = js.native
}

object GetRouteTablesArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetRouteTablesFilter] = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
  ): GetRouteTablesArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTablesArgs]
  }
}

