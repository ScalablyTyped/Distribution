package typings.relayTestUtils

import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.OperationTracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HandlerProvider extends StObject {
    
    var handlerProvider: js.UndefOr[typings.relayRuntime.relayDefaultHandlerProviderMod.HandlerProvider] = js.undefined
    
    var missingFieldHandlers: js.UndefOr[js.Array[MissingFieldHandler]] = js.undefined
    
    var operationLoader: js.UndefOr[OperationLoader] = js.undefined
    
    var operationTracker: js.UndefOr[OperationTracker] = js.undefined
  }
  object HandlerProvider {
    
    @scala.inline
    def apply(): HandlerProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandlerProvider]
    }
    
    @scala.inline
    implicit class HandlerProviderMutableBuilder[Self <: HandlerProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlerProvider(value: /* handle */ String => js.Any): Self = StObject.set(x, "handlerProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandlerProviderUndefined: Self = StObject.set(x, "handlerProvider", js.undefined)
      
      @scala.inline
      def setMissingFieldHandlers(value: js.Array[MissingFieldHandler]): Self = StObject.set(x, "missingFieldHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingFieldHandlersUndefined: Self = StObject.set(x, "missingFieldHandlers", js.undefined)
      
      @scala.inline
      def setMissingFieldHandlersVarargs(value: MissingFieldHandler*): Self = StObject.set(x, "missingFieldHandlers", js.Array(value :_*))
      
      @scala.inline
      def setOperationLoader(value: OperationLoader): Self = StObject.set(x, "operationLoader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationLoaderUndefined: Self = StObject.set(x, "operationLoader", js.undefined)
      
      @scala.inline
      def setOperationTracker(value: OperationTracker): Self = StObject.set(x, "operationTracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationTrackerUndefined: Self = StObject.set(x, "operationTracker", js.undefined)
    }
  }
}
