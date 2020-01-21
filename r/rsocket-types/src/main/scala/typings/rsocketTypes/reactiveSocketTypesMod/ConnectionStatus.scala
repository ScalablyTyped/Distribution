package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesStrings.CLOSED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTING
import typings.rsocketTypes.rsocketTypesStrings.ERROR
import typings.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rsocketTypes.AnonKind
  - typings.rsocketTypes.AnonCONNECTING
  - typings.rsocketTypes.AnonCONNECTED
  - typings.rsocketTypes.AnonCLOSED
  - typings.rsocketTypes.AnonERROR
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def AnonCONNECTED(kind: CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def AnonERROR(error: Error, kind: ERROR): ConnectionStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def AnonCLOSED(kind: CLOSED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def AnonCONNECTING(kind: CONNECTING): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def AnonKind(kind: NOT_CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
}

