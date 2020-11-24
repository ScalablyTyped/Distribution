package typings.sockjsClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CLOSED = typings.sockjsClient.sockjsClientNumbers.`3`
  
  type CLOSING = typings.sockjsClient.sockjsClientNumbers.`2`
  
  type CONNECTING = typings.sockjsClient.sockjsClientNumbers.`0`
  
  type OPEN = typings.sockjsClient.sockjsClientNumbers.`1`
  
  type OpenEvent = typings.sockjsClient.mod.BaseEvent
  
  type SessionGenerator = js.Function0[java.lang.String]
  
  type State = typings.sockjsClient.mod.CONNECTING | typings.sockjsClient.mod.OPEN | typings.sockjsClient.mod.CLOSING | typings.sockjsClient.mod.CLOSED
}
