package typings.reactInstantsearchCore.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactChild
import typings.reactInstantsearchCore.anon.Attribute
import typings.reactInstantsearchCore.anon.Results
import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicWidgetsExposed extends StObject {
  
  /**
    * The children of this component will be displayed dynamically based
    * on the result of facetOrdering. This means that any child needs
    * to have either the “attribute” or “attributes” prop.
    */
  var children: js.UndefOr[ReactChild] = js.undefined
  
  /**
    * The facets to apply before dynamic widgets get mounted.
    * Setting the value to ['*'] will request all facets
    * and avoid an additional network request once the widgets are added.
    * @default ['*']
    */
  var facets: js.UndefOr[js.Array[Asterisk | scala.Nothing]] = js.undefined
  
  /**
    * The fallbackComponent prop is used if no widget from children matches.
    * The component gets called with an attribute prop.
    */
  var fallbackComponent: js.UndefOr[ComponentType[Attribute]] = js.undefined
  
  /**
    * The default number of facet values to request.
    * It’s recommended to have this value at least as high as the highest limit
    * and showMoreLimit of dynamic widgets, as this will prevent
    * a second network request once that widget mounts.
    * To avoid pinned items not showing in the result, make sure you choose
    * a maxValuesPerFacet at least as high as all the most pinned items you have.
    * @default 20
    */
  var maxValuesPerFacet: js.UndefOr[Double] = js.undefined
  
  /**
    * A function to transform the attributes to render,
    * or using a different source to determine the attributes to render.
    */
  var transformItems: js.UndefOr[js.Function2[/* items */ js.Array[String], /* meta */ Results, Any]] = js.undefined
}
object DynamicWidgetsExposed {
  
  inline def apply(): DynamicWidgetsExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicWidgetsExposed]
  }
  
  extension [Self <: DynamicWidgetsExposed](x: Self) {
    
    inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFacets(value: js.Array[Asterisk | scala.Nothing]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setFacetsVarargs(value: (Asterisk | scala.Nothing)*): Self = StObject.set(x, "facets", js.Array(value*))
    
    inline def setFallbackComponent(value: ComponentType[Attribute]): Self = StObject.set(x, "fallbackComponent", value.asInstanceOf[js.Any])
    
    inline def setFallbackComponentUndefined: Self = StObject.set(x, "fallbackComponent", js.undefined)
    
    inline def setMaxValuesPerFacet(value: Double): Self = StObject.set(x, "maxValuesPerFacet", value.asInstanceOf[js.Any])
    
    inline def setMaxValuesPerFacetUndefined: Self = StObject.set(x, "maxValuesPerFacet", js.undefined)
    
    inline def setTransformItems(value: (/* items */ js.Array[String], /* meta */ Results) => Any): Self = StObject.set(x, "transformItems", js.Any.fromFunction2(value))
    
    inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
  }
}
