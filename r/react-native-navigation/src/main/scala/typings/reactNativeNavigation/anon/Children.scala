package typings.reactNativeNavigation.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  var children: Requireable[ReactNodeLike] = js.native
  
  var label: Requireable[String] = js.native
  
  var onPeekIn: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onPeekOut: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onPress: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var onPressIn: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  
  var touchableComponent: Requireable[js.Function1[/* repeated */ _, _]] = js.native
}
object Children {
  
  @scala.inline
  def apply(
    children: Requireable[ReactNodeLike],
    label: Requireable[String],
    onPeekIn: Requireable[js.Function1[/* repeated */ _, _]],
    onPeekOut: Requireable[js.Function1[/* repeated */ _, _]],
    onPress: Requireable[js.Function1[/* repeated */ _, _]],
    onPressIn: Requireable[js.Function1[/* repeated */ _, _]],
    touchableComponent: Requireable[js.Function1[/* repeated */ _, _]]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onPeekIn = onPeekIn.asInstanceOf[js.Any], onPeekOut = onPeekOut.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], onPressIn = onPressIn.asInstanceOf[js.Any], touchableComponent = touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPeekIn(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onPeekIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPeekOut(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onPeekOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPress(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressIn(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchableComponent(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
  }
}
