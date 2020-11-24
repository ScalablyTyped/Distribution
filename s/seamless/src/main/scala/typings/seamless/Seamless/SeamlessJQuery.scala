package typings.seamless.Seamless

import typings.seamless.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeamlessJQuery extends JQuery {
  
  var connection: Connection = js.native
  
  def receive(callback: Callback): Unit = js.native
  def receive(`type`: String, callback: Callback): Unit = js.native
  
  def seamless_error(data: js.Any, event: js.Any): Unit = js.native
  
  var seamless_options: Options = js.native
  
  def seamless_ready(data: js.Any, event: js.Any): Unit = js.native
  
  def seamless_update(data: js.Any, event: js.Any): js.Any = js.native
  
  def send(data: js.Any): Unit = js.native
}
