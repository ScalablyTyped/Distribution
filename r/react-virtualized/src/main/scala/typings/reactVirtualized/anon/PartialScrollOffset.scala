package typings.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-virtualized.react-virtualized/dist/es/Grid.ScrollOffset> */
trait PartialScrollOffset extends StObject {
  
  var scrollLeft: js.UndefOr[Double] = js.undefined
  
  var scrollTop: js.UndefOr[Double] = js.undefined
}
object PartialScrollOffset {
  
  inline def apply(): PartialScrollOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollOffset]
  }
  
  extension [Self <: PartialScrollOffset](x: Self) {
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
  }
}
