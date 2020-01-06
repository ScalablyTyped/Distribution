package typings.atPulumiAws.typesInputMod.ebs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotIdsFilter extends js.Object {
  var name: String = js.native
  var values: js.Array[String] = js.native
}

object GetSnapshotIdsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetSnapshotIdsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSnapshotIdsFilter]
  }
}

