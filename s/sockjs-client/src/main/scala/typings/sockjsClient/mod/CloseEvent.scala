package typings.sockjsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseEvent extends BaseEvent {
  
  var code: Double = js.native
  
  var reason: String = js.native
  
  var wasClean: Boolean = js.native
}
