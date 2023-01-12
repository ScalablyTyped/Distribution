package typings.reactMosaicComponent

import typings.reactMosaicComponent.libTypesMod.MosaicBranch
import typings.reactMosaicComponent.libTypesMod.MosaicPath
import typings.reactMosaicComponent.reactMosaicComponentStrings.bottom
import typings.reactMosaicComponent.reactMosaicComponentStrings.left
import typings.reactMosaicComponent.reactMosaicComponentStrings.right
import typings.reactMosaicComponent.reactMosaicComponentStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInternalTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMosaicComponent.reactMosaicComponentStrings.top
    - typings.reactMosaicComponent.reactMosaicComponentStrings.bottom
    - typings.reactMosaicComponent.reactMosaicComponentStrings.left
    - typings.reactMosaicComponent.reactMosaicComponentStrings.right
  */
  trait MosaicDropTargetPosition extends StObject
  object MosaicDropTargetPosition {
    
    @JSImport("react-mosaic-component/lib/internalTypes", "MosaicDropTargetPosition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/internalTypes", "MosaicDropTargetPosition.BOTTOM")
    @js.native
    def BOTTOM: bottom = js.native
    inline def BOTTOM_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-mosaic-component/lib/internalTypes", "MosaicDropTargetPosition.LEFT")
    @js.native
    def LEFT: left = js.native
    inline def LEFT_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-mosaic-component/lib/internalTypes", "MosaicDropTargetPosition.RIGHT")
    @js.native
    def RIGHT: right = js.native
    inline def RIGHT_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-mosaic-component/lib/internalTypes", "MosaicDropTargetPosition.TOP")
    @js.native
    def TOP: top = js.native
    inline def TOP_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
  }
  
  trait MosaicDragItem extends StObject {
    
    var hideTimer: Double
    
    var mosaicId: String
  }
  object MosaicDragItem {
    
    inline def apply(hideTimer: Double, mosaicId: String): MosaicDragItem = {
      val __obj = js.Dynamic.literal(hideTimer = hideTimer.asInstanceOf[js.Any], mosaicId = mosaicId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MosaicDragItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MosaicDragItem] (val x: Self) extends AnyVal {
      
      inline def setHideTimer(value: Double): Self = StObject.set(x, "hideTimer", value.asInstanceOf[js.Any])
      
      inline def setMosaicId(value: String): Self = StObject.set(x, "mosaicId", value.asInstanceOf[js.Any])
    }
  }
  
  trait MosaicDropData extends StObject {
    
    var path: js.UndefOr[MosaicPath] = js.undefined
    
    var position: js.UndefOr[MosaicDropTargetPosition] = js.undefined
  }
  object MosaicDropData {
    
    inline def apply(): MosaicDropData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MosaicDropData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MosaicDropData] (val x: Self) extends AnyVal {
      
      inline def setPath(value: MosaicPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: MosaicBranch*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPosition(value: MosaicDropTargetPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
