package typings.rcTable.anon

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentTarget extends js.Object {
  
  var currentTarget: HTMLDivElement = js.native
  
  var scrollLeft: js.UndefOr[Double] = js.native
}
object CurrentTarget {
  
  @scala.inline
  def apply(currentTarget: HTMLDivElement): CurrentTarget = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTarget]
  }
  
  @scala.inline
  implicit class CurrentTargetOps[Self <: CurrentTarget] (val x: Self) extends AnyVal {
    
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
    def setCurrentTarget(value: HTMLDivElement): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
  }
}
