package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.OFF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceLoadingOffInfo extends StObject {
  
  var loading: OFF
}
object PersistenceLoadingOffInfo {
  
  inline def apply(loading: OFF): PersistenceLoadingOffInfo = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceLoadingOffInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistenceLoadingOffInfo] (val x: Self) extends AnyVal {
    
    inline def setLoading(value: OFF): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
