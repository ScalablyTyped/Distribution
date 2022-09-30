package typings.querySelectorShadowDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait ProtractorBy extends StObject {
    
    /**
      * Find element within the Shadow DOM.
      *
      * @param {string} selector
      * @returns {Locator} location strategy
      */
    def shadowDomCss(selector: String): Any
  }
  object ProtractorBy {
    
    inline def apply(shadowDomCss: String => Any): ProtractorBy = {
      val __obj = js.Dynamic.literal(shadowDomCss = js.Any.fromFunction1(shadowDomCss))
      __obj.asInstanceOf[ProtractorBy]
    }
    
    extension [Self <: ProtractorBy](x: Self) {
      
      inline def setShadowDomCss(value: String => Any): Self = StObject.set(x, "shadowDomCss", js.Any.fromFunction1(value))
    }
  }
}
