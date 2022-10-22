package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.RefObject
import typings.reactNativeGestureHandler.libTypescriptActionTypeMod.ActionType
import typings.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default
import typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod.Config
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

object libTypescriptRngesturehandlermoduleDotmacosMod {
  
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
    
    inline def getGestureHandlerNode(handlerTag: Double): typings.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getGestureHandlerNode")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default]
    
    inline def handleClearJSResponder(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleClearJSResponder")().asInstanceOf[Unit]
    
    inline def handleSetJSResponder(_tag: Double, _blockNativeResponder: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleSetJSResponder")(_tag.asInstanceOf[js.Any], _blockNativeResponder.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
      extends typings.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.LongPressGestureHandler")
    @js.native
    def LongPressGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default
      ] = js.native
    inline def LongPressGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LongPressGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.ManualGestureHandler")
    @js.native
    open class ManualGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.ManualGestureHandler")
    @js.native
    def ManualGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
      ] = js.native
    inline def ManualGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ManualGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.NativeViewGestureHandler")
    @js.native
    open class NativeViewGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.NativeViewGestureHandler")
    @js.native
    def NativeViewGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default
      ] = js.native
    inline def NativeViewGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativeViewGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.PanGestureHandler")
    @js.native
    open class PanGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.PanGestureHandler")
    @js.native
    def PanGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default
      ] = js.native
    inline def PanGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.PinchGestureHandler")
    @js.native
    open class PinchGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.PinchGestureHandler")
    @js.native
    def PinchGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default
      ] = js.native
    inline def PinchGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.RotationGestureHandler")
    @js.native
    open class RotationGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.RotationGestureHandler")
    @js.native
    def RotationGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default
      ] = js.native
    inline def RotationGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.TapGestureHandler")
    @js.native
    open class TapGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "Gestures.TapGestureHandler")
    @js.native
    def TapGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default
      ] = js.native
    inline def TapGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TapGestureHandler")(x.asInstanceOf[js.Any])
  }
  
  object HammerGestures {
    
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.FlingGestureHandler")
    @js.native
    open class FlingGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.FlingGestureHandler")
    @js.native
    def FlingGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default
      ] = js.native
    inline def FlingGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHammerFlingGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FlingGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.LongPressGestureHandler")
    @js.native
    open class LongPressGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.LongPressGestureHandler")
    @js.native
    def LongPressGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default
      ] = js.native
    inline def LongPressGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHammerLongPressGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LongPressGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.NativeViewGestureHandler")
    @js.native
    open class NativeViewGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.NativeViewGestureHandler")
    @js.native
    def NativeViewGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default
      ] = js.native
    inline def NativeViewGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHammerNativeViewGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativeViewGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.PanGestureHandler")
    @js.native
    open class PanGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.PanGestureHandler")
    @js.native
    def PanGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default
      ] = js.native
    inline def PanGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHammerPanGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.PinchGestureHandler")
    @js.native
    open class PinchGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.PinchGestureHandler")
    @js.native
    def PinchGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default
      ] = js.native
    inline def PinchGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHammerPinchGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.RotationGestureHandler")
    @js.native
    open class RotationGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.RotationGestureHandler")
    @js.native
    def RotationGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default
      ] = js.native
    inline def RotationGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHammerRotationGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationGestureHandler")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.TapGestureHandler")
    @js.native
    open class TapGestureHandler ()
      extends typings.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default
    @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule.macos", "HammerGestures.TapGestureHandler")
    @js.native
    def TapGestureHandler: Instantiable0[
        typings.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default
      ] = js.native
    inline def TapGestureHandler_=(
      x: Instantiable0[
          typings.reactNativeGestureHandler.libTypescriptWebHammerTapGestureHandlerMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TapGestureHandler")(x.asInstanceOf[js.Any])
  }
}
