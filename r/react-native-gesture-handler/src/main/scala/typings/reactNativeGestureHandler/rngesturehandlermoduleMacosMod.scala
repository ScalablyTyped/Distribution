package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.RefObject
import typings.reactNativeGestureHandler.actionTypeMod.ActionType
import typings.reactNativeGestureHandler.handlersFlingGestureHandlerMod.default
import typings.reactNativeGestureHandler.interfacesMod.Config
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.FlingGestureHandler
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.LongPressGestureHandler
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.ManualGestureHandler
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.NativeViewGestureHandler
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.PanGestureHandler
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.PinchGestureHandler
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.RotationGestureHandler
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.TapGestureHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rngesturehandlermoduleMacosMod {
  
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachGestureHandler(handlerTag: Double, newView: Double, _actionType: ActionType, propsRef: RefObject[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachGestureHandler")(handlerTag.asInstanceOf[js.Any], newView.asInstanceOf[js.Any], _actionType.asInstanceOf[js.Any], propsRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createGestureHandler[T](
      handlerName: /* keyof react-native-gesture-handler.anon.FlingGestureHandler */ NativeViewGestureHandler | PanGestureHandler | TapGestureHandler | LongPressGestureHandler | PinchGestureHandler | RotationGestureHandler | FlingGestureHandler | ManualGestureHandler,
      handlerTag: Double,
      config: T
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGestureHandler")(handlerName.asInstanceOf[js.Any], handlerTag.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def dropGestureHandler(handlerTag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropGestureHandler")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def flushOperations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushOperations")().asInstanceOf[Unit]
    
    inline def getGestureHandlerNode(handlerTag: Double): typings.reactNativeGestureHandler.handlersPanGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersTapGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersFlingGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.manualGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerPanGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerTapGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerFlingGestureHandlerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getGestureHandlerNode")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeGestureHandler.handlersPanGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersTapGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersFlingGestureHandlerMod.default | typings.reactNativeGestureHandler.handlersNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.manualGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerPanGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerTapGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerFlingGestureHandlerMod.default]
    
    inline def handleClearJSResponder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleClearJSResponder")().asInstanceOf[Unit]
    
    inline def handleSetJSResponder(tag: Double, blockNativeResponder: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleSetJSResponder")(tag.asInstanceOf[js.Any], blockNativeResponder.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateGestureHandler(handlerTag: Double, newConfig: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateGestureHandler")(handlerTag.asInstanceOf[js.Any], newConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Gestures {
    
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.FlingGestureHandler")
    @js.native
    open class FlingGestureHandler () extends default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.FlingGestureHandler")
    @js.native
    def FlingGestureHandler: Instantiable0[default] = js.native
    inline def FlingGestureHandler_=(x: Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FlingGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.LongPressGestureHandler")
    @js.native
    open class LongPressGestureHandler ()
      extends typings.reactNativeGestureHandler.handlersLongPressGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.LongPressGestureHandler")
    @js.native
    def LongPressGestureHandler: Instantiable0[typings.reactNativeGestureHandler.handlersLongPressGestureHandlerMod.default] = js.native
    inline def LongPressGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.handlersLongPressGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LongPressGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.ManualGestureHandler")
    @js.native
    open class ManualGestureHandler ()
      extends typings.reactNativeGestureHandler.manualGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.ManualGestureHandler")
    @js.native
    def ManualGestureHandler: Instantiable0[typings.reactNativeGestureHandler.manualGestureHandlerMod.default] = js.native
    inline def ManualGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.manualGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ManualGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.NativeViewGestureHandler")
    @js.native
    open class NativeViewGestureHandler ()
      extends typings.reactNativeGestureHandler.handlersNativeViewGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.NativeViewGestureHandler")
    @js.native
    def NativeViewGestureHandler: Instantiable0[typings.reactNativeGestureHandler.handlersNativeViewGestureHandlerMod.default] = js.native
    inline def NativeViewGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.handlersNativeViewGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativeViewGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.PanGestureHandler")
    @js.native
    open class PanGestureHandler ()
      extends typings.reactNativeGestureHandler.handlersPanGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.PanGestureHandler")
    @js.native
    def PanGestureHandler: Instantiable0[typings.reactNativeGestureHandler.handlersPanGestureHandlerMod.default] = js.native
    inline def PanGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.handlersPanGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.PinchGestureHandler")
    @js.native
    open class PinchGestureHandler ()
      extends typings.reactNativeGestureHandler.handlersPinchGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.PinchGestureHandler")
    @js.native
    def PinchGestureHandler: Instantiable0[typings.reactNativeGestureHandler.handlersPinchGestureHandlerMod.default] = js.native
    inline def PinchGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.handlersPinchGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.RotationGestureHandler")
    @js.native
    open class RotationGestureHandler ()
      extends typings.reactNativeGestureHandler.handlersRotationGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.RotationGestureHandler")
    @js.native
    def RotationGestureHandler: Instantiable0[typings.reactNativeGestureHandler.handlersRotationGestureHandlerMod.default] = js.native
    inline def RotationGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.handlersRotationGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.TapGestureHandler")
    @js.native
    open class TapGestureHandler ()
      extends typings.reactNativeGestureHandler.handlersTapGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.TapGestureHandler")
    @js.native
    def TapGestureHandler: Instantiable0[typings.reactNativeGestureHandler.handlersTapGestureHandlerMod.default] = js.native
    inline def TapGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.handlersTapGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TapGestureHandler")(x.asInstanceOf[js.Any])
  }
  
  object HammerGestures {
    
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.FlingGestureHandler")
    @js.native
    open class FlingGestureHandler ()
      extends typings.reactNativeGestureHandler.webHammerFlingGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.FlingGestureHandler")
    @js.native
    def FlingGestureHandler: Instantiable0[typings.reactNativeGestureHandler.webHammerFlingGestureHandlerMod.default] = js.native
    inline def FlingGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.webHammerFlingGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FlingGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.LongPressGestureHandler")
    @js.native
    open class LongPressGestureHandler ()
      extends typings.reactNativeGestureHandler.webHammerLongPressGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.LongPressGestureHandler")
    @js.native
    def LongPressGestureHandler: Instantiable0[typings.reactNativeGestureHandler.webHammerLongPressGestureHandlerMod.default] = js.native
    inline def LongPressGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.webHammerLongPressGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LongPressGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.NativeViewGestureHandler")
    @js.native
    open class NativeViewGestureHandler ()
      extends typings.reactNativeGestureHandler.webHammerNativeViewGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.NativeViewGestureHandler")
    @js.native
    def NativeViewGestureHandler: Instantiable0[typings.reactNativeGestureHandler.webHammerNativeViewGestureHandlerMod.default] = js.native
    inline def NativeViewGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.webHammerNativeViewGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativeViewGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.PanGestureHandler")
    @js.native
    open class PanGestureHandler ()
      extends typings.reactNativeGestureHandler.webHammerPanGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.PanGestureHandler")
    @js.native
    def PanGestureHandler: Instantiable0[typings.reactNativeGestureHandler.webHammerPanGestureHandlerMod.default] = js.native
    inline def PanGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.webHammerPanGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.PinchGestureHandler")
    @js.native
    open class PinchGestureHandler ()
      extends typings.reactNativeGestureHandler.webHammerPinchGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.PinchGestureHandler")
    @js.native
    def PinchGestureHandler: Instantiable0[typings.reactNativeGestureHandler.webHammerPinchGestureHandlerMod.default] = js.native
    inline def PinchGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.webHammerPinchGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.RotationGestureHandler")
    @js.native
    open class RotationGestureHandler ()
      extends typings.reactNativeGestureHandler.webHammerRotationGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.RotationGestureHandler")
    @js.native
    def RotationGestureHandler: Instantiable0[typings.reactNativeGestureHandler.webHammerRotationGestureHandlerMod.default] = js.native
    inline def RotationGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.webHammerRotationGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.TapGestureHandler")
    @js.native
    open class TapGestureHandler ()
      extends typings.reactNativeGestureHandler.webHammerTapGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.TapGestureHandler")
    @js.native
    def TapGestureHandler: Instantiable0[typings.reactNativeGestureHandler.webHammerTapGestureHandlerMod.default] = js.native
    inline def TapGestureHandler_=(x: Instantiable0[typings.reactNativeGestureHandler.webHammerTapGestureHandlerMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TapGestureHandler")(x.asInstanceOf[js.Any])
  }
}
