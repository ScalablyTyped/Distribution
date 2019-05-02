package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends Message
     with RequestInfo

object Request {
  @scala.inline
  def apply(arguments: js.Any, command: java.lang.String, seq: scala.Double, `type`: java.lang.String): Request = {
    val __obj = js.Dynamic.literal(arguments = arguments, command = command, seq = seq)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Request]
  }
}

