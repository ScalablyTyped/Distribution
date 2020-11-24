package typings.reactNativeToastNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastNative extends js.Object {
  
  var BOTTOM: js.Any = js.native
  
  var CENTER: js.Any = js.native
  
  var LONG: js.Any = js.native
  
  // Toast duration constants
  var SHORT: js.Any = js.native
  
  // Toast gravity constants
  var TOP: js.Any = js.native
  
  def show(): Unit = js.native
  def show(message: String): Unit = js.native
  def show(message: String, duration: js.Any, position: js.Any, styles: Style): Unit = js.native
}
