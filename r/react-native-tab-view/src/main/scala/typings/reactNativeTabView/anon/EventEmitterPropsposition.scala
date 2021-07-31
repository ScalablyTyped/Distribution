package typings.reactNativeTabView.anon

import typings.react.mod.ReactNode
import typings.reactNativeTabView.reactNativeTabViewStrings.enter
import typings.reactNativeTabView.typesMod.Listener
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  position :std.Node, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void} */
trait EventEmitterPropsposition extends StObject {
  
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit
  
  def jumpTo(key: String): Unit
  
  var position: Node
  
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit
  
  def render(children: ReactNode): ReactNode
}
object EventEmitterPropsposition {
  
  @scala.inline
  def apply(
    addListener: (enter, Listener) => Unit,
    jumpTo: String => Unit,
    position: Node,
    removeListener: (enter, Listener) => Unit,
    render: ReactNode => ReactNode
  ): EventEmitterPropsposition = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), jumpTo = js.Any.fromFunction1(jumpTo), position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction2(removeListener), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[EventEmitterPropsposition]
  }
  
  @scala.inline
  implicit class EventEmitterPropspositionMutableBuilder[Self <: EventEmitterPropsposition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddListener(value: (enter, Listener) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setJumpTo(value: String => Unit): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPosition(value: Node): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveListener(value: (enter, Listener) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRender(value: ReactNode => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
