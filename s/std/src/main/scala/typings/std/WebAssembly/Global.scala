package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Global extends _ExportValue {
  var value: js.Any
}

object Global {
  @scala.inline
  def apply(value: js.Any): Global = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
}

