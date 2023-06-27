package typings.sentryReplay.anon

import typings.sentryReplay.sentryReplayStrings.breadcrumb
import typings.sentryReplay.typesTypesReplayFrameMod.BreadcrumbFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  /**
    * This will indicate to backend to additionally log as a metric
    */
  var metric: js.UndefOr[Boolean] = js.undefined
  
  var payload: BreadcrumbFrame
  
  var tag: breadcrumb
}
object Metric {
  
  inline def apply(payload: BreadcrumbFrame): Metric = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], tag = "breadcrumb")
    __obj.asInstanceOf[Metric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
    
    inline def setMetric(value: Boolean): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setPayload(value: BreadcrumbFrame): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTag(value: breadcrumb): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
