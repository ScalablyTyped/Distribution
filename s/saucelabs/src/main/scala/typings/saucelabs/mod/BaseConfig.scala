package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseConfig
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var browserName: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object BaseConfig {
  
  @scala.inline
  def apply(): BaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfig]
  }
  
  @scala.inline
  implicit class BaseConfigMutableBuilder[Self <: BaseConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
