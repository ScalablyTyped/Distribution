package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiSuite
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var appVersionId: js.UndefOr[Id] = js.undefined
  
  var deviceIds: js.UndefOr[StringDictionary[js.Array[Id]]] = js.undefined
  
  var frameworkVersion: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object ApiSuite {
  
  @scala.inline
  def apply(): ApiSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiSuite]
  }
  
  @scala.inline
  implicit class ApiSuiteMutableBuilder[Self <: ApiSuite] (val x: Self) extends AnyVal {
    
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
