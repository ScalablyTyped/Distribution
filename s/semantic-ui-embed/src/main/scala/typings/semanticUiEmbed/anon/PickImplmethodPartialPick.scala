package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, keyof semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl>> */
trait PickImplmethodPartialPick
  extends StObject
     with Param {
  
  var method: String
  
  var noURL: js.UndefOr[String] = js.undefined
}
object PickImplmethodPartialPick {
  
  inline def apply(method: String): PickImplmethodPartialPick = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmethodPartialPick]
  }
  
  extension [Self <: PickImplmethodPartialPick](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNoURL(value: String): Self = StObject.set(x, "noURL", value.asInstanceOf[js.Any])
    
    inline def setNoURLUndefined: Self = StObject.set(x, "noURL", js.undefined)
  }
}
