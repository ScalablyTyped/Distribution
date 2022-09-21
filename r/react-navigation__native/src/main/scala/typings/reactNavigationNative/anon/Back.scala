package typings.reactNavigationNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Back extends StObject {
  
  def back(): Unit
  
  def forward(): Unit
  
  def go(n: Double): Unit
  
  def pushState(state: Any, _underscore: String, path: String): Unit
  
  def replaceState(state: Any, _underscore: String, path: String): Unit
  
  val state: Any
}
object Back {
  
  inline def apply(
    back: () => Unit,
    forward: () => Unit,
    go: Double => Unit,
    pushState: (Any, String, String) => Unit,
    replaceState: (Any, String, String) => Unit,
    state: Any
  ): Back = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction0(back), forward = js.Any.fromFunction0(forward), go = js.Any.fromFunction1(go), pushState = js.Any.fromFunction3(pushState), replaceState = js.Any.fromFunction3(replaceState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
  
  extension [Self <: Back](x: Self) {
    
    inline def setBack(value: () => Unit): Self = StObject.set(x, "back", js.Any.fromFunction0(value))
    
    inline def setForward(value: () => Unit): Self = StObject.set(x, "forward", js.Any.fromFunction0(value))
    
    inline def setGo(value: Double => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
    
    inline def setPushState(value: (Any, String, String) => Unit): Self = StObject.set(x, "pushState", js.Any.fromFunction3(value))
    
    inline def setReplaceState(value: (Any, String, String) => Unit): Self = StObject.set(x, "replaceState", js.Any.fromFunction3(value))
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
