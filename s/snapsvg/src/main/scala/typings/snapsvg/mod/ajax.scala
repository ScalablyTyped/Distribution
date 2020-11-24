package typings.snapsvg.mod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snapsvg", "ajax")
@js.native
object ajax extends js.Object {
  
  def apply(url: String, callback: js.Function): XMLHttpRequest = js.native
  def apply(url: String, callback: js.Function, scope: js.Object): XMLHttpRequest = js.native
  def apply(url: String, postData: String, callback: js.Function): XMLHttpRequest = js.native
  def apply(url: String, postData: String, callback: js.Function, scope: js.Object): XMLHttpRequest = js.native
  def apply(url: String, postData: js.Object, callback: js.Function): XMLHttpRequest = js.native
  def apply(url: String, postData: js.Object, callback: js.Function, scope: js.Object): XMLHttpRequest = js.native
}
