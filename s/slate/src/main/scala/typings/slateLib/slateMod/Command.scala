package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var args: js.Array[_]
  var `type`: java.lang.String
}

object Command {
  @scala.inline
  def apply(args: js.Array[_], `type`: java.lang.String): Command = {
    val __obj = js.Dynamic.literal(args = args)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Command]
  }
}

