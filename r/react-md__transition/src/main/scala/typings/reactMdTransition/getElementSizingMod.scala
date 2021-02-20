package typings.reactMdTransition

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getElementSizingMod {
  
  @JSImport("@react-md/transition/types/getElementSizing", "getElementSizing")
  @js.native
  def getElementSizing(): CollapseSizing = js.native
  @JSImport("@react-md/transition/types/getElementSizing", "getElementSizing")
  @js.native
  def getElementSizing(element: HTMLElement): CollapseSizing = js.native
  
  @js.native
  trait CollapseSizing extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var paddingBottom: js.UndefOr[Double] = js.native
    
    var paddingTop: js.UndefOr[Double] = js.native
  }
  object CollapseSizing {
    
    @scala.inline
    def apply(): CollapseSizing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseSizing]
    }
    
    @scala.inline
    implicit class CollapseSizingMutableBuilder[Self <: CollapseSizing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    }
  }
}
