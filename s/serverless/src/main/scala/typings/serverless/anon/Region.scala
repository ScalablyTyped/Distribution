package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var region: js.UndefOr[String] = js.undefined
  
  var useCache: js.UndefOr[Boolean] = js.undefined
}
object Region {
  
  inline def apply(): Region = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
    
    inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
  }
}
