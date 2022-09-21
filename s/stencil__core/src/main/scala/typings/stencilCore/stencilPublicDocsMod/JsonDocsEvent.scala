package typings.stencilCore.stencilPublicDocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDocsEvent extends StObject {
  
  var bubbles: Boolean
  
  var cancelable: Boolean
  
  var composed: Boolean
  
  var deprecation: js.UndefOr[String] = js.undefined
  
  var detail: String
  
  var docs: String
  
  var docsTags: js.Array[JsonDocsTag]
  
  var event: String
}
object JsonDocsEvent {
  
  inline def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    composed: Boolean,
    detail: String,
    docs: String,
    docsTags: js.Array[JsonDocsTag],
    event: String
  ): JsonDocsEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docsTags = docsTags.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDocsEvent]
  }
  
  extension [Self <: JsonDocsEvent](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setDeprecation(value: String): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
    
    inline def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsTags(value: js.Array[JsonDocsTag]): Self = StObject.set(x, "docsTags", value.asInstanceOf[js.Any])
    
    inline def setDocsTagsVarargs(value: JsonDocsTag*): Self = StObject.set(x, "docsTags", js.Array(value*))
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
