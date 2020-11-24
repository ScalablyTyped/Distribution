package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QBookmarkId extends js.Object {
  
  var qBookmarkId: js.UndefOr[String] = js.native
  
  var qExpires: js.UndefOr[Double] = js.native
}
object QBookmarkId {
  
  @scala.inline
  def apply(): QBookmarkId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QBookmarkId]
  }
  
  @scala.inline
  implicit class QBookmarkIdOps[Self <: QBookmarkId] (val x: Self) extends AnyVal {
    
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
    def setQBookmarkId(value: String): Self = this.set("qBookmarkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQBookmarkId: Self = this.set("qBookmarkId", js.undefined)
    
    @scala.inline
    def setQExpires(value: Double): Self = this.set("qExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQExpires: Self = this.set("qExpires", js.undefined)
  }
}
