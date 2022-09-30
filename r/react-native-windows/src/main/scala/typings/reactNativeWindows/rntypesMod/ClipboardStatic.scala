package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardStatic extends StObject {
  
  def getString(): js.Promise[String]
  
  def setString(content: String): Unit
}
object ClipboardStatic {
  
  inline def apply(getString: () => js.Promise[String], setString: String => Unit): ClipboardStatic = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[ClipboardStatic]
  }
  
  extension [Self <: ClipboardStatic](x: Self) {
    
    inline def setGetString(value: () => js.Promise[String]): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    inline def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
  }
}
