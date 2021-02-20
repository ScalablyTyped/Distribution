package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'encodeParameters'> */
@js.native
trait PickImplencodeParameters extends StObject {
  
  var encodeParameters: Boolean = js.native
}
object PickImplencodeParameters {
  
  @scala.inline
  def apply(encodeParameters: Boolean): PickImplencodeParameters = {
    val __obj = js.Dynamic.literal(encodeParameters = encodeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplencodeParameters]
  }
  
  @scala.inline
  implicit class PickImplencodeParametersMutableBuilder[Self <: PickImplencodeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodeParameters(value: Boolean): Self = StObject.set(x, "encodeParameters", value.asInstanceOf[js.Any])
  }
}
