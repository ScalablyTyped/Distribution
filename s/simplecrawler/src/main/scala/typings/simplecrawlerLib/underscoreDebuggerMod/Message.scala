package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var seq: scala.Double
  var `type`: java.lang.String
}

object Message {
  @scala.inline
  def apply(seq: scala.Double, `type`: java.lang.String): Message = {
    val __obj = js.Dynamic.literal(seq = seq)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Message]
  }
}

