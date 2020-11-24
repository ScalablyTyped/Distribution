package typings.primereact.inputTextareaMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputTextareaProps
  extends AllHTMLAttributes[HTMLTextAreaElement]
     with ClassAttributes[HTMLTextAreaElement]
     with /* key */ StringDictionary[js.Any] {
  
  var autoResize: js.UndefOr[Boolean] = js.native
  
  var tooltip: js.UndefOr[js.Any] = js.native
  
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
}
object InputTextareaProps {
  
  @scala.inline
  def apply(): InputTextareaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputTextareaProps]
  }
  
  @scala.inline
  implicit class InputTextareaPropsOps[Self <: InputTextareaProps] (val x: Self) extends AnyVal {
    
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
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
  }
}
