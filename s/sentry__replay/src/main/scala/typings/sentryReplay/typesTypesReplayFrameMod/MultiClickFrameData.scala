package typings.sentryReplay.typesTypesReplayFrameMod

import typings.sentryReplay.sentryReplayBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiClickFrameData
  extends StObject
     with BaseDomFrameData {
  
  var clickCount: Double
  
  var metric: `true`
  
  var route: js.UndefOr[String] = js.undefined
  
  var url: String
}
object MultiClickFrameData {
  
  inline def apply(clickCount: Double, url: String): MultiClickFrameData = {
    val __obj = js.Dynamic.literal(clickCount = clickCount.asInstanceOf[js.Any], metric = true, url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiClickFrameData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiClickFrameData] (val x: Self) extends AnyVal {
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: `true`): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
