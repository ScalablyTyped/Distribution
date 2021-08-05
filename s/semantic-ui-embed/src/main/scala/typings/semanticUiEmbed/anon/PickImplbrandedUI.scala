package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'brandedUI'> */
trait PickImplbrandedUI extends StObject {
  
  var brandedUI: Boolean
}
object PickImplbrandedUI {
  
  inline def apply(brandedUI: Boolean): PickImplbrandedUI = {
    val __obj = js.Dynamic.literal(brandedUI = brandedUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbrandedUI]
  }
  
  extension [Self <: PickImplbrandedUI](x: Self) {
    
    inline def setBrandedUI(value: Boolean): Self = StObject.set(x, "brandedUI", value.asInstanceOf[js.Any])
  }
}
