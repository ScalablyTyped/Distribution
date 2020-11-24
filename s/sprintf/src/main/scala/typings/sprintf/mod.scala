package typings.sprintf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sprintf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def sprintf(fmt: String, args: js.Any*): String = js.native
  
  def vsprintf(fmt: String, args: js.Array[_]): String = js.native
}
