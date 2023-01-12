package typings.reactJoyride.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var back: js.UndefOr[ReactNode] = js.undefined
  
  var close: js.UndefOr[ReactNode] = js.undefined
  
  var last: js.UndefOr[ReactNode] = js.undefined
  
  var next: js.UndefOr[ReactNode] = js.undefined
  
  var open: js.UndefOr[ReactNode] = js.undefined
  
  var skip: js.UndefOr[ReactNode] = js.undefined
}
object Locale {
  
  inline def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    inline def setBack(value: ReactNode): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
    
    inline def setClose(value: ReactNode): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setLast(value: ReactNode): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setNext(value: ReactNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setOpen(value: ReactNode): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setSkip(value: ReactNode): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
