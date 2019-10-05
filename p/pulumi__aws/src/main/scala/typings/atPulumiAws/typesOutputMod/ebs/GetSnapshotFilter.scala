package typings.atPulumiAws.typesOutputMod.ebs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetSnapshotFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetSnapshotFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetSnapshotFilter]
  }
}

