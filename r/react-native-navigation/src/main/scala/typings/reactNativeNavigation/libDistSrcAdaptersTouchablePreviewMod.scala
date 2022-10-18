package typings.reactNativeNavigation

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.NativeTouchEvent
import typings.reactNative.mod.TouchableHighlight
import typings.reactNative.mod.TouchableNativeFeedback
import typings.reactNative.mod.TouchableOpacity
import typings.reactNative.mod.TouchableWithoutFeedback
import typings.reactNativeNavigation.anon.Children
import typings.reactNativeNavigation.anon.ReactTag
import typings.reactNativeNavigation.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcAdaptersTouchablePreviewMod {
  
  @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview")
  @js.native
  open class TouchablePreview protected ()
    extends PureComponent[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
    
    def onPress(): Unit = js.native
    
    def onPressIn(): Unit | Null = js.native
    
    /* private */ var onRef: Any = js.native
    
    def onTouchEnd(): Unit = js.native
    
    def onTouchMove(event: GestureResponderEventWithForce): Unit = js.native
    
    def onTouchStart(event: GestureResponderEvent): Unit = js.native
    
    /* private */ var timeout: Any = js.native
    
    /* private */ var touchStartedAt: Any = js.native
  }
  /* static members */
  object TouchablePreview {
    
    @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview.defaultProps")
    @js.native
    def defaultProps: `0` = js.native
    inline def defaultProps_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview.peeking")
    @js.native
    def peeking: Boolean = js.native
    inline def peeking_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peeking")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-navigation/lib/dist/src/adapters/TouchablePreview", "TouchablePreview.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type GestureResponderEventWithForce = NativeSyntheticEvent[NativeTouchEventWithForce]
  
  trait NativeTouchEventWithForce
    extends StObject
       with NativeTouchEvent {
    
    @JSName("force")
    var force_NativeTouchEventWithForce: Double
  }
  object NativeTouchEventWithForce {
    
    inline def apply(
      changedTouches: js.Array[NativeTouchEvent],
      force: Double,
      identifier: String,
      locationX: Double,
      locationY: Double,
      pageX: Double,
      pageY: Double,
      target: String,
      timestamp: Double,
      touches: js.Array[NativeTouchEvent]
    ): NativeTouchEventWithForce = {
      val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], locationX = locationX.asInstanceOf[js.Any], locationY = locationY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeTouchEventWithForce]
    }
    
    extension [Self <: NativeTouchEventWithForce](x: Self) {
      
      inline def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onPeekIn: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPeekOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function1[/* payload */ ReactTag, Unit]] = js.undefined
    
    var touchableComponent: js.UndefOr[
        TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | ReactNode
      ] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnPeekIn(value: () => Unit): Self = StObject.set(x, "onPeekIn", js.Any.fromFunction0(value))
      
      inline def setOnPeekInUndefined: Self = StObject.set(x, "onPeekIn", js.undefined)
      
      inline def setOnPeekOut(value: () => Unit): Self = StObject.set(x, "onPeekOut", js.Any.fromFunction0(value))
      
      inline def setOnPeekOutUndefined: Self = StObject.set(x, "onPeekOut", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressIn(value: /* payload */ ReactTag => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setTouchableComponent(
        value: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | ReactNode
      ): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
      
      inline def setTouchableComponentUndefined: Self = StObject.set(x, "touchableComponent", js.undefined)
    }
  }
}
