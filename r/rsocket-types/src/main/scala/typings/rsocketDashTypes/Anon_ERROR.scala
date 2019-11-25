package typings.rsocketDashTypes

import typings.rsocketDashTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketDashTypes.rsocketDashTypesStrings.ERROR
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ERROR extends ConnectionStatus {
  var error: Error
  var kind: ERROR
}

object Anon_ERROR {
  @scala.inline
  def apply(error: Error, kind: ERROR): Anon_ERROR = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ERROR]
  }
}

