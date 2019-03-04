package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardStatic extends js.Object {
  def getString(): js.Promise[java.lang.String]
  def setString(content: java.lang.String): scala.Unit
}

object ClipboardStatic {
  @scala.inline
  def apply(
    getString: js.Function0[js.Promise[java.lang.String]],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): ClipboardStatic = {
    val __obj = js.Dynamic.literal(getString = getString, setString = setString)
  
    __obj.asInstanceOf[ClipboardStatic]
  }
}

