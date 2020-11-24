package typings.spdy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoSpdy31 extends js.Object {
  
  var autoSpdy31: js.UndefOr[Boolean] = js.native
  
  var windowSize: js.UndefOr[Double] = js.native
}
object AutoSpdy31 {
  
  @scala.inline
  def apply(): AutoSpdy31 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoSpdy31]
  }
  
  @scala.inline
  implicit class AutoSpdy31Ops[Self <: AutoSpdy31] (val x: Self) extends AnyVal {
    
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
    def setAutoSpdy31(value: Boolean): Self = this.set("autoSpdy31", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSpdy31: Self = this.set("autoSpdy31", js.undefined)
    
    @scala.inline
    def setWindowSize(value: Double): Self = this.set("windowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowSize: Self = this.set("windowSize", js.undefined)
  }
}
