package typings.atPulumiAws.typesOutputMod.ebsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotIdsFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetSnapshotIdsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetSnapshotIdsFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetSnapshotIdsFilter]
  }
}

