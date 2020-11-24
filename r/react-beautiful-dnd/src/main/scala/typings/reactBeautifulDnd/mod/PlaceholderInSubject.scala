package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceholderInSubject extends js.Object {
  
  // might not actually be increased by
  // placeholder if there is no required space
  var increasedBy: js.UndefOr[Position] = js.native
  
  // max scroll before placeholder added
  // will be null if there was no frame
  var oldFrameMaxScroll: js.UndefOr[Position] = js.native
  
  var placeholderSize: Position = js.native
}
object PlaceholderInSubject {
  
  @scala.inline
  def apply(placeholderSize: Position): PlaceholderInSubject = {
    val __obj = js.Dynamic.literal(placeholderSize = placeholderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderInSubject]
  }
  
  @scala.inline
  implicit class PlaceholderInSubjectOps[Self <: PlaceholderInSubject] (val x: Self) extends AnyVal {
    
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
    def setPlaceholderSize(value: Position): Self = this.set("placeholderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreasedBy(value: Position): Self = this.set("increasedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreasedBy: Self = this.set("increasedBy", js.undefined)
    
    @scala.inline
    def setOldFrameMaxScroll(value: Position): Self = this.set("oldFrameMaxScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldFrameMaxScroll: Self = this.set("oldFrameMaxScroll", js.undefined)
  }
}
