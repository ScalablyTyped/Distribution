package typings.reactNativeNavigation.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var label: Requireable[String]
  
  var onPeekIn: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onPeekOut: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onPress: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onPressIn: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var touchableComponent: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object Children {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    label: Requireable[String],
    onPeekIn: Requireable[js.Function1[/* repeated */ Any, Any]],
    onPeekOut: Requireable[js.Function1[/* repeated */ Any, Any]],
    onPress: Requireable[js.Function1[/* repeated */ Any, Any]],
    onPressIn: Requireable[js.Function1[/* repeated */ Any, Any]],
    touchableComponent: Requireable[js.Function1[/* repeated */ Any, Any]]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onPeekIn = onPeekIn.asInstanceOf[js.Any], onPeekOut = onPeekOut.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], onPressIn = onPressIn.asInstanceOf[js.Any], touchableComponent = touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnPeekIn(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onPeekIn", value.asInstanceOf[js.Any])
    
    inline def setOnPeekOut(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onPeekOut", value.asInstanceOf[js.Any])
    
    inline def setOnPress(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    inline def setOnPressIn(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onPressIn", value.asInstanceOf[js.Any])
    
    inline def setTouchableComponent(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
  }
}
