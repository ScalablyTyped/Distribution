package typings.sammy.global.Sammy

import typings.sammy.Sammy.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sammy")
@js.native
object ^ extends js.Object {
  
  def apply(): Application = js.native
  def apply(handler: js.Function): Application = js.native
  def apply(selector: String): Application = js.native
  def apply(selector: String, handler: js.Function): Application = js.native
  
  var DataLocationProxy: typings.sammy.Sammy.DataLocationProxy = js.native
  
  var FormBuilder: typings.sammy.Sammy.FormBuilder = js.native
  
  var Store: typings.sammy.Sammy.Store = js.native
}
