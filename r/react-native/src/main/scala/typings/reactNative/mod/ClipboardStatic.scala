package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardStatic extends js.Object {
  def getString(): js.Promise[String]
  def setString(content: String): Unit
}

object ClipboardStatic {
  @scala.inline
  def apply(getString: () => js.Promise[String], setString: String => Unit): ClipboardStatic = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[ClipboardStatic]
  }
}

