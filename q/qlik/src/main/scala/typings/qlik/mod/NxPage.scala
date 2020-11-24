package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxPage extends js.Object {
  
  var qHeight: js.UndefOr[Double] = js.native
  
  var qLeft: js.UndefOr[Double] = js.native
  
  var qTop: js.UndefOr[Double] = js.native
  
  var qWidth: js.UndefOr[Double] = js.native
}
object NxPage {
  
  @scala.inline
  def apply(): NxPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NxPage]
  }
  
  @scala.inline
  implicit class NxPageOps[Self <: NxPage] (val x: Self) extends AnyVal {
    
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
    def setQHeight(value: Double): Self = this.set("qHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQHeight: Self = this.set("qHeight", js.undefined)
    
    @scala.inline
    def setQLeft(value: Double): Self = this.set("qLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQLeft: Self = this.set("qLeft", js.undefined)
    
    @scala.inline
    def setQTop(value: Double): Self = this.set("qTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQTop: Self = this.set("qTop", js.undefined)
    
    @scala.inline
    def setQWidth(value: Double): Self = this.set("qWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQWidth: Self = this.set("qWidth", js.undefined)
  }
}
