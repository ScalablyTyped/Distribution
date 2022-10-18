package typings.reachTooltip

import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DEBUGSTYLE[ElementType /* <: HTMLElement | SVGElement */] extends StObject {
    
    var DEBUG_STYLE: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[ElementType]] = js.undefined
  }
  object DEBUGSTYLE {
    
    inline def apply[ElementType /* <: HTMLElement | SVGElement */](): DEBUGSTYLE[ElementType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DEBUGSTYLE[ElementType]]
    }
    
    extension [Self <: DEBUGSTYLE[?], ElementType /* <: HTMLElement | SVGElement */](x: Self & DEBUGSTYLE[ElementType]) {
      
      inline def setDEBUG_STYLE(value: Boolean): Self = StObject.set(x, "DEBUG_STYLE", value.asInstanceOf[js.Any])
      
      inline def setDEBUG_STYLEUndefined: Self = StObject.set(x, "DEBUG_STYLE", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setRef(value: Ref[ElementType]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ElementType | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
