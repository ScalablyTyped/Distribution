package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shown extends js.Object {
  
  var shown: Boolean = js.native
}
object Shown {
  
  @scala.inline
  def apply(shown: Boolean): Shown = {
    val __obj = js.Dynamic.literal(shown = shown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shown]
  }
  
  @scala.inline
  implicit class ShownOps[Self <: Shown] (val x: Self) extends AnyVal {
    
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
    def setShown(value: Boolean): Self = this.set("shown", value.asInstanceOf[js.Any])
  }
}
