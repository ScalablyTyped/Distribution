package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLLoseContext extends StObject {
  
  def loseContext(): Unit
  
  def restoreContext(): Unit
}
object WEBGLLoseContext {
  
  @scala.inline
  def apply(loseContext: () => Unit, restoreContext: () => Unit): WEBGLLoseContext = {
    val __obj = js.Dynamic.literal(loseContext = js.Any.fromFunction0(loseContext), restoreContext = js.Any.fromFunction0(restoreContext))
    __obj.asInstanceOf[WEBGLLoseContext]
  }
  
  @scala.inline
  implicit class WEBGLLoseContextMutableBuilder[Self <: WEBGLLoseContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoseContext(value: () => Unit): Self = StObject.set(x, "loseContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestoreContext(value: () => Unit): Self = StObject.set(x, "restoreContext", js.Any.fromFunction0(value))
  }
}
