package typings
package atPulumiAwsLib.ec2GetRouteTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTablesResult extends js.Object {
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A list of all the route table ids found. This data source will fail if none are found.
    */
  val ids: js.Array[java.lang.String]
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
}

object GetRouteTablesResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    ids: js.Array[java.lang.String],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    vpcId: java.lang.String = null
  ): GetRouteTablesResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetRouteTablesResult]
  }
}

