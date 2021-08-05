package typings.reactNativeTabView.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  route :any} */
trait SceneRendererPropsroutean extends StObject {
  
  def jumpTo(key: String): Unit
  
  var layout: typings.reactNativeTabView.typesMod.Layout
  
  var position: Node
  
  var route: js.Any
}
object SceneRendererPropsroutean {
  
  inline def apply(
    jumpTo: String => Unit,
    layout: typings.reactNativeTabView.typesMod.Layout,
    position: Node,
    route: js.Any
  ): SceneRendererPropsroutean = {
    val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneRendererPropsroutean]
  }
  
  extension [Self <: SceneRendererPropsroutean](x: Self) {
    
    inline def setJumpTo(value: String => Unit): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
    
    inline def setLayout(value: typings.reactNativeTabView.typesMod.Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Node): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: js.Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
