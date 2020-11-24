package typings.reactOverlays.anon

import typings.popperjsCore.anon.PartialState
import typings.popperjsCore.typesMod.PositioningStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-overlays.react-overlays/esm/usePopper.UsePopperOptions, 'placement'> */
@js.native
trait OmitUsePopperOptionsplace extends js.Object {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[js.Array[typings.popperjsCore.anon.PartialModifieranyany]] = js.native
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.native
  
  var strategy: js.UndefOr[PositioningStrategy] = js.native
}
object OmitUsePopperOptionsplace {
  
  @scala.inline
  def apply(): OmitUsePopperOptionsplace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitUsePopperOptionsplace]
  }
  
  @scala.inline
  implicit class OmitUsePopperOptionsplaceOps[Self <: OmitUsePopperOptionsplace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setModifiersVarargs(value: typings.popperjsCore.anon.PartialModifieranyany*): Self = this.set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[typings.popperjsCore.anon.PartialModifieranyany]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = this.set("onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFirstUpdate: Self = this.set("onFirstUpdate", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
