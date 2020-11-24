package typings.screeps.anon

import typings.screeps.screepsStrings.ZH
import typings.screeps.screepsStrings.ZO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait K extends js.Object {
  
  var H: ZH = js.native
  
  var K: typings.screeps.screepsStrings.ZK = js.native
  
  var O: ZO = js.native
}
object K {
  
  @scala.inline
  def apply(H: ZH, K: typings.screeps.screepsStrings.ZK, O: ZO): K = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], K = K.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[K]
  }
  
  @scala.inline
  implicit class KOps[Self <: K] (val x: Self) extends AnyVal {
    
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
    def setH(value: ZH): Self = this.set("H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK(value: typings.screeps.screepsStrings.ZK): Self = this.set("K", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: ZO): Self = this.set("O", value.asInstanceOf[js.Any])
  }
}
