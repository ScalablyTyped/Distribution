package typings.reactRte.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarConfig extends js.Object {
  
  var BLOCK_TYPE_BUTTONS: StyleConfigList = js.native
  
  var BLOCK_TYPE_DROPDOWN: StyleConfigList = js.native
  
  var INLINE_STYLE_BUTTONS: StyleConfigList = js.native
  
  var display: js.Array[GroupName] = js.native
  
  var extraProps: js.UndefOr[js.Object] = js.native
}
object ToolbarConfig {
  
  @scala.inline
  def apply(
    BLOCK_TYPE_BUTTONS: StyleConfigList,
    BLOCK_TYPE_DROPDOWN: StyleConfigList,
    INLINE_STYLE_BUTTONS: StyleConfigList,
    display: js.Array[GroupName]
  ): ToolbarConfig = {
    val __obj = js.Dynamic.literal(BLOCK_TYPE_BUTTONS = BLOCK_TYPE_BUTTONS.asInstanceOf[js.Any], BLOCK_TYPE_DROPDOWN = BLOCK_TYPE_DROPDOWN.asInstanceOf[js.Any], INLINE_STYLE_BUTTONS = INLINE_STYLE_BUTTONS.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarConfig]
  }
  
  @scala.inline
  implicit class ToolbarConfigOps[Self <: ToolbarConfig] (val x: Self) extends AnyVal {
    
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
    def setBLOCK_TYPE_BUTTONSVarargs(value: StyleConfig*): Self = this.set("BLOCK_TYPE_BUTTONS", js.Array(value :_*))
    
    @scala.inline
    def setBLOCK_TYPE_BUTTONS(value: StyleConfigList): Self = this.set("BLOCK_TYPE_BUTTONS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBLOCK_TYPE_DROPDOWNVarargs(value: StyleConfig*): Self = this.set("BLOCK_TYPE_DROPDOWN", js.Array(value :_*))
    
    @scala.inline
    def setBLOCK_TYPE_DROPDOWN(value: StyleConfigList): Self = this.set("BLOCK_TYPE_DROPDOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINLINE_STYLE_BUTTONSVarargs(value: StyleConfig*): Self = this.set("INLINE_STYLE_BUTTONS", js.Array(value :_*))
    
    @scala.inline
    def setINLINE_STYLE_BUTTONS(value: StyleConfigList): Self = this.set("INLINE_STYLE_BUTTONS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayVarargs(value: GroupName*): Self = this.set("display", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(value: js.Array[GroupName]): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraProps(value: js.Object): Self = this.set("extraProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraProps: Self = this.set("extraProps", js.undefined)
  }
}
