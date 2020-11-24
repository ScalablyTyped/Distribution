package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiSuiteV2
  extends /* key */ StringDictionary[js.Any] {
  
  var appVersionId: js.UndefOr[Id] = js.native
  
  var deviceIds: js.UndefOr[StringDictionary[js.Array[Id]]] = js.native
  
  var frameworkVersion: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[Id] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ApiSuiteV2 {
  
  @scala.inline
  def apply(): ApiSuiteV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiSuiteV2]
  }
  
  @scala.inline
  implicit class ApiSuiteV2Ops[Self <: ApiSuiteV2] (val x: Self) extends AnyVal {
    
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
    def setAppVersionId(value: Id): Self = this.set("appVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersionId: Self = this.set("appVersionId", js.undefined)
    
    @scala.inline
    def setDeviceIds(value: StringDictionary[js.Array[Id]]): Self = this.set("deviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIds: Self = this.set("deviceIds", js.undefined)
    
    @scala.inline
    def setFrameworkVersion(value: String): Self = this.set("frameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworkVersion: Self = this.set("frameworkVersion", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
