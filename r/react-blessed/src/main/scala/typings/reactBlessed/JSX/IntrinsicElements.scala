package typings.reactBlessed.JSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrinsicElements extends js.Object {
  
  var `blessed-bigtext`: js.Any = js.native
  
  var `blessed-box`: js.Any = js.native
  
  var `blessed-button`: js.Any = js.native
  
  var `blessed-checkbox`: js.Any = js.native
  
  var `blessed-escape`: js.Any = js.native
  
  var `blessed-filemanager`: js.Any = js.native
  
  var `blessed-form`: js.Any = js.native
  
  var `blessed-input`: js.Any = js.native
  
  var `blessed-layout`: js.Any = js.native
  
  var `blessed-line`: js.Any = js.native
  
  var `blessed-list`: js.Any = js.native
  
  var `blessed-listbar`: js.Any = js.native
  
  var `blessed-listtable`: js.Any = js.native
  
  var `blessed-loading`: js.Any = js.native
  
  var `blessed-log`: js.Any = js.native
  
  var `blessed-message`: js.Any = js.native
  
  var `blessed-program`: js.Any = js.native
  
  var `blessed-progressbar`: js.Any = js.native
  
  var `blessed-prompt`: js.Any = js.native
  
  var `blessed-question`: js.Any = js.native
  
  var `blessed-radiobutton`: js.Any = js.native
  
  var `blessed-radioset`: js.Any = js.native
  
  var `blessed-scrollablebox`: js.Any = js.native
  
  var `blessed-scrollabletext`: js.Any = js.native
  
  var `blessed-table`: js.Any = js.native
  
  var `blessed-terminal`: js.Any = js.native
  
  var `blessed-text`: js.Any = js.native
  
  var `blessed-textarea`: js.Any = js.native
  
  var `blessed-textbox`: js.Any = js.native
}
object IntrinsicElements {
  
  @scala.inline
  def apply(
    `blessed-bigtext`: js.Any,
    `blessed-box`: js.Any,
    `blessed-button`: js.Any,
    `blessed-checkbox`: js.Any,
    `blessed-escape`: js.Any,
    `blessed-filemanager`: js.Any,
    `blessed-form`: js.Any,
    `blessed-input`: js.Any,
    `blessed-layout`: js.Any,
    `blessed-line`: js.Any,
    `blessed-list`: js.Any,
    `blessed-listbar`: js.Any,
    `blessed-listtable`: js.Any,
    `blessed-loading`: js.Any,
    `blessed-log`: js.Any,
    `blessed-message`: js.Any,
    `blessed-program`: js.Any,
    `blessed-progressbar`: js.Any,
    `blessed-prompt`: js.Any,
    `blessed-question`: js.Any,
    `blessed-radiobutton`: js.Any,
    `blessed-radioset`: js.Any,
    `blessed-scrollablebox`: js.Any,
    `blessed-scrollabletext`: js.Any,
    `blessed-table`: js.Any,
    `blessed-terminal`: js.Any,
    `blessed-text`: js.Any,
    `blessed-textarea`: js.Any,
    `blessed-textbox`: js.Any
  ): IntrinsicElements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blessed-bigtext")(`blessed-bigtext`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-box")(`blessed-box`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-button")(`blessed-button`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-checkbox")(`blessed-checkbox`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-escape")(`blessed-escape`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-filemanager")(`blessed-filemanager`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-form")(`blessed-form`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-input")(`blessed-input`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-layout")(`blessed-layout`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-line")(`blessed-line`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-list")(`blessed-list`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-listbar")(`blessed-listbar`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-listtable")(`blessed-listtable`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-loading")(`blessed-loading`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-log")(`blessed-log`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-message")(`blessed-message`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-program")(`blessed-program`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-progressbar")(`blessed-progressbar`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-prompt")(`blessed-prompt`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-question")(`blessed-question`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-radiobutton")(`blessed-radiobutton`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-radioset")(`blessed-radioset`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-scrollablebox")(`blessed-scrollablebox`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-scrollabletext")(`blessed-scrollabletext`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-table")(`blessed-table`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-terminal")(`blessed-terminal`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-text")(`blessed-text`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-textarea")(`blessed-textarea`.asInstanceOf[js.Any])
    __obj.updateDynamic("blessed-textbox")(`blessed-textbox`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicElements]
  }
  
  @scala.inline
  implicit class IntrinsicElementsOps[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
    
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
    def `setBlessed-bigtext`(value: js.Any): Self = this.set("blessed-bigtext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-box`(value: js.Any): Self = this.set("blessed-box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-button`(value: js.Any): Self = this.set("blessed-button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-checkbox`(value: js.Any): Self = this.set("blessed-checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-escape`(value: js.Any): Self = this.set("blessed-escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-filemanager`(value: js.Any): Self = this.set("blessed-filemanager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-form`(value: js.Any): Self = this.set("blessed-form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-input`(value: js.Any): Self = this.set("blessed-input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-layout`(value: js.Any): Self = this.set("blessed-layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-line`(value: js.Any): Self = this.set("blessed-line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-list`(value: js.Any): Self = this.set("blessed-list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-listbar`(value: js.Any): Self = this.set("blessed-listbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-listtable`(value: js.Any): Self = this.set("blessed-listtable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-loading`(value: js.Any): Self = this.set("blessed-loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-log`(value: js.Any): Self = this.set("blessed-log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-message`(value: js.Any): Self = this.set("blessed-message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-program`(value: js.Any): Self = this.set("blessed-program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-progressbar`(value: js.Any): Self = this.set("blessed-progressbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-prompt`(value: js.Any): Self = this.set("blessed-prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-question`(value: js.Any): Self = this.set("blessed-question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-radiobutton`(value: js.Any): Self = this.set("blessed-radiobutton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-radioset`(value: js.Any): Self = this.set("blessed-radioset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-scrollablebox`(value: js.Any): Self = this.set("blessed-scrollablebox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-scrollabletext`(value: js.Any): Self = this.set("blessed-scrollabletext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-table`(value: js.Any): Self = this.set("blessed-table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-terminal`(value: js.Any): Self = this.set("blessed-terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-text`(value: js.Any): Self = this.set("blessed-text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-textarea`(value: js.Any): Self = this.set("blessed-textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlessed-textbox`(value: js.Any): Self = this.set("blessed-textbox", value.asInstanceOf[js.Any])
  }
}
