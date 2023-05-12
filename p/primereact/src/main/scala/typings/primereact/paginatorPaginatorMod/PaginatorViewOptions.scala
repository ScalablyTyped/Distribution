package typings.primereact.paginatorPaginatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom paginator view options
  */
trait PaginatorViewOptions extends StObject {
  
  /**
    * Ending page number for the paginator view.
    */
  var endPage: Double
  
  /**
    * Starting page number for the paginator view.
    */
  var startPage: Double
}
object PaginatorViewOptions {
  
  inline def apply(endPage: Double, startPage: Double): PaginatorViewOptions = {
    val __obj = js.Dynamic.literal(endPage = endPage.asInstanceOf[js.Any], startPage = startPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginatorViewOptions] (val x: Self) extends AnyVal {
    
    inline def setEndPage(value: Double): Self = StObject.set(x, "endPage", value.asInstanceOf[js.Any])
    
    inline def setStartPage(value: Double): Self = StObject.set(x, "startPage", value.asInstanceOf[js.Any])
  }
}
