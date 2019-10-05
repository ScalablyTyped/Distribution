package typings.atPulumiAws.ec2GetRouteTablesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.GetRouteTablesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTablesArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetRouteTablesFilter]] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired route tables.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The VPC ID that you want to filter from.
    */
  val vpcId: js.UndefOr[String] = js.undefined
}

object GetRouteTablesArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetRouteTablesFilter] = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
  ): GetRouteTablesArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetRouteTablesArgs]
  }
}

