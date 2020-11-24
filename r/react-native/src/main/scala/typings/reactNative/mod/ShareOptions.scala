package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareOptions extends js.Object {
  
  var dialogTitle: js.UndefOr[String] = js.native
  
  var excludedActivityTypes: js.UndefOr[js.Array[String]] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var tintColor: js.UndefOr[ColorValue] = js.native
}
object ShareOptions {
  
  @scala.inline
  def apply(): ShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareOptions]
  }
  
  @scala.inline
  implicit class ShareOptionsOps[Self <: ShareOptions] (val x: Self) extends AnyVal {
    
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
    def setDialogTitle(value: String): Self = this.set("dialogTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogTitle: Self = this.set("dialogTitle", js.undefined)
    
    @scala.inline
    def setExcludedActivityTypesVarargs(value: String*): Self = this.set("excludedActivityTypes", js.Array(value :_*))
    
    @scala.inline
    def setExcludedActivityTypes(value: js.Array[String]): Self = this.set("excludedActivityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedActivityTypes: Self = this.set("excludedActivityTypes", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
}
