package typings.socketclusterDashServer.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCCodecEngine extends js.Object {
  def decode(input: js.Any): js.Any
  def encode(`object`: js.Any): js.Any
}

object SCCodecEngine {
  @scala.inline
  def apply(decode: js.Any => js.Any, encode: js.Any => js.Any): SCCodecEngine = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[SCCodecEngine]
  }
}

