package typings.rsocketTypes

import typings.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typings.rsocketTypes.rsocketTypesStrings.CONNECTING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCONNECTING extends ConnectionStatus {
  var kind: CONNECTING
}

object AnonCONNECTING {
  @scala.inline
  def apply(kind: CONNECTING): AnonCONNECTING = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCONNECTING]
  }
}

