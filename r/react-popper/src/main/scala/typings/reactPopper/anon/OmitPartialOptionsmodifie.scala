package typings.reactPopper.anon

import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.typesMod.PositioningStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<std.Partial<@popperjs/core.@popperjs/core.Options>, 'modifiers'> */
@js.native
trait OmitPartialOptionsmodifie extends js.Object {
  
  var onFirstUpdate: js.UndefOr[js.Function1[/* arg0 */ typings.popperjsCore.anon.PartialState, Unit]] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var strategy: js.UndefOr[PositioningStrategy] = js.native
}
object OmitPartialOptionsmodifie {
  
  @scala.inline
  def apply(): OmitPartialOptionsmodifie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPartialOptionsmodifie]
  }
  
  @scala.inline
  implicit class OmitPartialOptionsmodifieOps[Self <: OmitPartialOptionsmodifie] (val x: Self) extends AnyVal {
    
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
    def setOnFirstUpdate(value: /* arg0 */ typings.popperjsCore.anon.PartialState => Unit): Self = this.set("onFirstUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFirstUpdate: Self = this.set("onFirstUpdate", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
}
