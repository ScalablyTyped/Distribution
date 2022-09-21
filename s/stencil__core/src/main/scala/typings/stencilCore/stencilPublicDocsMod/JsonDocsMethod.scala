package typings.stencilCore.stencilPublicDocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDocsMethod extends StObject {
  
  var deprecation: js.UndefOr[String] = js.undefined
  
  var docs: String
  
  var docsTags: js.Array[JsonDocsTag]
  
  var name: String
  
  var parameters: js.Array[JsonDocMethodParameter]
  
  var returns: JsonDocsMethodReturn
  
  var signature: String
}
object JsonDocsMethod {
  
  inline def apply(
    docs: String,
    docsTags: js.Array[JsonDocsTag],
    name: String,
    parameters: js.Array[JsonDocMethodParameter],
    returns: JsonDocsMethodReturn,
    signature: String
  ): JsonDocsMethod = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], docsTags = docsTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDocsMethod]
  }
  
  extension [Self <: JsonDocsMethod](x: Self) {
    
    inline def setDeprecation(value: String): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
    
    inline def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
    
    inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsTags(value: js.Array[JsonDocsTag]): Self = StObject.set(x, "docsTags", value.asInstanceOf[js.Any])
    
    inline def setDocsTagsVarargs(value: JsonDocsTag*): Self = StObject.set(x, "docsTags", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[JsonDocMethodParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: JsonDocMethodParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReturns(value: JsonDocsMethodReturn): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
