package typings.pulumiAws.outputMod.ebs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotFilter extends js.Object {
  var name: String = js.native
  var values: js.Array[String] = js.native
}

object GetSnapshotFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetSnapshotFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSnapshotFilter]
  }
}

