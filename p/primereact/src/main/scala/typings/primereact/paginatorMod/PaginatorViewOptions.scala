package typings.primereact.paginatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorViewOptions extends StObject {
  
  var endPage: Double
  
  var startPage: Double
}
object PaginatorViewOptions {
  
  inline def apply(endPage: Double, startPage: Double): PaginatorViewOptions = {
    val __obj = js.Dynamic.literal(endPage = endPage.asInstanceOf[js.Any], startPage = startPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorViewOptions]
  }
  
  extension [Self <: PaginatorViewOptions](x: Self) {
    
    inline def setEndPage(value: Double): Self = StObject.set(x, "endPage", value.asInstanceOf[js.Any])
    
    inline def setStartPage(value: Double): Self = StObject.set(x, "startPage", value.asInstanceOf[js.Any])
  }
}
