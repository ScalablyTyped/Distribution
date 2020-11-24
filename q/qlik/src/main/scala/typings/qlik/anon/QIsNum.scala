package typings.qlik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QIsNum extends js.Object {
  
  var qIsNum: Boolean = js.native
  
  var qString: String = js.native
}
object QIsNum {
  
  @scala.inline
  def apply(qIsNum: Boolean, qString: String): QIsNum = {
    val __obj = js.Dynamic.literal(qIsNum = qIsNum.asInstanceOf[js.Any], qString = qString.asInstanceOf[js.Any])
    __obj.asInstanceOf[QIsNum]
  }
  
  @scala.inline
  implicit class QIsNumOps[Self <: QIsNum] (val x: Self) extends AnyVal {
    
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
    def setQIsNum(value: Boolean): Self = this.set("qIsNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQString(value: String): Self = this.set("qString", value.asInstanceOf[js.Any])
  }
}
