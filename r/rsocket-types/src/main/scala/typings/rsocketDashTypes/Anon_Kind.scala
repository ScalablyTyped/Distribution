package typings.rsocketDashTypes

import typings.rsocketDashTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketDashTypes.rsocketDashTypesStrings.NOT_CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Kind extends ConnectionStatus {
  var kind: NOT_CONNECTED
}

object Anon_Kind {
  @scala.inline
  def apply(kind: NOT_CONNECTED): Anon_Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Kind]
  }
}

