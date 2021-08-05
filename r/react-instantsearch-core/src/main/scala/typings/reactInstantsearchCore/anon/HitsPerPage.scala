package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HitsPerPage extends StObject {
  
  var hitsPerPage: Double
}
object HitsPerPage {
  
  inline def apply(hitsPerPage: Double): HitsPerPage = {
    val __obj = js.Dynamic.literal(hitsPerPage = hitsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitsPerPage]
  }
  
  extension [Self <: HitsPerPage](x: Self) {
    
    inline def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
  }
}
