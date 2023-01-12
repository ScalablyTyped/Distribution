package typings.reactOverlays.anon

import typings.react.mod.CSSProperties
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabelledby extends StObject {
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var ref: RefCallback[HTMLElement]
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object Arialabelledby {
  
  inline def apply(ref: /* instance */ HTMLElement | Null => Unit): Arialabelledby = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[Arialabelledby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arialabelledby] (val x: Self) extends AnyVal {
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setRef(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
