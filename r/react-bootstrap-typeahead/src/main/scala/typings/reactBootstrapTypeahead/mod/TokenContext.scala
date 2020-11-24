package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenContext extends js.Object {
  
  var active: Boolean = js.native
  
  def onBlur(e: js.Any): Unit = js.native
  
  def onClick(e: js.Any): Unit = js.native
  
  def onFocus(e: js.Any): Unit = js.native
  
  def onKeyDown(e: js.Any): Unit = js.native
}
object TokenContext {
  
  @scala.inline
  def apply(
    active: Boolean,
    onBlur: js.Any => Unit,
    onClick: js.Any => Unit,
    onFocus: js.Any => Unit,
    onKeyDown: js.Any => Unit
  ): TokenContext = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[TokenContext]
  }
  
  @scala.inline
  implicit class TokenContextOps[Self <: TokenContext] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: js.Any => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClick(value: js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocus(value: js.Any => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDown(value: js.Any => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
  }
}
