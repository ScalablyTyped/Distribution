package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packet extends js.Object {
  var body: Message
  var headers: js.Array[java.lang.String]
  var raw: java.lang.String
}

object Packet {
  @scala.inline
  def apply(body: Message, headers: js.Array[java.lang.String], raw: java.lang.String): Packet = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, raw = raw)
  
    __obj.asInstanceOf[Packet]
  }
}

