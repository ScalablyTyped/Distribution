package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-instantsearch-core.react-instantsearch-core.Omit<react-instantsearch-core.react-instantsearch-core.ConnectHitInsightsProvided, {  insights :react-instantsearch-core.react-instantsearch-core.WrappedInsightsClient}> */
trait OmitConnectHitInsightsPro extends StObject {
  
  var hit: HitBasicDoc
}
object OmitConnectHitInsightsPro {
  
  inline def apply(hit: HitBasicDoc): OmitConnectHitInsightsPro = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitConnectHitInsightsPro]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitConnectHitInsightsPro] (val x: Self) extends AnyVal {
    
    inline def setHit(value: HitBasicDoc): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
  }
}
