package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.NumberDictionary
import typings.reactNativeGestureHandler.anon.FlingGestureHandler
import typings.reactNativeGestureHandler.libTypescriptTypeUtilsMod.ValueOf
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebToolsNodeManagerMod {
  
  /* note: abstract class */ @JSImport("react-native-gesture-handler/lib/typescript/web/tools/NodeManager", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NodeManager
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/NodeManager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createGestureHandler(handlerTag: Double, handler: InstanceType[ValueOf[FlingGestureHandler]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGestureHandler")(handlerTag.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def dropGestureHandler(handlerTag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropGestureHandler")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/NodeManager", "default.gestures")
    @js.native
    def gestures: Any = js.native
    inline def gestures_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gestures")(x.asInstanceOf[js.Any])
    
    inline def getHandler(tag: Double): typings.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandler")(tag.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default]
    
    inline def getNodes(): NumberDictionary[
        typings.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodes")().asInstanceOf[NumberDictionary[
        typings.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typings.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
      ]]
  }
  
  trait NodeManager extends StObject
}
