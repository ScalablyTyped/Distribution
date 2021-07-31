package typings.semanticUiReactEventStack

import typings.react.mod.RefObject
import typings.std.Document
import typings.std.EventListener
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait CallableEventListener extends EventListener {
    
    var called: js.UndefOr[Boolean] = js.native
  }
  
  type EventListeners = js.Array[CallableEventListener]
  
  type GenericMap[T] = Map[String, T]
  
  type InputEventListener = EventListener | js.Array[EventListener]
  
  type InputTargetElement = Boolean | String | TargetElement | RefObject[TargetElement]
  
  trait Options extends StObject {
    
    var pool: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[InputTargetElement] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setTarget(value: InputTargetElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type TargetElement = Document | HTMLElement | Window
}
