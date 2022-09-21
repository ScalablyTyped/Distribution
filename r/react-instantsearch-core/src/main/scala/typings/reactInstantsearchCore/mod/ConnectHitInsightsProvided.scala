package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.HitBasicDoc
import typings.reactInstantsearchCore.anon.PartialInsightsClientPayl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectHitInsightsProvided extends StObject {
  
  var hit: HitBasicDoc
  
  var insights: WrappedInsightsClient
}
object ConnectHitInsightsProvided {
  
  inline def apply(
    hit: HitBasicDoc,
    insights: (/* method */ InsightsClientMethod, /* payload */ PartialInsightsClientPayl) => Unit
  ): ConnectHitInsightsProvided = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], insights = js.Any.fromFunction2(insights))
    __obj.asInstanceOf[ConnectHitInsightsProvided]
  }
  
  extension [Self <: ConnectHitInsightsProvided](x: Self) {
    
    inline def setHit(value: HitBasicDoc): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    inline def setInsights(value: (/* method */ InsightsClientMethod, /* payload */ PartialInsightsClientPayl) => Unit): Self = StObject.set(x, "insights", js.Any.fromFunction2(value))
  }
}
