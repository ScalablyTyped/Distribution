package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictparameterName
  extends /* key */ StringDictionary[js.Any] {
  
  var docsOnly: js.UndefOr[Boolean] = js.native
  
  var fileName: String = js.native
  
  var options: StringDictionary[js.Any] = js.native
  
  var viewMode: js.UndefOr[typings.storybookApi.addonsMod.ViewMode] = js.native
}
object DictparameterName {
  
  @scala.inline
  def apply(fileName: String, options: StringDictionary[js.Any]): DictparameterName = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictparameterName]
  }
  
  @scala.inline
  implicit class DictparameterNameOps[Self <: DictparameterName] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    
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
