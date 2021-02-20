package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipboardStatic extends StObject {
  
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
  implicit class ClipboardStaticMutableBuilder[Self <: ClipboardStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetString(value: () => js.Promise[String]): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
  }
}
