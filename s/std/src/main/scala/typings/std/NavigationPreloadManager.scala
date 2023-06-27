package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager)
  */
trait NavigationPreloadManager extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/disable) */
  /* standard dom */
  def disable(): js.Promise[Unit]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/enable) */
  /* standard dom */
  def enable(): js.Promise[Unit]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/getState) */
  /* standard dom */
  def getState(): js.Promise[NavigationPreloadState]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/setHeaderValue) */
  /* standard dom */
  def setHeaderValue(value: java.lang.String): js.Promise[Unit]
}
object NavigationPreloadManager {
  
  inline def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getState: () => js.Promise[NavigationPreloadState],
    setHeaderValue: java.lang.String => js.Promise[Unit]
  ): NavigationPreloadManager = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getState = js.Any.fromFunction0(getState), setHeaderValue = js.Any.fromFunction1(setHeaderValue))
    __obj.asInstanceOf[NavigationPreloadManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationPreloadManager] (val x: Self) extends AnyVal {
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetState(value: () => js.Promise[NavigationPreloadState]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSetHeaderValue(value: java.lang.String => js.Promise[Unit]): Self = StObject.set(x, "setHeaderValue", js.Any.fromFunction1(value))
  }
}
