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
  def apply(getString: () => js.Promise[java.lang.String], setString: java.lang.String => scala.Unit): ClipboardStatic = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[ClipboardStatic]
  }
}

