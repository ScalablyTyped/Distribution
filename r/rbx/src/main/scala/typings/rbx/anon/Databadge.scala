package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Databadge extends js.Object {
  
  var `data-badge`: js.UndefOr[String | Double] = js.native
}
object Databadge {
  
  @scala.inline
  def apply(): Databadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Databadge]
  }
  
  @scala.inline
  implicit class DatabadgeOps[Self <: Databadge] (val x: Self) extends AnyVal {
    
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
    def `setData-badge`(value: String | Double): Self = this.set("data-badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteData-badge`: Self = this.set("data-badge", js.undefined)
  }
}
