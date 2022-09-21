package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.NumberDictionary
import typings.reactNativeGestureHandler.anon.LongPressGestureHandler
import typings.reactNativeGestureHandler.typeUtilsMod.ValueOf
import typings.reactNativeGestureHandler.webHammerNativeViewGestureHandlerMod.default
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webHammerNodeManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/NodeManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGestureHandler(handlerTag: Double, handler: InstanceType[ValueOf[LongPressGestureHandler]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGestureHandler")(handlerTag.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dropGestureHandler(handlerTag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropGestureHandler")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getHandler(tag: Double): default | typings.reactNativeGestureHandler.webHammerPanGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerTapGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerFlingGestureHandlerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandler")(tag.asInstanceOf[js.Any]).asInstanceOf[default | typings.reactNativeGestureHandler.webHammerPanGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerTapGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerFlingGestureHandlerMod.default]
  
  inline def getNodes(): NumberDictionary[
    default | typings.reactNativeGestureHandler.webHammerPanGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerTapGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerFlingGestureHandlerMod.default
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodes")().asInstanceOf[NumberDictionary[
    default | typings.reactNativeGestureHandler.webHammerPanGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerTapGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerLongPressGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerPinchGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerRotationGestureHandlerMod.default | typings.reactNativeGestureHandler.webHammerFlingGestureHandlerMod.default
  ]]
}
