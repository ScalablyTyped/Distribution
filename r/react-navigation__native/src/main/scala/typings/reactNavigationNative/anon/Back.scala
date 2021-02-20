package typings.reactNavigationNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Back extends StObject {
  
  def back(): Unit = js.native
  
  def forward(): Unit = js.native
  
  def go(n: Double): Unit = js.native
  
  def pushState(state: js.Any, _underscore: String, path: String): Unit = js.native
  
  def replaceState(state: js.Any, _underscore: String, path: String): Unit = js.native
  
  val state: js.Any = js.native
}
object Back {
  
  @scala.inline
  def apply(
    back: () => Unit,
    forward: () => Unit,
    go: Double => Unit,
    pushState: (js.Any, String, String) => Unit,
    replaceState: (js.Any, String, String) => Unit,
    state: js.Any
  ): Back = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction0(back), forward = js.Any.fromFunction0(forward), go = js.Any.fromFunction1(go), pushState = js.Any.fromFunction3(pushState), replaceState = js.Any.fromFunction3(replaceState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
  
  @scala.inline
  implicit class BackMutableBuilder[Self <: Back] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBack(value: () => Unit): Self = StObject.set(x, "back", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForward(value: () => Unit): Self = StObject.set(x, "forward", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGo(value: Double => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPushState(value: (js.Any, String, String) => Unit): Self = StObject.set(x, "pushState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReplaceState(value: (js.Any, String, String) => Unit): Self = StObject.set(x, "replaceState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
