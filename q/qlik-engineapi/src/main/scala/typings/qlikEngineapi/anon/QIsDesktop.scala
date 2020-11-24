package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QIsDesktop extends js.Object {
  
  var qIsDesktop: Boolean = js.native
  
  var qSSOEnabled: Boolean = js.native
}
object QIsDesktop {
  
  @scala.inline
  def apply(qIsDesktop: Boolean, qSSOEnabled: Boolean): QIsDesktop = {
    val __obj = js.Dynamic.literal(qIsDesktop = qIsDesktop.asInstanceOf[js.Any], qSSOEnabled = qSSOEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[QIsDesktop]
  }
  
  @scala.inline
  implicit class QIsDesktopOps[Self <: QIsDesktop] (val x: Self) extends AnyVal {
    
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
    def setQIsDesktop(value: Boolean): Self = this.set("qIsDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSSOEnabled(value: Boolean): Self = this.set("qSSOEnabled", value.asInstanceOf[js.Any])
  }
}
