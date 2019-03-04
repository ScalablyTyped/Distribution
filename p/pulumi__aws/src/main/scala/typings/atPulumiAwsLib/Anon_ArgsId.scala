package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsId extends js.Object {
  var args: js.Array[Anon_NameParam]
  var id: java.lang.String
  var lineNumber: js.UndefOr[scala.Double] = js.undefined
  var nodeType: java.lang.String
}

object Anon_ArgsId {
  @scala.inline
  def apply(
    args: js.Array[Anon_NameParam],
    id: java.lang.String,
    nodeType: java.lang.String,
    lineNumber: scala.Int | scala.Double = null
  ): Anon_ArgsId = {
    val __obj = js.Dynamic.literal(args = args, id = id, nodeType = nodeType)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgsId]
  }
}

