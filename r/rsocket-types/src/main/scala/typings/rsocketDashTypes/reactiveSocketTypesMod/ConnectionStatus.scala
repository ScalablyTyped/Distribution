package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesStrings.CLOSED
import typings.rsocketDashTypes.rsocketDashTypesStrings.CONNECTED
import typings.rsocketDashTypes.rsocketDashTypesStrings.CONNECTING
import typings.rsocketDashTypes.rsocketDashTypesStrings.ERROR
import typings.rsocketDashTypes.rsocketDashTypesStrings.NOT_CONNECTED
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rsocketDashTypes.Anon_Kind
  - typings.rsocketDashTypes.Anon_CONNECTING
  - typings.rsocketDashTypes.Anon_CONNECTED
  - typings.rsocketDashTypes.Anon_CLOSED
  - typings.rsocketDashTypes.Anon_ERROR
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def Anon_ERROR(error: Error, kind: ERROR): ConnectionStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon_CLOSED(kind: CLOSED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon_CONNECTED(kind: CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon_Kind(kind: NOT_CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon_CONNECTING(kind: CONNECTING): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
}

