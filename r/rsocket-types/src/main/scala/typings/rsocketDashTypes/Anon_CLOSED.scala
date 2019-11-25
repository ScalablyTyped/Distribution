package typings.rsocketDashTypes

import typings.rsocketDashTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketDashTypes.rsocketDashTypesStrings.CLOSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CLOSED extends ConnectionStatus {
  var kind: CLOSED
}

object Anon_CLOSED {
  @scala.inline
  def apply(kind: CLOSED): Anon_CLOSED = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CLOSED]
  }
}

