package typings.storybookComponents.anon

import typings.std.Element
import typings.storybookComponents.popperjsCoreLibEnumsMod.Boundary
import typings.storybookComponents.popperjsCoreLibEnumsMod.RootBoundary
import typings.storybookComponents.popperjsCoreLibModifiersPreventOverflowMod.TetherOffset
import typings.storybookComponents.popperjsCoreLibTypesMod.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/components.@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-modifiers-preventOverflow.Options> */
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
  
  extension [Self <: PartialOptionsAltAxis](x: Self) {
    
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
