package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_lose_context) */
trait WEBGLLoseContext extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_lose_context/loseContext) */
  /* standard dom */
  def loseContext(): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_lose_context/restoreContext) */
  /* standard dom */
  def restoreContext(): Unit
}
object WEBGLLoseContext {
  
  inline def apply(loseContext: () => Unit, restoreContext: () => Unit): WEBGLLoseContext = {
    val __obj = js.Dynamic.literal(loseContext = js.Any.fromFunction0(loseContext), restoreContext = js.Any.fromFunction0(restoreContext))
    __obj.asInstanceOf[WEBGLLoseContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WEBGLLoseContext] (val x: Self) extends AnyVal {
    
    inline def setLoseContext(value: () => Unit): Self = StObject.set(x, "loseContext", js.Any.fromFunction0(value))
    
    inline def setRestoreContext(value: () => Unit): Self = StObject.set(x, "restoreContext", js.Any.fromFunction0(value))
  }
}
