package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Updatepublished extends js.Object {
  
  var update_published: js.UndefOr[Boolean] = js.native
}
object Updatepublished {
  
  @scala.inline
  def apply(): Updatepublished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Updatepublished]
  }
  
  @scala.inline
  implicit class UpdatepublishedOps[Self <: Updatepublished] (val x: Self) extends AnyVal {
    
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
    def setUpdate_published(value: Boolean): Self = this.set("update_published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate_published: Self = this.set("update_published", js.undefined)
  }
}
