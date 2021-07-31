package typings.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name I18N is established convention
trait I18N extends StObject {
  
  var rendererFormattedStrings: RendererFormattedStrings
}
object I18N {
  
  @scala.inline
  def apply(rendererFormattedStrings: RendererFormattedStrings): I18N = {
    val __obj = js.Dynamic.literal(rendererFormattedStrings = rendererFormattedStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18N]
  }
  
  @scala.inline
  implicit class I18NMutableBuilder[Self <: I18N] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRendererFormattedStrings(value: RendererFormattedStrings): Self = StObject.set(x, "rendererFormattedStrings", value.asInstanceOf[js.Any])
  }
}
