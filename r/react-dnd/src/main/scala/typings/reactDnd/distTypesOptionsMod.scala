package typings.reactDnd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOptionsMod {
  
  trait DragPreviewOptions extends StObject {
    
    /**
      * Optional. A number between 0 and 1. By default, 0.5. Specifies how the offset relative to the drag source node is translated
      * into the horizontal offset of the drag preview when their sizes don't match. 0 means “dock the preview to the left”, 0.5 means
      * “interpolate linearly” and 1 means “dock the preview to the right”.
      */
    var anchorX: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional. A number between 0 and 1. By default, 0.5. Specifies how the offset relative to the drag source node is translated into
      * the vertical offset of the drag preview when their sizes don't match. 0 means “dock the preview to the top, 0.5 means “interpolate
      * linearly” and 1 means “dock the preview to the bottom.
      */
    var anchorY: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional. A boolean. By default, false. If true, the component will learn that it is being dragged immediately as the drag
      * starts instead of the next tick. This means that the screenshotting would occur with monitor.isDragging() already being true,
      * and if you apply any styling like a decreased opacity to the dragged element, this styling will also be reflected on the
      * screenshot. This is rarely desirable, so false is a sensible default. However, you might want to set it to true in rare cases,
      * such as if you want to make the custom drag layers work in IE and you need to hide the original element without resorting to
      * an empty drag preview which IE doesn't support.
      */
    var captureDraggingState: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional. A number or null if not needed. By default, null. Specifies the vertical offset between the cursor and the drag preview
      * element. If offsetX has a value, anchorX won't be used.
      */
    var offsetX: js.UndefOr[Double] = js.undefined
    
    /**
      *  Optional. A number or null if not needed. By default, null. Specifies the vertical offset between the cursor and the drag
      *  preview element. If offsetY has a value, anchorY won't be used.
      */
    var offsetY: js.UndefOr[Double] = js.undefined
  }
  object DragPreviewOptions {
    
    inline def apply(): DragPreviewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragPreviewOptions]
    }
    
    extension [Self <: DragPreviewOptions](x: Self) {
      
      inline def setAnchorX(value: Double): Self = StObject.set(x, "anchorX", value.asInstanceOf[js.Any])
      
      inline def setAnchorXUndefined: Self = StObject.set(x, "anchorX", js.undefined)
      
      inline def setAnchorY(value: Double): Self = StObject.set(x, "anchorY", value.asInstanceOf[js.Any])
      
      inline def setAnchorYUndefined: Self = StObject.set(x, "anchorY", js.undefined)
      
      inline def setCaptureDraggingState(value: Boolean): Self = StObject.set(x, "captureDraggingState", value.asInstanceOf[js.Any])
      
      inline def setCaptureDraggingStateUndefined: Self = StObject.set(x, "captureDraggingState", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    }
  }
  
  trait DragSourceOptions extends StObject {
    
    /**
      * Optional. A string. By default, 'move'. In the browsers that support this feature, specifying 'copy'
      * shows a special “copying” cursor, while 'move' corresponds to the “move” cursor. You might want to use
      * this option to provide a hint to the user about whether an action is destructive.
      */
    var dropEffect: js.UndefOr[String] = js.undefined
  }
  object DragSourceOptions {
    
    inline def apply(): DragSourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragSourceOptions]
    }
    
    extension [Self <: DragSourceOptions](x: Self) {
      
      inline def setDropEffect(value: String): Self = StObject.set(x, "dropEffect", value.asInstanceOf[js.Any])
      
      inline def setDropEffectUndefined: Self = StObject.set(x, "dropEffect", js.undefined)
    }
  }
  
  type DropTargetOptions = Any
}
