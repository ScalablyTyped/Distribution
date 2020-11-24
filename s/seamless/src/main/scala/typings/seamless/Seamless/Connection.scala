package typings.seamless.Seamless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  var active: Boolean = js.native
  
  var id: Double = js.native
  
  var queue: js.Array[_] = js.native
  
  def receive(callback: Callback): Unit = js.native
  def receive(`type`: String, callback: Callback): Unit = js.native
  
  def send(data: js.Any): Unit = js.native
  
  def setActive(active: Boolean): Unit = js.native
  
  var target: String = js.native
  
  var url: String = js.native
}
