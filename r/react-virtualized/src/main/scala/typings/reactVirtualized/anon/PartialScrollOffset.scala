package typings.reactVirtualized.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-virtualized.react-virtualized/dist/es/Grid.ScrollOffset> */
@js.native
trait PartialScrollOffset extends StObject {
  
  var scrollLeft: js.UndefOr[Double] = js.native
  
  var scrollTop: js.UndefOr[Double] = js.native
}
object PartialScrollOffset {
  
  @scala.inline
  def apply(): PartialScrollOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollOffset]
  }
  
  @scala.inline
  implicit class PartialScrollOffsetMutableBuilder[Self <: PartialScrollOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
  }
}
