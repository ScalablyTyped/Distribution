package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'encodeParameters'> */
trait PickImplencodeParameters extends StObject {
  
  var encodeParameters: Boolean
}
object PickImplencodeParameters {
  
  inline def apply(encodeParameters: Boolean): PickImplencodeParameters = {
    val __obj = js.Dynamic.literal(encodeParameters = encodeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplencodeParameters]
  }
  
  extension [Self <: PickImplencodeParameters](x: Self) {
    
    inline def setEncodeParameters(value: Boolean): Self = StObject.set(x, "encodeParameters", value.asInstanceOf[js.Any])
  }
}
