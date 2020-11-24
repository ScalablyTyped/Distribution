package typings.rx.Rx.internals

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotImplementedError extends Error
object NotImplementedError {
  
  @scala.inline
  def apply(message: String, name: String): NotImplementedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotImplementedError]
  }
}
