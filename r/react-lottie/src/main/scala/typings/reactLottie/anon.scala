package typings.reactLottie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearCanvas: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The canvas context
      */
    var context: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Hides elements when opacity reaches 0. Only with SVG renderer.
      * @default true
      */
    var hideOnTransparent: js.UndefOr[Boolean] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    /**
      * Loads DOM elements when needed. Might speed up initialization for large number of elements. Only with SVG renderer.
      */
    var progressiveLoad: js.UndefOr[Boolean] = js.undefined
    
    var scaleMode: js.UndefOr[js.Any] = js.undefined
  }
  object ClassName {
    
    @scala.inline
    def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearCanvas(value: Boolean): Self = StObject.set(x, "clearCanvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearCanvasUndefined: Self = StObject.set(x, "clearCanvas", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setHideOnTransparent(value: Boolean): Self = StObject.set(x, "hideOnTransparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnTransparentUndefined: Self = StObject.set(x, "hideOnTransparent", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setProgressiveLoad(value: Boolean): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
      
      @scala.inline
      def setScaleMode(value: js.Any): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    }
  }
}
