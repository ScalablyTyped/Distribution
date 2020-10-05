package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipboardStatic extends js.Object {
  def getString(): js.Promise[String] = js.native
  def setString(content: String): Unit = js.native
}

object ClipboardStatic {
  @scala.inline
  def apply(getString: () => js.Promise[String], setString: String => Unit): ClipboardStatic = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[ClipboardStatic]
  }
  @scala.inline
  implicit class ClipboardStaticOps[Self <: ClipboardStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetString(value: () => js.Promise[String]): Self = this.set("getString", js.Any.fromFunction0(value))
    @scala.inline
    def setSetString(value: String => Unit): Self = this.set("setString", js.Any.fromFunction1(value))
  }
  
}

