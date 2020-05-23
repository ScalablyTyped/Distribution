package typings.rsocketTypes.anon

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends ConnectionStatus {
  var error: typings.std.Error
  var kind: ERROR
}

object Error {
  @scala.inline
  def apply(error: typings.std.Error, kind: ERROR): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

