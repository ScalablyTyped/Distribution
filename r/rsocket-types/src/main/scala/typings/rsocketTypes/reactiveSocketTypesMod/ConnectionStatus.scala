package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesStrings.CLOSED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTING
import typings.rsocketTypes.rsocketTypesStrings.ERROR
import typings.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rsocketTypes.anon.Kind
  - typings.rsocketTypes.anon.`0`
  - typings.rsocketTypes.anon.`1`
  - typings.rsocketTypes.anon.`2`
  - typings.rsocketTypes.anon.Error
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def Kind(kind: NOT_CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def `1`(kind: CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def `0`(kind: CONNECTING): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def `2`(kind: CLOSED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Error(error: typings.std.Error, kind: ERROR): ConnectionStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
}

