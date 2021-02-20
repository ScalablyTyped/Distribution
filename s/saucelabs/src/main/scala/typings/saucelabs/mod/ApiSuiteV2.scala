package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class ApiSuiteV2MutableBuilder[Self <: ApiSuiteV2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppVersionId(value: Id): Self = StObject.set(x, "appVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionIdUndefined: Self = StObject.set(x, "appVersionId", js.undefined)
    
    @scala.inline
    def setDeviceIds(value: StringDictionary[js.Array[Id]]): Self = StObject.set(x, "deviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdsUndefined: Self = StObject.set(x, "deviceIds", js.undefined)
    
    @scala.inline
    def setFrameworkVersion(value: String): Self = StObject.set(x, "frameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkVersionUndefined: Self = StObject.set(x, "frameworkVersion", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
