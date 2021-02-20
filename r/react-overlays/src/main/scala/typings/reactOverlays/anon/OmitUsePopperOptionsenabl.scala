package typings.reactOverlays.anon

import typings.popperjsCore.anon.PartialState
import typings.popperjsCore.typesMod.PositioningStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-overlays.react-overlays/esm/usePopper.UsePopperOptions, 'enabled' | 'placement'> */
@js.native
trait OmitUsePopperOptionsenabl extends StObject {
  
  var modifiers: js.UndefOr[js.Array[typings.popperjsCore.anon.PartialModifieranyany]] = js.native
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.native
  
  var strategy: js.UndefOr[PositioningStrategy] = js.native
}
object OmitUsePopperOptionsenabl {
  
  @scala.inline
  def apply(): OmitUsePopperOptionsenabl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitUsePopperOptionsenabl]
  }
  
  @scala.inline
  implicit class OmitUsePopperOptionsenablMutableBuilder[Self <: OmitUsePopperOptionsenabl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiers(value: js.Array[typings.popperjsCore.anon.PartialModifieranyany]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setModifiersVarargs(value: typings.popperjsCore.anon.PartialModifieranyany*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    @scala.inline
    def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = StObject.set(x, "onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFirstUpdateUndefined: Self = StObject.set(x, "onFirstUpdate", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
