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
  - typings.rsocketTypes.Anon0
  - typings.rsocketTypes.Anon1
  - typings.rsocketTypes.Anon2
  - typings.rsocketTypes.AnonError
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def AnonError(error: Error, kind: ERROR): ConnectionStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon1(kind: CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon2(kind: CLOSED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon0(kind: CONNECTING): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def AnonKind(kind: NOT_CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
}

