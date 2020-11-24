package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchOptionsArray extends js.Object {
  
  var `-d`: js.UndefOr[String] = js.native
  
  var `-r`: js.UndefOr[String] = js.native
}
object TouchOptionsArray {
  
  @scala.inline
  def apply(): TouchOptionsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptionsArray]
  }
  
  @scala.inline
  implicit class TouchOptionsArrayOps[Self <: TouchOptionsArray] (val x: Self) extends AnyVal {
    
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
    def `set-d`(value: String): Self = this.set("-d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-d`: Self = this.set("-d", js.undefined)
    
    @scala.inline
    def `set-r`(value: String): Self = this.set("-r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-r`: Self = this.set("-r", js.undefined)
  }
}
