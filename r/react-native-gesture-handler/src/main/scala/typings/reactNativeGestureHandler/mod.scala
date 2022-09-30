package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardedRef
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.RefreshControlProps
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.SwitchProps
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.anon.ActiveOpacity
import typings.reactNativeGestureHandler.anon.Borderless
import typings.reactNativeGestureHandler.anon.DelayLongPress
import typings.reactNativeGestureHandler.anon.DrawerLayoutAndroidPropsc
import typings.reactNativeGestureHandler.anon.DrawerLockMode
import typings.reactNativeGestureHandler.anon.Friction
import typings.reactNativeGestureHandler.anon.Left
import typings.reactNativeGestureHandler.anon.ReadonlyNativeViewGesture
import typings.reactNativeGestureHandler.anon.TypeofForceTouchFallback
import typings.reactNativeGestureHandler.drawerLayoutMod.DrawerLayoutProps
import typings.reactNativeGestureHandler.drawerLayoutMod.default
import typings.reactNativeGestureHandler.flingGestureHandlerMod.FlingGestureHandlerProps_
import typings.reactNativeGestureHandler.flingGestureMod.FlingGesture
import typings.reactNativeGestureHandler.forceTouchGestureHandlerMod.ForceTouchFallback
import typings.reactNativeGestureHandler.forceTouchGestureHandlerMod.ForceTouchGestureHandlerProps_
import typings.reactNativeGestureHandler.forceTouchGestureMod.ForceTouchGesture
import typings.reactNativeGestureHandler.gestureButtonsMod.BaseButtonProps
import typings.reactNativeGestureHandler.gestureButtonsMod.BorderlessButtonProps
import typings.reactNativeGestureHandler.gestureButtonsMod.RawButtonProps
import typings.reactNativeGestureHandler.gestureButtonsMod.RectButtonProps
import typings.reactNativeGestureHandler.gestureCompositionMod.ComposedGesture
import typings.reactNativeGestureHandler.gestureCompositionMod.ExclusiveGesture
import typings.reactNativeGestureHandler.gestureCompositionMod.SimultaneousGesture
import typings.reactNativeGestureHandler.gestureDetectorMod.GestureDetectorProps
import typings.reactNativeGestureHandler.gestureHandlerRootViewMod.GestureHandlerRootViewProps
import typings.reactNativeGestureHandler.longPressGestureHandlerMod.LongPressGestureHandlerProps_
import typings.reactNativeGestureHandler.longPressGestureMod.LongPressGesture
import typings.reactNativeGestureHandler.manualGestureMod.ManualGesture
import typings.reactNativeGestureHandler.nativeGestureMod.NativeGesture
import typings.reactNativeGestureHandler.nativeViewGestureHandlerMod.NativeViewGestureHandlerProps_
import typings.reactNativeGestureHandler.panGestureHandlerMod.PanGestureHandlerProps_
import typings.reactNativeGestureHandler.panGestureMod.PanGesture
import typings.reactNativeGestureHandler.pinchGestureHandlerMod.PinchGestureHandlerProps
import typings.reactNativeGestureHandler.pinchGestureMod.PinchGesture
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`0`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`2`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`3`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`4`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`5`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`8`
import typings.reactNativeGestureHandler.rotationGestureHandlerMod.RotationGestureHandlerProps
import typings.reactNativeGestureHandler.rotationGestureMod.RotationGesture
import typings.reactNativeGestureHandler.swipeableMod.SwipeableProps
import typings.reactNativeGestureHandler.tapGestureHandlerMod.TapGestureHandlerProps_
import typings.reactNativeGestureHandler.tapGestureMod.TapGesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-gesture-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-gesture-handler", "BaseButton")
  @js.native
  open class BaseButton protected ()
    extends typings.reactNativeGestureHandler.gestureButtonsMod.BaseButton {
    def this(props: BaseButtonProps) = this()
  }
  /* static members */
  object BaseButton {
    
    @JSImport("react-native-gesture-handler", "BaseButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler", "BaseButton.defaultProps")
    @js.native
    def defaultProps: DelayLongPress = js.native
    inline def defaultProps_=(x: DelayLongPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-gesture-handler", "BorderlessButton")
  @js.native
  open class BorderlessButton protected ()
    extends typings.reactNativeGestureHandler.gestureButtonsMod.BorderlessButton {
    def this(props: BorderlessButtonProps) = this()
  }
  /* static members */
  object BorderlessButton {
    
    @JSImport("react-native-gesture-handler", "BorderlessButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler", "BorderlessButton.defaultProps")
    @js.native
    def defaultProps: Borderless = js.native
    inline def defaultProps_=(x: Borderless): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object Directions {
    
    @JSImport("react-native-gesture-handler", "Directions.DOWN")
    @js.native
    val DOWN: `8` = js.native
    
    @JSImport("react-native-gesture-handler", "Directions.LEFT")
    @js.native
    val LEFT: `2` = js.native
    
    @JSImport("react-native-gesture-handler", "Directions.RIGHT")
    @js.native
    val RIGHT: `1` = js.native
    
    @JSImport("react-native-gesture-handler", "Directions.UP")
    @js.native
    val UP: `4` = js.native
  }
  
  @JSImport("react-native-gesture-handler", "DrawerLayout")
  @js.native
  open class DrawerLayout protected () extends default {
    def this(props: DrawerLayoutProps) = this()
  }
  /* static members */
  object DrawerLayout {
    
    @JSImport("react-native-gesture-handler", "DrawerLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler", "DrawerLayout.defaultProps")
    @js.native
    def defaultProps: DrawerLockMode = js.native
    inline def defaultProps_=(x: DrawerLockMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-gesture-handler", "DrawerLayout.positions")
    @js.native
    def positions: Left = js.native
    inline def positions_=(x: Left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-gesture-handler", "DrawerLayoutAndroid")
  @js.native
  val DrawerLayoutAndroid: ForwardRefExoticComponent[DrawerLayoutAndroidPropsc] = js.native
  
  inline def FlatList[ItemT](
    props: PropsWithChildren[
      FlatListProps[ItemT] & RefAttributes[typings.reactNativeGestureHandler.gestureComponentsMod.FlatList[ItemT]] & NativeViewGestureHandlerProps_
    ],
    ref: ForwardedRef[typings.reactNativeGestureHandler.gestureComponentsMod.FlatList[ItemT]]
  ): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("FlatList")(props.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("react-native-gesture-handler", "FlingGestureHandler")
  @js.native
  val FlingGestureHandler: ComponentType[FlingGestureHandlerProps_ & RefAttributes[Any]] = js.native
  
  @JSImport("react-native-gesture-handler", "ForceTouchGestureHandler")
  @js.native
  val ForceTouchGestureHandler: (TypeofForceTouchFallback & Instantiable0[ForceTouchFallback]) | (ComponentType[ForceTouchGestureHandlerProps_ & RefAttributes[Any]]) = js.native
  
  object Gesture {
    
    @JSImport("react-native-gesture-handler", "Gesture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Builds a composed gesture where only one of the provided gestures can become active.
      * Priority is decided through the order of gestures: the first one has higher priority
      * than the second one, second one has higher priority than the third one, and so on.
      * For example, to make a gesture that recognizes both single and double tap you need
      * to call Exclusive(doubleTap, singleTap).
      */
    inline def Exclusive(gestures: typings.reactNativeGestureHandler.gestureMod.Gesture*): ExclusiveGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclusive")(gestures.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ExclusiveGesture]
    
    inline def Fling(): FlingGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Fling")().asInstanceOf[FlingGesture]
    
    inline def ForceTouch(): ForceTouchGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("ForceTouch")().asInstanceOf[ForceTouchGesture]
    
    inline def LongPress(): LongPressGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("LongPress")().asInstanceOf[LongPressGesture]
    
    inline def Manual(): ManualGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Manual")().asInstanceOf[ManualGesture]
    
    inline def Native(): NativeGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Native")().asInstanceOf[NativeGesture]
    
    inline def Pan(): PanGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Pan")().asInstanceOf[PanGesture]
    
    inline def Pinch(): PinchGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Pinch")().asInstanceOf[PinchGesture]
    
    /**
      * Builds a composed gesture consisting of gestures provided as parameters.
      * The first one that becomes active cancels the rest of gestures.
      */
    inline def Race(gestures: typings.reactNativeGestureHandler.gestureMod.Gesture*): ComposedGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Race")(gestures.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ComposedGesture]
    
    inline def Rotation(): RotationGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Rotation")().asInstanceOf[RotationGesture]
    
    /**
      * Builds a composed gesture that allows all base gestures to run simultaneously.
      */
    inline def Simultaneous(gestures: typings.reactNativeGestureHandler.gestureMod.Gesture*): SimultaneousGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Simultaneous")(gestures.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SimultaneousGesture]
    
    inline def Tap(): TapGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Tap")().asInstanceOf[TapGesture]
  }
  
  inline def GestureDetector(props: GestureDetectorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GestureDetector")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def GestureHandlerRootView(props: GestureHandlerRootViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GestureHandlerRootView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-native-gesture-handler", "LongPressGestureHandler")
  @js.native
  val LongPressGestureHandler: ComponentType[LongPressGestureHandlerProps_ & RefAttributes[Any]] = js.native
  
  @JSImport("react-native-gesture-handler", "NativeViewGestureHandler")
  @js.native
  val NativeViewGestureHandler: ComponentType[NativeViewGestureHandlerProps_ & RefAttributes[Any]] = js.native
  
  @JSImport("react-native-gesture-handler", "PanGestureHandler")
  @js.native
  val PanGestureHandler: ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]] = js.native
  
  @JSImport("react-native-gesture-handler", "PinchGestureHandler")
  @js.native
  val PinchGestureHandler: ComponentType[PinchGestureHandlerProps & RefAttributes[Any]] = js.native
  
  @JSImport("react-native-gesture-handler", "RawButton")
  @js.native
  val RawButton: ForwardRefExoticComponent[
    RawButtonProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
  ] = js.native
  
  @JSImport("react-native-gesture-handler", "RectButton")
  @js.native
  open class RectButton protected ()
    extends typings.reactNativeGestureHandler.gestureButtonsMod.RectButton {
    def this(props: RectButtonProps) = this()
  }
  /* static members */
  object RectButton {
    
    @JSImport("react-native-gesture-handler", "RectButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler", "RectButton.defaultProps")
    @js.native
    def defaultProps: ActiveOpacity = js.native
    inline def defaultProps_=(x: ActiveOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-gesture-handler", "RefreshControl")
  @js.native
  val RefreshControl: ForwardRefExoticComponent[
    RefreshControlProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
  ] = js.native
  
  @JSImport("react-native-gesture-handler", "RotationGestureHandler")
  @js.native
  val RotationGestureHandler: ComponentType[RotationGestureHandlerProps & RefAttributes[Any]] = js.native
  
  @JSImport("react-native-gesture-handler", "ScrollView")
  @js.native
  val ScrollView: ForwardRefExoticComponent[
    ScrollViewProps & NativeViewGestureHandlerProps_ & RefAttributes[typings.reactNative.mod.ScrollView]
  ] = js.native
  
  object State {
    
    @JSImport("react-native-gesture-handler", "State.ACTIVE")
    @js.native
    val ACTIVE: `4` = js.native
    
    @JSImport("react-native-gesture-handler", "State.BEGAN")
    @js.native
    val BEGAN: `2` = js.native
    
    @JSImport("react-native-gesture-handler", "State.CANCELLED")
    @js.native
    val CANCELLED: `3` = js.native
    
    @JSImport("react-native-gesture-handler", "State.END")
    @js.native
    val END: `5` = js.native
    
    @JSImport("react-native-gesture-handler", "State.FAILED")
    @js.native
    val FAILED: `1` = js.native
    
    @JSImport("react-native-gesture-handler", "State.UNDETERMINED")
    @js.native
    val UNDETERMINED: `0` = js.native
  }
  
  @JSImport("react-native-gesture-handler", "Swipeable")
  @js.native
  open class Swipeable protected ()
    extends typings.reactNativeGestureHandler.swipeableMod.default {
    def this(props: SwipeableProps) = this()
  }
  /* static members */
  object Swipeable {
    
    @JSImport("react-native-gesture-handler", "Swipeable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler", "Swipeable.defaultProps")
    @js.native
    def defaultProps: Friction = js.native
    inline def defaultProps_=(x: Friction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-gesture-handler", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]] = js.native
  
  @JSImport("react-native-gesture-handler", "TapGestureHandler")
  @js.native
  val TapGestureHandler: ComponentType[TapGestureHandlerProps_ & RefAttributes[Any]] = js.native
  
  @JSImport("react-native-gesture-handler", "TextInput")
  @js.native
  val TextInput: ForwardRefExoticComponent[
    TextInputProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
  ] = js.native
  
  inline def createNativeWrapper[P](Component: ComponentType[P]): ForwardRefExoticComponent[
    (PropsWithoutRef[P & NativeViewGestureHandlerProps_]) & RefAttributes[ComponentType[Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeWrapper")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[P & NativeViewGestureHandlerProps_]) & RefAttributes[ComponentType[Any]]
  ]]
  inline def createNativeWrapper[P](Component: ComponentType[P], config: ReadonlyNativeViewGesture): ForwardRefExoticComponent[
    (PropsWithoutRef[P & NativeViewGestureHandlerProps_]) & RefAttributes[ComponentType[Any]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNativeWrapper")(Component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[P & NativeViewGestureHandlerProps_]) & RefAttributes[ComponentType[Any]]
  ]]
  
  inline def enableExperimentalWebImplementation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableExperimentalWebImplementation")().asInstanceOf[Unit]
  inline def enableExperimentalWebImplementation(shouldEnable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableExperimentalWebImplementation")(shouldEnable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def gestureHandlerRootHOC[P](Component: ComponentType[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("gestureHandlerRootHOC")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  inline def gestureHandlerRootHOC[P](Component: ComponentType[P], containerStyles: StyleProp[ViewStyle]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("gestureHandlerRootHOC")(Component.asInstanceOf[js.Any], containerStyles.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
}
