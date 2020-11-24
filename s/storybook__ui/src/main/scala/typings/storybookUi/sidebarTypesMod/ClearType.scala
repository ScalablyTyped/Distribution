package typings.storybookUi.sidebarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearType extends _DownshiftItem {
  
  def clearLastViewed(): Unit = js.native
}
object ClearType {
  
  @scala.inline
  def apply(clearLastViewed: () => Unit): ClearType = {
    val __obj = js.Dynamic.literal(clearLastViewed = js.Any.fromFunction0(clearLastViewed))
    __obj.asInstanceOf[ClearType]
  }
  
  @scala.inline
  implicit class ClearTypeOps[Self <: ClearType] (val x: Self) extends AnyVal {
    
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
    def setClearLastViewed(value: () => Unit): Self = this.set("clearLastViewed", js.Any.fromFunction0(value))
  }
}
