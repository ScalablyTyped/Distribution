package typings.rsocketTypes

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.ERROR
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends ConnectionStatus {
  var error: Error
  var kind: ERROR
}

object AnonError {
  @scala.inline
  def apply(error: Error, kind: ERROR): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonError]
  }
}

