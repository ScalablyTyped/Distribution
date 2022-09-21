package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeGestureHandler.actionTypeMod.ActionType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rngesturehandlermoduleMod extends Shortcut {
  
  @JSImport("react-native-gesture-handler/lib/typescript/RNGestureHandlerModule", JSImport.Default)
  @js.native
  val default: RNGestureHandlerModuleProps = js.native
  
  trait RNGestureHandlerModuleProps extends StObject {
    
    def attachGestureHandler(handlerTag: Double, newView: Double, actionType: ActionType): Unit
    
    def createGestureHandler(handlerName: String, handlerTag: Double, config: Record[String, Any]): Unit
    
    def dropGestureHandler(handlerTag: Double): Unit
    
    def flushOperations(): Unit
    
    def handleClearJSResponder(): Unit
    
    def handleSetJSResponder(tag: Double, blockNativeResponder: Boolean): Unit
    
    def install(): Unit
    
    def updateGestureHandler(handlerTag: Double, newConfig: Record[String, Any]): Unit
  }
  object RNGestureHandlerModuleProps {
    
    inline def apply(
      attachGestureHandler: (Double, Double, ActionType) => Unit,
      createGestureHandler: (String, Double, Record[String, Any]) => Unit,
      dropGestureHandler: Double => Unit,
      flushOperations: () => Unit,
      handleClearJSResponder: () => Unit,
      handleSetJSResponder: (Double, Boolean) => Unit,
      install: () => Unit,
      updateGestureHandler: (Double, Record[String, Any]) => Unit
    ): RNGestureHandlerModuleProps = {
      val __obj = js.Dynamic.literal(attachGestureHandler = js.Any.fromFunction3(attachGestureHandler), createGestureHandler = js.Any.fromFunction3(createGestureHandler), dropGestureHandler = js.Any.fromFunction1(dropGestureHandler), flushOperations = js.Any.fromFunction0(flushOperations), handleClearJSResponder = js.Any.fromFunction0(handleClearJSResponder), handleSetJSResponder = js.Any.fromFunction2(handleSetJSResponder), install = js.Any.fromFunction0(install), updateGestureHandler = js.Any.fromFunction2(updateGestureHandler))
      __obj.asInstanceOf[RNGestureHandlerModuleProps]
    }
    
    extension [Self <: RNGestureHandlerModuleProps](x: Self) {
      
      inline def setAttachGestureHandler(value: (Double, Double, ActionType) => Unit): Self = StObject.set(x, "attachGestureHandler", js.Any.fromFunction3(value))
      
      inline def setCreateGestureHandler(value: (String, Double, Record[String, Any]) => Unit): Self = StObject.set(x, "createGestureHandler", js.Any.fromFunction3(value))
      
      inline def setDropGestureHandler(value: Double => Unit): Self = StObject.set(x, "dropGestureHandler", js.Any.fromFunction1(value))
      
      inline def setFlushOperations(value: () => Unit): Self = StObject.set(x, "flushOperations", js.Any.fromFunction0(value))
      
      inline def setHandleClearJSResponder(value: () => Unit): Self = StObject.set(x, "handleClearJSResponder", js.Any.fromFunction0(value))
      
      inline def setHandleSetJSResponder(value: (Double, Boolean) => Unit): Self = StObject.set(x, "handleSetJSResponder", js.Any.fromFunction2(value))
      
      inline def setInstall(value: () => Unit): Self = StObject.set(x, "install", js.Any.fromFunction0(value))
      
      inline def setUpdateGestureHandler(value: (Double, Record[String, Any]) => Unit): Self = StObject.set(x, "updateGestureHandler", js.Any.fromFunction2(value))
    }
  }
  
  type _To = RNGestureHandlerModuleProps
  
  /* This means you don't have to write `default`, but can instead just say `rngesturehandlermoduleMod.foo` */
  override def _to: RNGestureHandlerModuleProps = default
}
