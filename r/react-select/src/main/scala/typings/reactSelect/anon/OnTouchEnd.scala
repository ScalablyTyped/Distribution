package typings.reactSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnTouchEnd extends js.Object {
  
  var className: String = js.native
  
  def onClick(event: js.Any): Unit = js.native
  
  def onMouseDown(event: js.Any): Unit = js.native
  
  def onTouchEnd(event: js.Any): Unit = js.native
}
object OnTouchEnd {
  
  @scala.inline
  def apply(
    className: String,
    onClick: js.Any => Unit,
    onMouseDown: js.Any => Unit,
    onTouchEnd: js.Any => Unit
  ): OnTouchEnd = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchEnd = js.Any.fromFunction1(onTouchEnd))
    __obj.asInstanceOf[OnTouchEnd]
  }
  
  @scala.inline
  implicit class OnTouchEndOps[Self <: OnTouchEnd] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDown(value: js.Any => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEnd(value: js.Any => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
  }
}
