package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplMethod extends StObject {
  
  var method: js.UndefOr[String] = js.undefined
  
  var noURL: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplMethod {
  
  inline def apply(): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
  
  extension [Self <: PartialPickImplkeyofImplMethod](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoURL(value: String): Self = StObject.set(x, "noURL", value.asInstanceOf[js.Any])
    
    inline def setNoURLUndefined: Self = StObject.set(x, "noURL", js.undefined)
  }
}
