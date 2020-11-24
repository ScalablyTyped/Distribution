package typings.sammy

import typings.sammy.Sammy.Application
import typings.sammy.Sammy.SammyFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  var log: js.Function = js.native
  
  def sammy(): Application = js.native
  def sammy(handler: js.Function): Application = js.native
  def sammy(selector: String): Application = js.native
  def sammy(selector: String, handler: js.Function): Application = js.native
  @JSName("sammy")
  var sammy_Original: SammyFunc = js.native
}
