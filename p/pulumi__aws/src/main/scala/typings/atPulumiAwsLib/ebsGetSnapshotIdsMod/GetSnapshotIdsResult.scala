package typings
package atPulumiAwsLib.ebsGetSnapshotIdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotIdsResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val ids: js.Array[java.lang.String]
}

object GetSnapshotIdsResult {
  @scala.inline
  def apply(id: java.lang.String, ids: js.Array[java.lang.String]): GetSnapshotIdsResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ids")(ids)
    __obj.asInstanceOf[GetSnapshotIdsResult]
  }
}

