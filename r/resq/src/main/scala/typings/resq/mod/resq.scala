package typings.resq.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("resq", "resq$")
@js.native
object resq extends js.Object {
  
  def apply(selector: String): RESQNode = js.native
  def apply(selector: String, element: HTMLElement): RESQNode = js.native
}
