package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerHTML extends js.Object {
  
  var innerHTML: java.lang.String = js.native
}
object InnerHTML {
  
  @scala.inline
  def apply(innerHTML: java.lang.String): InnerHTML = {
    val __obj = js.Dynamic.literal(innerHTML = innerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerHTML]
  }
  
  @scala.inline
  implicit class InnerHTMLOps[Self <: InnerHTML] (val x: Self) extends AnyVal {
    
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
    def setInnerHTML(value: java.lang.String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
  }
}
