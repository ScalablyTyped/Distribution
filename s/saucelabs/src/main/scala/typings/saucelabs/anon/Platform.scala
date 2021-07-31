package typings.saucelabs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platform
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var browser: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var resolutions: js.UndefOr[js.Array[String]] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Platform {
  
  @scala.inline
  def apply(): Platform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Platform]
  }
  
  @scala.inline
  implicit class PlatformMutableBuilder[Self <: Platform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setResolutions(value: js.Array[String]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
    
    @scala.inline
    def setResolutionsVarargs(value: String*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
