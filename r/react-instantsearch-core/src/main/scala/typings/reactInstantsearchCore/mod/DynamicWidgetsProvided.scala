package typings.reactInstantsearchCore.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactChild
import typings.reactInstantsearchCore.anon.AttributeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-instantsearch-core.react-instantsearch-core.DynamicWidgetsExposed, 'children' | 'fallbackComponent'> & {  attributesToRender :std.Array<string>} */
trait DynamicWidgetsProvided extends StObject {
  
  /** The list of refinement values to display returned from the Algolia API. */
  var attributesToRender: js.Array[String]
  
  var children: js.UndefOr[ReactChild] = js.undefined
  
  var fallbackComponent: js.UndefOr[ComponentType[AttributeString]] = js.undefined
}
object DynamicWidgetsProvided {
  
  inline def apply(attributesToRender: js.Array[String]): DynamicWidgetsProvided = {
    val __obj = js.Dynamic.literal(attributesToRender = attributesToRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicWidgetsProvided]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicWidgetsProvided] (val x: Self) extends AnyVal {
    
    inline def setAttributesToRender(value: js.Array[String]): Self = StObject.set(x, "attributesToRender", value.asInstanceOf[js.Any])
    
    inline def setAttributesToRenderVarargs(value: String*): Self = StObject.set(x, "attributesToRender", js.Array(value*))
    
    inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFallbackComponent(value: ComponentType[AttributeString]): Self = StObject.set(x, "fallbackComponent", value.asInstanceOf[js.Any])
    
    inline def setFallbackComponentUndefined: Self = StObject.set(x, "fallbackComponent", js.undefined)
  }
}
