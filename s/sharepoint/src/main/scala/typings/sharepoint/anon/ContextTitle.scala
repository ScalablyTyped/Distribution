package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextTitle extends js.Object {
  
  var contextTitle: String = js.native
  
  var openDocumentsInClient: Boolean = js.native
}
object ContextTitle {
  
  @scala.inline
  def apply(contextTitle: String, openDocumentsInClient: Boolean): ContextTitle = {
    val __obj = js.Dynamic.literal(contextTitle = contextTitle.asInstanceOf[js.Any], openDocumentsInClient = openDocumentsInClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextTitle]
  }
  
  @scala.inline
  implicit class ContextTitleOps[Self <: ContextTitle] (val x: Self) extends AnyVal {
    
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
    def setContextTitle(value: String): Self = this.set("contextTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenDocumentsInClient(value: Boolean): Self = this.set("openDocumentsInClient", value.asInstanceOf[js.Any])
  }
}
