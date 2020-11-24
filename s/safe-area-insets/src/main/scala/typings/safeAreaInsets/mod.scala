package typings.safeAreaInsets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("safe-area-insets", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val bottom: Double = js.native
  
  val left: Double = js.native
  
  def offChange(callback: js.Function): Unit = js.native
  @JSName("offChange")
  var offChange_Original: js.Function1[/* callback */ js.Function, Unit] = js.native
  
  def onChange(callback: js.Function): Unit = js.native
  @JSName("onChange")
  var onChange_Original: js.Function1[/* callback */ js.Function, Unit] = js.native
  
  val right: Double = js.native
  
  val support: Boolean = js.native
  
  val top: Double = js.native
}
