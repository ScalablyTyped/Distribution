package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateURL extends StObject {
  
  def createURL(args: js.Any*): String
  
  def refine(args: js.Any*): js.Any
  
  def searchForItems(args: js.Any*): js.Any
}
object CreateURL {
  
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => String,
    refine: /* repeated */ js.Any => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): CreateURL = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[CreateURL]
  }
  
  @scala.inline
  implicit class CreateURLMutableBuilder[Self <: CreateURL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateURL(value: /* repeated */ js.Any => String): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchForItems(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "searchForItems", js.Any.fromFunction1(value))
  }
}
