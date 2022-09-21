package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateURL extends StObject {
  
  def createURL(args: Any*): String
  
  def refine(args: Any*): Any
  
  def searchForItems(args: Any*): Any
}
object CreateURL {
  
  inline def apply(
    createURL: /* repeated */ Any => String,
    refine: /* repeated */ Any => Any,
    searchForItems: /* repeated */ Any => Any
  ): CreateURL = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[CreateURL]
  }
  
  extension [Self <: CreateURL](x: Self) {
    
    inline def setCreateURL(value: /* repeated */ Any => String): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    inline def setRefine(value: /* repeated */ Any => Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    inline def setSearchForItems(value: /* repeated */ Any => Any): Self = StObject.set(x, "searchForItems", js.Any.fromFunction1(value))
  }
}
