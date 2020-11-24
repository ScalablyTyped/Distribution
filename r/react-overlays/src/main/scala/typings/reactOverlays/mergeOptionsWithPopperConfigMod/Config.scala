package typings.reactOverlays.mergeOptionsWithPopperConfigMod

import typings.reactOverlays.usePopperMod.Offset
import typings.reactOverlays.usePopperMod.OffsetValue
import typings.reactOverlays.usePopperMod.Placement
import typings.reactOverlays.usePopperMod.UsePopperOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var alignEnd: js.UndefOr[Boolean] = js.native
  
  var arrowElement: js.UndefOr[Element | Null] = js.native
  
  var containerPadding: js.UndefOr[Double] = js.native
  
  var enableEvents: js.UndefOr[Boolean] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var flip: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Offset] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var popperConfig: js.UndefOr[UsePopperOptions] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setAlignEnd(value: Boolean): Self = this.set("alignEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignEnd: Self = this.set("alignEnd", js.undefined)
    
    @scala.inline
    def setArrowElement(value: Element): Self = this.set("arrowElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowElement: Self = this.set("arrowElement", js.undefined)
    
    @scala.inline
    def setArrowElementNull: Self = this.set("arrowElement", null)
    
    @scala.inline
    def setContainerPadding(value: Double): Self = this.set("containerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerPadding: Self = this.set("containerPadding", js.undefined)
    
    @scala.inline
    def setEnableEvents(value: Boolean): Self = this.set("enableEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEvents: Self = this.set("enableEvents", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setOffsetFunction1(value: /* details */ typings.reactOverlays.anon.Placement => OffsetValue): Self = this.set("offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPopperConfig(value: UsePopperOptions): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperConfig: Self = this.set("popperConfig", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
