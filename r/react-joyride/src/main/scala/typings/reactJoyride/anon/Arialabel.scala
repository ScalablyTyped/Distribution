package typings.reactJoyride.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arialabel extends js.Object {
  
  var `aria-label`: String = js.native
  
  var `data-action`: String = js.native
  
  def onClick(): Unit = js.native
  
  var role: String = js.native
  
  var title: String = js.native
}
object Arialabel {
  
  @scala.inline
  def apply(`aria-label`: String, `data-action`: String, onClick: () => Unit, role: String, title: String): Arialabel = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), role = role.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-action")(`data-action`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  
  @scala.inline
  implicit class ArialabelOps[Self <: Arialabel] (val x: Self) extends AnyVal {
    
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
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-action`(value: String): Self = this.set("data-action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
