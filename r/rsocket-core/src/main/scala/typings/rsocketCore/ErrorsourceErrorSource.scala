package typings.rsocketCore

import typings.rsocketCore.rsocketframeMod.ErrorSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  source  :rsocket-core.rsocket-core/RSocketFrame.ErrorSource} */
trait ErrorsourceErrorSource extends js.Object {
  var message: String
  var name: String
  var source: ErrorSource
  var stack: js.UndefOr[String] = js.undefined
}

object ErrorsourceErrorSource {
  @scala.inline
  def apply(message: String, name: String, source: ErrorSource, stack: String = null): ErrorsourceErrorSource = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorsourceErrorSource]
  }
}

