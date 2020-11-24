package typings.reactShowMore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactShowMoreProps extends js.Object {
  
  var anchorClass: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[String] = js.native
  
  var less: js.UndefOr[String] = js.native
  
  var lines: js.UndefOr[Double] = js.native
  
  var more: js.UndefOr[String] = js.native
}
object ReactShowMoreProps {
  
  @scala.inline
  def apply(): ReactShowMoreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactShowMoreProps]
  }
  
  @scala.inline
  implicit class ReactShowMorePropsOps[Self <: ReactShowMoreProps] (val x: Self) extends AnyVal {
    
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
    def setAnchorClass(value: String): Self = this.set("anchorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorClass: Self = this.set("anchorClass", js.undefined)
    
    @scala.inline
    def setChildren(value: String): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setLess(value: String): Self = this.set("less", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLess: Self = this.set("less", js.undefined)
    
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setMore(value: String): Self = this.set("more", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMore: Self = this.set("more", js.undefined)
  }
}
