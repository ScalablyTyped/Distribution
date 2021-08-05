package typings.reactMdTransition

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getElementSizingMod {
  
  @JSImport("@react-md/transition/types/getElementSizing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getElementSizing(): CollapseSizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSizing")().asInstanceOf[CollapseSizing]
  inline def getElementSizing(element: HTMLElement): CollapseSizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSizing")(element.asInstanceOf[js.Any]).asInstanceOf[CollapseSizing]
  
  trait CollapseSizing extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var paddingBottom: js.UndefOr[Double] = js.undefined
    
    var paddingTop: js.UndefOr[Double] = js.undefined
  }
  object CollapseSizing {
    
    inline def apply(): CollapseSizing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseSizing]
    }
    
    extension [Self <: CollapseSizing](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    }
  }
}
