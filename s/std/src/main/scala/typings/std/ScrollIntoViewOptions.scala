package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollIntoViewOptions extends ScrollOptions {
  
  var block: js.UndefOr[ScrollLogicalPosition] = js.native
  
  var `inline`: js.UndefOr[ScrollLogicalPosition] = js.native
}
object ScrollIntoViewOptions {
  
  @scala.inline
  def apply(): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
  
  @scala.inline
  implicit class ScrollIntoViewOptionsOps[Self <: ScrollIntoViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlock(value: ScrollLogicalPosition): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setInline(value: ScrollLogicalPosition): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
  }
}
