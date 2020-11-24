package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocsOnly extends js.Object {
  
  var docsOnly: js.UndefOr[Boolean] = js.native
  
  var viewMode: js.UndefOr[typings.storybookApi.addonsMod.ViewMode] = js.native
}
object DocsOnly {
  
  @scala.inline
  def apply(): DocsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocsOnly]
  }
  
  @scala.inline
  implicit class DocsOnlyOps[Self <: DocsOnly] (val x: Self) extends AnyVal {
    
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
    def setDocsOnly(value: Boolean): Self = this.set("docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocsOnly: Self = this.set("docsOnly", js.undefined)
    
    @scala.inline
    def setViewMode(value: typings.storybookApi.addonsMod.ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
