package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRateLimiterMongoOptions
  extends StObject
     with IRateLimiterStoreOptions {
  
  var indexKeyPrefix: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object IRateLimiterMongoOptions {
  
  inline def apply(storeClient: Any): IRateLimiterMongoOptions = {
    val __obj = js.Dynamic.literal(storeClient = storeClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRateLimiterMongoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRateLimiterMongoOptions] (val x: Self) extends AnyVal {
    
    inline def setIndexKeyPrefix(value: StringDictionary[Any]): Self = StObject.set(x, "indexKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setIndexKeyPrefixUndefined: Self = StObject.set(x, "indexKeyPrefix", js.undefined)
  }
}
