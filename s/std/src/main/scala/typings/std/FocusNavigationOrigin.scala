package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusNavigationOrigin extends js.Object {
  
  var originHeight: js.UndefOr[Double] = js.native
  
  var originLeft: js.UndefOr[Double] = js.native
  
  var originTop: js.UndefOr[Double] = js.native
  
  var originWidth: js.UndefOr[Double] = js.native
}
object FocusNavigationOrigin {
  
  @scala.inline
  def apply(): FocusNavigationOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusNavigationOrigin]
  }
  
  @scala.inline
  implicit class FocusNavigationOriginOps[Self <: FocusNavigationOrigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOriginHeight(value: Double): Self = this.set("originHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginHeight: Self = this.set("originHeight", js.undefined)
    
    @scala.inline
    def setOriginLeft(value: Double): Self = this.set("originLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginLeft: Self = this.set("originLeft", js.undefined)
    
    @scala.inline
    def setOriginTop(value: Double): Self = this.set("originTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginTop: Self = this.set("originTop", js.undefined)
    
    @scala.inline
    def setOriginWidth(value: Double): Self = this.set("originWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginWidth: Self = this.set("originWidth", js.undefined)
  }
}
