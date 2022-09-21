package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLLoseContext extends StObject {
  
  /* standard dom */
  def loseContext(): Unit
  
  /* standard dom */
  def restoreContext(): Unit
}
object WEBGLLoseContext {
  
  inline def apply(loseContext: () => Unit, restoreContext: () => Unit): WEBGLLoseContext = {
    val __obj = js.Dynamic.literal(loseContext = js.Any.fromFunction0(loseContext), restoreContext = js.Any.fromFunction0(restoreContext))
    __obj.asInstanceOf[WEBGLLoseContext]
  }
  
  extension [Self <: WEBGLLoseContext](x: Self) {
    
    inline def setLoseContext(value: () => Unit): Self = StObject.set(x, "loseContext", js.Any.fromFunction0(value))
    
    inline def setRestoreContext(value: () => Unit): Self = StObject.set(x, "restoreContext", js.Any.fromFunction0(value))
  }
}
