package typings.rmcTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixX extends js.Object {
  
  var fixX: Boolean = js.native
  
  var fixY: Boolean = js.native
}
object FixX {
  
  @scala.inline
  def apply(fixX: Boolean, fixY: Boolean): FixX = {
    val __obj = js.Dynamic.literal(fixX = fixX.asInstanceOf[js.Any], fixY = fixY.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixX]
  }
  
  @scala.inline
  implicit class FixXOps[Self <: FixX] (val x: Self) extends AnyVal {
    
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
    def setFixX(value: Boolean): Self = this.set("fixX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixY(value: Boolean): Self = this.set("fixY", value.asInstanceOf[js.Any])
  }
}
