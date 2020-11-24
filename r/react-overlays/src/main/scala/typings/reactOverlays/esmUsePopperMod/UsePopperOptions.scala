package typings.reactOverlays.esmUsePopperMod

import typings.popperjsCore.anon.PartialModifieranyany
import typings.popperjsCore.anon.PartialState
import typings.popperjsCore.typesMod.PositioningStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-overlays.react-overlays/esm/usePopper.Options, 'modifiers' | 'placement' | 'strategy'> & {  enabled :boolean | undefined,   placement :react-overlays.react-overlays/esm/usePopper.Options['placement'] | undefined,   strategy :react-overlays.react-overlays/esm/usePopper.Options['strategy'] | undefined,   modifiers :react-overlays.react-overlays/esm/usePopper.Options['modifiers'] | undefined} */
@js.native
trait UsePopperOptions extends js.Object {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[js.Array[PartialModifieranyany]] = js.native
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ PartialState, Unit]] = js.native
  
  var placement: js.UndefOr[typings.popperjsCore.enumsMod.Placement] = js.native
  
  var strategy: js.UndefOr[PositioningStrategy] = js.native
}
object UsePopperOptions {
  
  @scala.inline
  def apply(): UsePopperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsePopperOptions]
  }
  
  @scala.inline
  implicit class UsePopperOptionsOps[Self <: UsePopperOptions] (val x: Self) extends AnyVal {
    
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
    def setModifiersVarargs(value: PartialModifieranyany*): Self = this.set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[PartialModifieranyany]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setOnFirstUpdate(value: /* arg0 */ PartialState => Unit): Self = this.set("onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFirstUpdate: Self = this.set("onFirstUpdate", js.undefined)
    
    @scala.inline
    def setPlacement(value: typings.popperjsCore.enumsMod.Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
