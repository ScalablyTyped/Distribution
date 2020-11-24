package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSData extends js.Object {
  
  var document: SketchMSDocument = js.native
  
  var meta: SketchMSMeta = js.native
  
  var pages: js.Array[SketchMSPageLayer] = js.native
  
  var previews: js.Array[SketchMSPreview] = js.native
  
  var user: SketchMSUser = js.native
}
object SketchMSData {
  
  @scala.inline
  def apply(
    document: SketchMSDocument,
    meta: SketchMSMeta,
    pages: js.Array[SketchMSPageLayer],
    previews: js.Array[SketchMSPreview],
    user: SketchMSUser
  ): SketchMSData = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSData]
  }
  
  @scala.inline
  implicit class SketchMSDataOps[Self <: SketchMSData] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: SketchMSDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: SketchMSMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: SketchMSPageLayer*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[SketchMSPageLayer]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewsVarargs(value: SketchMSPreview*): Self = this.set("previews", js.Array(value :_*))
    
    @scala.inline
    def setPreviews(value: js.Array[SketchMSPreview]): Self = this.set("previews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: SketchMSUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
