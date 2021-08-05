package typings.relayRuntime.anon

import typings.relayRuntime.relayStoreTypesMod.OperationLoader
import typings.relayRuntime.relayStoreTypesMod.Scheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcReleaseBufferSize extends StObject {
  
  var gcReleaseBufferSize: js.UndefOr[Double | Null] = js.undefined
  
  var gcScheduler: js.UndefOr[Scheduler | Null] = js.undefined
  
  var operationLoader: js.UndefOr[OperationLoader | Null] = js.undefined
  
  var queryCacheExpirationTime: js.UndefOr[Double | Null] = js.undefined
}
object GcReleaseBufferSize {
  
  inline def apply(): GcReleaseBufferSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcReleaseBufferSize]
  }
  
  extension [Self <: GcReleaseBufferSize](x: Self) {
    
    inline def setGcReleaseBufferSize(value: Double): Self = StObject.set(x, "gcReleaseBufferSize", value.asInstanceOf[js.Any])
    
    inline def setGcReleaseBufferSizeNull: Self = StObject.set(x, "gcReleaseBufferSize", null)
    
    inline def setGcReleaseBufferSizeUndefined: Self = StObject.set(x, "gcReleaseBufferSize", js.undefined)
    
    inline def setGcScheduler(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "gcScheduler", js.Any.fromFunction1(value))
    
    inline def setGcSchedulerNull: Self = StObject.set(x, "gcScheduler", null)
    
    inline def setGcSchedulerUndefined: Self = StObject.set(x, "gcScheduler", js.undefined)
    
    inline def setOperationLoader(value: OperationLoader): Self = StObject.set(x, "operationLoader", value.asInstanceOf[js.Any])
    
    inline def setOperationLoaderNull: Self = StObject.set(x, "operationLoader", null)
    
    inline def setOperationLoaderUndefined: Self = StObject.set(x, "operationLoader", js.undefined)
    
    inline def setQueryCacheExpirationTime(value: Double): Self = StObject.set(x, "queryCacheExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setQueryCacheExpirationTimeNull: Self = StObject.set(x, "queryCacheExpirationTime", null)
    
    inline def setQueryCacheExpirationTimeUndefined: Self = StObject.set(x, "queryCacheExpirationTime", js.undefined)
  }
}
