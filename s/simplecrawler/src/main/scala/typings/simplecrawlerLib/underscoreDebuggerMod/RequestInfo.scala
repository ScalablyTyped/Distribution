package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  var arguments: js.Any
  var command: java.lang.String
}

object RequestInfo {
  @scala.inline
  def apply(arguments: js.Any, command: java.lang.String): RequestInfo = {
    val __obj = js.Dynamic.literal(arguments = arguments, command = command)
  
    __obj.asInstanceOf[RequestInfo]
  }
}

