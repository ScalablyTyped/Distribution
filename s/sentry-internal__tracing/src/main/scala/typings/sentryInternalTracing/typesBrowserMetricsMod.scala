package typings.sentryInternalTracing

import typings.sentryCore.mod.Transaction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowserMetricsMod {
  
  @JSImport("@sentry-internal/tracing/types/browser/metrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMeasureSpans(
    transaction: Transaction,
    entry: Record[String, Any],
    startTime: Double,
    duration: Double,
    timeOrigin: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_addMeasureSpans")(transaction.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timeOrigin.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def addPerformanceEntries(transaction: Transaction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPerformanceEntries")(transaction.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addResourceSpans(
    transaction: Transaction,
    entry: ResourceEntry,
    resourceName: String,
    startTime: Double,
    duration: Double,
    timeOrigin: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addResourceSpans")(transaction.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], resourceName.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timeOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def startTrackingInteractions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTrackingInteractions")().asInstanceOf[Unit]
  
  inline def startTrackingLongTasks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTrackingLongTasks")().asInstanceOf[Unit]
  
  inline def startTrackingWebVitals(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("startTrackingWebVitals")().asInstanceOf[js.Function0[Unit]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait ResourceEntry extends StObject {
    
    var decodedBodySize: js.UndefOr[Double] = js.undefined
    
    var encodedBodySize: js.UndefOr[Double] = js.undefined
    
    var initiatorType: js.UndefOr[String] = js.undefined
    
    var renderBlockingStatus: js.UndefOr[String] = js.undefined
    
    var transferSize: js.UndefOr[Double] = js.undefined
  }
  object ResourceEntry {
    
    inline def apply(): ResourceEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourceEntry] (val x: Self) extends AnyVal {
      
      inline def setDecodedBodySize(value: Double): Self = StObject.set(x, "decodedBodySize", value.asInstanceOf[js.Any])
      
      inline def setDecodedBodySizeUndefined: Self = StObject.set(x, "decodedBodySize", js.undefined)
      
      inline def setEncodedBodySize(value: Double): Self = StObject.set(x, "encodedBodySize", value.asInstanceOf[js.Any])
      
      inline def setEncodedBodySizeUndefined: Self = StObject.set(x, "encodedBodySize", js.undefined)
      
      inline def setInitiatorType(value: String): Self = StObject.set(x, "initiatorType", value.asInstanceOf[js.Any])
      
      inline def setInitiatorTypeUndefined: Self = StObject.set(x, "initiatorType", js.undefined)
      
      inline def setRenderBlockingStatus(value: String): Self = StObject.set(x, "renderBlockingStatus", value.asInstanceOf[js.Any])
      
      inline def setRenderBlockingStatusUndefined: Self = StObject.set(x, "renderBlockingStatus", js.undefined)
      
      inline def setTransferSize(value: Double): Self = StObject.set(x, "transferSize", value.asInstanceOf[js.Any])
      
      inline def setTransferSizeUndefined: Self = StObject.set(x, "transferSize", js.undefined)
    }
  }
}
