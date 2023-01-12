package typings.reactInstantsearchDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HitsPerPageProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var defaultRefinement: Double
  
  var id: js.UndefOr[String] = js.undefined
  
  var items: js.Array[RefinementItem[Double]]
  
  var transformItems: js.UndefOr[
    js.Function1[/* items */ js.Array[RefinementItem[Double]], js.Array[RefinementItem[Double]]]
  ] = js.undefined
}
object HitsPerPageProps {
  
  inline def apply(defaultRefinement: Double, items: js.Array[RefinementItem[Double]]): HitsPerPageProps = {
    val __obj = js.Dynamic.literal(defaultRefinement = defaultRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitsPerPageProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HitsPerPageProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultRefinement(value: Double): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItems(value: js.Array[RefinementItem[Double]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: RefinementItem[Double]*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTransformItems(value: /* items */ js.Array[RefinementItem[Double]] => js.Array[RefinementItem[Double]]): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
    
    inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
  }
}
