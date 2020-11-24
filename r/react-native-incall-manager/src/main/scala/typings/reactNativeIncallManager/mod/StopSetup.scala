package typings.reactNativeIncallManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopSetup extends js.Object {
  
  var busytone: js.UndefOr[String] = js.native
}
object StopSetup {
  
  @scala.inline
  def apply(): StopSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopSetup]
  }
  
  @scala.inline
  implicit class StopSetupOps[Self <: StopSetup] (val x: Self) extends AnyVal {
    
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
    def setBusytone(value: String): Self = this.set("busytone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusytone: Self = this.set("busytone", js.undefined)
  }
}
