package typings.reactHighlight.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightProps extends js.Object {
  
  /**
    * Language name to use as a class to signal type to highlight.js.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Set innerHTML=true to highlight multiple code snippets at a time.
    */
  var innerHTML: js.UndefOr[Boolean] = js.native
}
object HighlightProps {
  
  @scala.inline
  def apply(): HighlightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightProps]
  }
  
  @scala.inline
  implicit class HighlightPropsOps[Self <: HighlightProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setInnerHTML(value: Boolean): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerHTML: Self = this.set("innerHTML", js.undefined)
  }
}
