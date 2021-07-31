package typings.primereact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipOptionsMod {
  
  trait TooltipOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var event: js.UndefOr[String] = js.undefined
    
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var showDelay: js.UndefOr[Double] = js.undefined
  }
  object TooltipOptions {
    
    @scala.inline
    def apply(): TooltipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipOptions]
    }
    
    @scala.inline
    implicit class TooltipOptionsMutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
    }
  }
}
