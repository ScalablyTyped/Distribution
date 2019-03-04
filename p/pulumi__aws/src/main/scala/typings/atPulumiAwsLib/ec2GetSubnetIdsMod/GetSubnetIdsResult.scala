package typings
package atPulumiAwsLib.ec2GetSubnetIdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubnetIdsResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A list of all the subnet ids found. This data source will fail if none are found.
    */
  val ids: js.Array[java.lang.String]
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetSubnetIdsResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    ids: js.Array[java.lang.String],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): GetSubnetIdsResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids, tags = tags)
  
    __obj.asInstanceOf[GetSubnetIdsResult]
  }
}

