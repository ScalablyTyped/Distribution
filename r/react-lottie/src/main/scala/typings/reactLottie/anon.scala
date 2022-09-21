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
    var context: js.UndefOr[Any] = js.undefined
    
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
    
    var scaleMode: js.UndefOr[Any] = js.undefined
  }
  object ClassName {
    
    inline def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearCanvas(value: Boolean): Self = StObject.set(x, "clearCanvas", value.asInstanceOf[js.Any])
      
      inline def setClearCanvasUndefined: Self = StObject.set(x, "clearCanvas", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setHideOnTransparent(value: Boolean): Self = StObject.set(x, "hideOnTransparent", value.asInstanceOf[js.Any])
      
      inline def setHideOnTransparentUndefined: Self = StObject.set(x, "hideOnTransparent", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setProgressiveLoad(value: Boolean): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
      
      inline def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
      
      inline def setScaleMode(value: Any): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
      
      inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    }
  }
}
