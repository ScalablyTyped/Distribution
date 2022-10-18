package typings.reactFloater

import typings.popperjsCore.libEnumsMod.Placement
import typings.popperjsCore.libTypesMod.Instance
import typings.reactFloater.anon.PartialApplyStylesModifie
import typings.reactFloater.anon.PartialArrowModifier
import typings.reactFloater.anon.PartialComputeStylesModif
import typings.reactFloater.anon.PartialEventListenersModi
import typings.reactFloater.anon.PartialFlipModifier
import typings.reactFloater.anon.PartialHideModifier
import typings.reactFloater.anon.PartialOffsetModifier
import typings.reactFloater.anon.PartialPopperOffsetsModif
import typings.reactFloater.anon.PartialPreventOverflowMod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesPopperMod {
  
  type PopperInstance = Instance
  
  trait PopperModifiers extends StObject {
    
    var applyStyles: js.UndefOr[PartialApplyStylesModifie] = js.undefined
    
    var arrow: js.UndefOr[PartialArrowModifier] = js.undefined
    
    var computeStyles: js.UndefOr[PartialComputeStylesModif] = js.undefined
    
    var eventListeners: js.UndefOr[PartialEventListenersModi] = js.undefined
    
    var flip: js.UndefOr[PartialFlipModifier] = js.undefined
    
    var hide: js.UndefOr[PartialHideModifier] = js.undefined
    
    var offset: js.UndefOr[PartialOffsetModifier] = js.undefined
    
    var popperOffsets: js.UndefOr[PartialPopperOffsetsModif] = js.undefined
    
    var preventOverflow: js.UndefOr[PartialPreventOverflowMod] = js.undefined
  }
  object PopperModifiers {
    
    inline def apply(): PopperModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopperModifiers]
    }
    
    extension [Self <: PopperModifiers](x: Self) {
      
      inline def setApplyStyles(value: PartialApplyStylesModifie): Self = StObject.set(x, "applyStyles", value.asInstanceOf[js.Any])
      
      inline def setApplyStylesUndefined: Self = StObject.set(x, "applyStyles", js.undefined)
      
      inline def setArrow(value: PartialArrowModifier): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setComputeStyles(value: PartialComputeStylesModif): Self = StObject.set(x, "computeStyles", value.asInstanceOf[js.Any])
      
      inline def setComputeStylesUndefined: Self = StObject.set(x, "computeStyles", js.undefined)
      
      inline def setEventListeners(value: PartialEventListenersModi): Self = StObject.set(x, "eventListeners", value.asInstanceOf[js.Any])
      
      inline def setEventListenersUndefined: Self = StObject.set(x, "eventListeners", js.undefined)
      
      inline def setFlip(value: PartialFlipModifier): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setHide(value: PartialHideModifier): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setOffset(value: PartialOffsetModifier): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPopperOffsets(value: PartialPopperOffsetsModif): Self = StObject.set(x, "popperOffsets", value.asInstanceOf[js.Any])
      
      inline def setPopperOffsetsUndefined: Self = StObject.set(x, "popperOffsets", js.undefined)
      
      inline def setPreventOverflow(value: PartialPreventOverflowMod): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
      
      inline def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
    }
  }
  
  type PopperPlacement = Placement
}
