package typings.rmcSteps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Current extends StObject {
    
    var current: Double
    
    var direction: String
    
    var iconPrefix: String
    
    var labelPlacement: String
    
    var prefixCls: String
    
    var progressDot: Boolean
    
    var size: String
    
    var status: String
  }
  object Current {
    
    @scala.inline
    def apply(
      current: Double,
      direction: String,
      iconPrefix: String,
      labelPlacement: String,
      prefixCls: String,
      progressDot: Boolean,
      size: String,
      status: String
    ): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], iconPrefix = iconPrefix.asInstanceOf[js.Any], labelPlacement = labelPlacement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], progressDot = progressDot.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    @scala.inline
    implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacement(value: String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressDot(value: Boolean): Self = StObject.set(x, "progressDot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
