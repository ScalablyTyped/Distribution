package typings.puppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var metrics: typings.puppeteer.apiPageMod.Metrics
  
  var title: String
}
object Title {
  
  inline def apply(metrics: typings.puppeteer.apiPageMod.Metrics, title: String): Title = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setMetrics(value: typings.puppeteer.apiPageMod.Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
