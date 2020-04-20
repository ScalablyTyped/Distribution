package typings.socketclusterServer.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodecEngine extends js.Object {
  def decode(input: js.Any): js.Any
  def encode(`object`: js.Any): js.Any
}

object CodecEngine {
  @scala.inline
  def apply(decode: js.Any => js.Any, encode: js.Any => js.Any): CodecEngine = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[CodecEngine]
  }
}

