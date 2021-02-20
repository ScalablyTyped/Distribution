package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiSuiteV1
  extends /* key */ StringDictionary[js.Any] {
  
  var appVersionId: js.UndefOr[Id] = js.native
  
  var deviceIds: js.UndefOr[js.Array[Id]] = js.native
  
  var frameworkVersion: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[Id] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ApiSuiteV1 {
  
  @scala.inline
  def apply(): ApiSuiteV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiSuiteV1]
  }
  
  @scala.inline
  implicit class ApiSuiteV1MutableBuilder[Self <: ApiSuiteV1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppVersionId(value: Id): Self = StObject.set(x, "appVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionIdUndefined: Self = StObject.set(x, "appVersionId", js.undefined)
    
    @scala.inline
    def setDeviceIds(value: js.Array[Id]): Self = StObject.set(x, "deviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdsUndefined: Self = StObject.set(x, "deviceIds", js.undefined)
    
    @scala.inline
    def setDeviceIdsVarargs(value: Id*): Self = StObject.set(x, "deviceIds", js.Array(value :_*))
    
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
