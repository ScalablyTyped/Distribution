package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name I18N is established convention
trait I18N extends StObject {
  
  var rendererFormattedStrings: RendererFormattedStrings
}
object I18N {
  
  inline def apply(rendererFormattedStrings: RendererFormattedStrings): I18N = {
    val __obj = js.Dynamic.literal(rendererFormattedStrings = rendererFormattedStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18N]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: I18N] (val x: Self) extends AnyVal {
    
    inline def setRendererFormattedStrings(value: RendererFormattedStrings): Self = StObject.set(x, "rendererFormattedStrings", value.asInstanceOf[js.Any])
  }
}
