package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsId extends js.Object {
  var args: js.Array[Anon_NameParam]
  var id: String
  var lineNumber: js.UndefOr[Double] = js.undefined
  var nodeType: String
}

object Anon_ArgsId {
  @scala.inline
  def apply(args: js.Array[Anon_NameParam], id: String, nodeType: String, lineNumber: Int | Double = null): Anon_ArgsId = {
    val __obj = js.Dynamic.literal(args = args, id = id, nodeType = nodeType)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgsId]
  }
}

