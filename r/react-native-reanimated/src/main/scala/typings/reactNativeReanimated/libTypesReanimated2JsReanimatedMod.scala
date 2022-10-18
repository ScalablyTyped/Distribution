package typings.reactNativeReanimated

import typings.reactNativeReanimated.anon.Component
import typings.reactNativeReanimated.anon.SetAttribute
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.StyleProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2JsReanimatedMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated", JSImport.Default)
  @js.native
  val default: typings.reactNativeReanimated.libTypesReanimated2JsReanimatedJsreanimatedMod.default = js.native
  
  inline def updatePropsJS(updates: AnimatedStyle, viewRef: Component): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_updatePropsJS")(updates.asInstanceOf[js.Any], viewRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updatePropsJS(updates: StyleProps, viewRef: Component): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_updatePropsJS")(updates.asInstanceOf[js.Any], viewRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait JSReanimatedComponent extends StObject {
    
    var _touchableNode: SetAttribute
    
    var previousStyle: StyleProps
    
    var props: Record[String, String | Double]
    
    def setNativeProps(style: StyleProps): Unit
  }
  object JSReanimatedComponent {
    
    inline def apply(
      _touchableNode: SetAttribute,
      previousStyle: StyleProps,
      props: Record[String, String | Double],
      setNativeProps: StyleProps => Unit
    ): JSReanimatedComponent = {
      val __obj = js.Dynamic.literal(_touchableNode = _touchableNode.asInstanceOf[js.Any], previousStyle = previousStyle.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], setNativeProps = js.Any.fromFunction1(setNativeProps))
      __obj.asInstanceOf[JSReanimatedComponent]
    }
    
    extension [Self <: JSReanimatedComponent](x: Self) {
      
      inline def setPreviousStyle(value: StyleProps): Self = StObject.set(x, "previousStyle", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, String | Double]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setSetNativeProps(value: StyleProps => Unit): Self = StObject.set(x, "setNativeProps", js.Any.fromFunction1(value))
      
      inline def set_touchableNode(value: SetAttribute): Self = StObject.set(x, "_touchableNode", value.asInstanceOf[js.Any])
    }
  }
}
