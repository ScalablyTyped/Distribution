package typings.reactResizeDetector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Leading extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.native
    
    var trailing: js.UndefOr[Boolean] = js.native
  }
  object Leading {
    
    @scala.inline
    def apply(): Leading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leading]
    }
    
    @scala.inline
    implicit class LeadingMutableBuilder[Self <: Leading] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-resize-detector.react-resize-detector.ReactResizeDetectorDimensions> */
  @js.native
  trait PartialReactResizeDetecto extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object PartialReactResizeDetecto {
    
    @scala.inline
    def apply(): PartialReactResizeDetecto = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialReactResizeDetecto]
    }
    
    @scala.inline
    implicit class PartialReactResizeDetectoMutableBuilder[Self <: PartialReactResizeDetecto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
