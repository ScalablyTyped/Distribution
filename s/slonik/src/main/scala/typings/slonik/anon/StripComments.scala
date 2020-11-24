package typings.slonik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripComments extends js.Object {
  
  var stripComments: js.UndefOr[Boolean] = js.native
}
object StripComments {
  
  @scala.inline
  def apply(): StripComments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripComments]
  }
  
  @scala.inline
  implicit class StripCommentsOps[Self <: StripComments] (val x: Self) extends AnyVal {
    
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
    def setStripComments(value: Boolean): Self = this.set("stripComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripComments: Self = this.set("stripComments", js.undefined)
  }
}
