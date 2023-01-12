package typings.reactFloater.anon

import typings.popperjsCore.anon.AltAxis
import typings.popperjsCore.anon.Placement
import typings.popperjsCore.libEnumsMod.Boundary
import typings.popperjsCore.libEnumsMod.RootBoundary
import typings.popperjsCore.libModifiersPreventOverflowMod.TetherOffset
import typings.popperjsCore.libTypesMod.Padding
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/preventOverflow.Options> */
trait PartialOptionsAltAxis extends StObject {
  
  var altAxis: js.UndefOr[Boolean] = js.undefined
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[Boundary] = js.undefined
  
  var mainAxis: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
  
  var tether: js.UndefOr[Boolean] = js.undefined
  
  var tetherOffset: js.UndefOr[TetherOffset] = js.undefined
}
object PartialOptionsAltAxis {
  
  inline def apply(): PartialOptionsAltAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAltAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOptionsAltAxis] (val x: Self) extends AnyVal {
    
    inline def setAltAxis(value: Boolean): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
    
    inline def setAltAxisUndefined: Self = StObject.set(x, "altAxis", js.undefined)
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setBoundaryVarargs(value: Element*): Self = StObject.set(x, "boundary", js.Array(value*))
    
    inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
    
    inline def setTether(value: Boolean): Self = StObject.set(x, "tether", value.asInstanceOf[js.Any])
    
    inline def setTetherOffset(value: TetherOffset): Self = StObject.set(x, "tetherOffset", value.asInstanceOf[js.Any])
    
    inline def setTetherOffsetFunction1(value: /* arg0 */ Placement => Double | AltAxis): Self = StObject.set(x, "tetherOffset", js.Any.fromFunction1(value))
    
    inline def setTetherOffsetUndefined: Self = StObject.set(x, "tetherOffset", js.undefined)
    
    inline def setTetherUndefined: Self = StObject.set(x, "tether", js.undefined)
  }
}
