package typings
package atPulumiAwsLib.ec2GetRouteTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTablesResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A list of all the route table ids found. This data source will fail if none are found.
    */
  val ids: js.Array[java.lang.String]
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetRouteTablesResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    ids: js.Array[java.lang.String],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): GetRouteTablesResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ids")(ids)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetRouteTablesResult]
  }
}

