package typings.reactInstantsearchDom.mod

import typings.reactInstantsearchDom.anon.SeeAllOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuSelectProps extends StObject {
  
  var attribute: String
  
  var className: js.UndefOr[String] = js.undefined
  
  var defaultRefinement: js.UndefOr[String] = js.undefined
  
  // Optional parameters
  var id: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var transformItems: js.UndefOr[
    js.Function1[/* items */ js.Array[RefinementItem[String]], js.Array[RefinementItem[String]]]
  ] = js.undefined
  
  var translations: js.UndefOr[SeeAllOption] = js.undefined
}
object MenuSelectProps {
  
  inline def apply(attribute: String): MenuSelectProps = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuSelectProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuSelectProps] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setTransformItems(value: /* items */ js.Array[RefinementItem[String]] => js.Array[RefinementItem[String]]): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
    
    inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
    
    inline def setTranslations(value: SeeAllOption): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
  }
}
