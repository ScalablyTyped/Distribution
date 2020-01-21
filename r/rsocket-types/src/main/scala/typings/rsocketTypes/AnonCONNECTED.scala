package typings.rsocketTypes

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONNECTED extends ConnectionStatus {
  var kind: CONNECTED
}

object AnonCONNECTED {
  @scala.inline
  def apply(kind: CONNECTED): AnonCONNECTED = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCONNECTED]
  }
}

