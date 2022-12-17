package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, 'noURL'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl>> */
trait PickImplnoURLPartialPickI
  extends StObject
     with Param {
  
  var method: js.UndefOr[String] = js.undefined
  
  var noURL: String
}
object PickImplnoURLPartialPickI {
  
  inline def apply(noURL: String): PickImplnoURLPartialPickI = {
    val __obj = js.Dynamic.literal(noURL = noURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoURLPartialPickI]
  }
  
  extension [Self <: PickImplnoURLPartialPickI](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoURL(value: String): Self = StObject.set(x, "noURL", value.asInstanceOf[js.Any])
  }
}
