package typings.realpathNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("realpath-native", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(filepath: String): String = js.native
  
  var sync: js.Function1[/* filepath */ String, String] = js.native
}
