package typings.reactOverlays.anon

import typings.popperjsCore.anon.PartialState
import typings.popperjsCore.typesMod.PositioningStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-overlays.react-overlays/esm/usePopper.UsePopperOptions, 'placement'> */
trait OmitUsePopperOptionsplace extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[js.Array[typings.popperjsCore.anon.PartialModifieranyany]] = js.undefined
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.undefined
  
  var strategy: js.UndefOr[PositioningStrategy] = js.undefined
}
object OmitUsePopperOptionsplace {
  
  inline def apply(): OmitUsePopperOptionsplace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitUsePopperOptionsplace]
  }
  
  extension [Self <: OmitUsePopperOptionsplace](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setModifiers(value: js.Array[typings.popperjsCore.anon.PartialModifieranyany]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(value: typings.popperjsCore.anon.PartialModifieranyany*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    inline def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
    
    inline def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
    
    inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
