package typings.rsocketTypes

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CLOSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCLOSED extends ConnectionStatus {
  var kind: CLOSED
}

object AnonCLOSED {
  @scala.inline
  def apply(kind: CLOSED): AnonCLOSED = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCLOSED]
  }
}

