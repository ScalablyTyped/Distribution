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
  
  @scala.inline
  def apply(): GcReleaseBufferSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcReleaseBufferSize]
  }
  
  @scala.inline
  implicit class GcReleaseBufferSizeMutableBuilder[Self <: GcReleaseBufferSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcReleaseBufferSize(value: Double): Self = StObject.set(x, "gcReleaseBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcReleaseBufferSizeNull: Self = StObject.set(x, "gcReleaseBufferSize", null)
    
    @scala.inline
    def setGcReleaseBufferSizeUndefined: Self = StObject.set(x, "gcReleaseBufferSize", js.undefined)
    
    @scala.inline
    def setGcScheduler(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "gcScheduler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGcSchedulerNull: Self = StObject.set(x, "gcScheduler", null)
    
    @scala.inline
    def setGcSchedulerUndefined: Self = StObject.set(x, "gcScheduler", js.undefined)
    
    @scala.inline
    def setOperationLoader(value: OperationLoader): Self = StObject.set(x, "operationLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationLoaderNull: Self = StObject.set(x, "operationLoader", null)
    
    @scala.inline
    def setOperationLoaderUndefined: Self = StObject.set(x, "operationLoader", js.undefined)
    
    @scala.inline
    def setQueryCacheExpirationTime(value: Double): Self = StObject.set(x, "queryCacheExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryCacheExpirationTimeNull: Self = StObject.set(x, "queryCacheExpirationTime", null)
    
    @scala.inline
    def setQueryCacheExpirationTimeUndefined: Self = StObject.set(x, "queryCacheExpirationTime", js.undefined)
  }
}
