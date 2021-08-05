package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.ErrorSettings._Impl, 'noURL'> */
trait PickImplnoURL extends StObject {
  
  var noURL: String
}
object PickImplnoURL {
  
  inline def apply(noURL: String): PickImplnoURL = {
    val __obj = js.Dynamic.literal(noURL = noURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoURL]
  }
  
  extension [Self <: PickImplnoURL](x: Self) {
    
    inline def setNoURL(value: String): Self = StObject.set(x, "noURL", value.asInstanceOf[js.Any])
  }
}
