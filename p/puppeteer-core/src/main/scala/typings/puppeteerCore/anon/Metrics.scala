package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  var metrics: typings.puppeteerCore.libCjsPuppeteerApiPageMod.Metrics
  
  var title: String
}
object Metrics {
  
  inline def apply(metrics: typings.puppeteerCore.libCjsPuppeteerApiPageMod.Metrics, title: String): Metrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  
  extension [Self <: Metrics](x: Self) {
    
    inline def setMetrics(value: typings.puppeteerCore.libCjsPuppeteerApiPageMod.Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
