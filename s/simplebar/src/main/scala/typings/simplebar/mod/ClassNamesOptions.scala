package typings.simplebar.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined simplebar.simplebar.KnownClassNamesOptions & {[className: string] : string} */
@js.native
trait ClassNamesOptions extends /* className */ StringDictionary[String] {
  
  var contentEl: js.UndefOr[String] = js.native
  
  var contentWrapper: js.UndefOr[String] = js.native
  
  var dragging: js.UndefOr[String] = js.native
  
  var heightAutoObserverEl: js.UndefOr[String] = js.native
  
  var heightAutoObserverWrapperEl: js.UndefOr[String] = js.native
  
  var horizontal: js.UndefOr[String] = js.native
  
  var hover: js.UndefOr[String] = js.native
  
  var mask: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var scrollbar: js.UndefOr[String] = js.native
  
  var track: js.UndefOr[String] = js.native
  
  var vertical: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[String] = js.native
  
  var wrapper: js.UndefOr[String] = js.native
}
object ClassNamesOptions {
  
  @scala.inline
  def apply(): ClassNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNamesOptions]
  }
  
  @scala.inline
  implicit class ClassNamesOptionsOps[Self <: ClassNamesOptions] (val x: Self) extends AnyVal {
    
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
    def setContentEl(value: String): Self = this.set("contentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEl: Self = this.set("contentEl", js.undefined)
    
    @scala.inline
    def setContentWrapper(value: String): Self = this.set("contentWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentWrapper: Self = this.set("contentWrapper", js.undefined)
    
    @scala.inline
    def setDragging(value: String): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    
    @scala.inline
    def setHeightAutoObserverEl(value: String): Self = this.set("heightAutoObserverEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightAutoObserverEl: Self = this.set("heightAutoObserverEl", js.undefined)
    
    @scala.inline
    def setHeightAutoObserverWrapperEl(value: String): Self = this.set("heightAutoObserverWrapperEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightAutoObserverWrapperEl: Self = this.set("heightAutoObserverWrapperEl", js.undefined)
    
    @scala.inline
    def setHorizontal(value: String): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setHover(value: String): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setScrollbar(value: String): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbar: Self = this.set("scrollbar", js.undefined)
    
    @scala.inline
    def setTrack(value: String): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
