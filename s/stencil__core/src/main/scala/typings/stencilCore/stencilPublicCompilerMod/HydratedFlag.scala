package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings.`class`
import typings.stencilCore.stencilCoreStrings.attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydratedFlag extends StObject {
  
  /**
    * This is the CSS value to assign once a component has finished hydrating.
    * This is the CSS value that'll allow the component to show. Defaults to `inherit`.
    */
  var hydratedValue: js.UndefOr[String] = js.undefined
  
  /**
    * This is the CSS value to give all components before it has been hydrated.
    * Defaults to `hidden`.
    */
  var initialValue: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to `hydrated`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The CSS property used to show and hide components. Defaults to use the CSS `visibility`
    * property. Other commonly used CSS properties would be `display` with the `initialValue`
    * setting as `none`, or `opacity` with the `initialValue` as `0`. Defaults to `visibility`
    * and the default `initialValue` is `hidden`.
    */
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * Can be either `class` or `attribute`. Defaults to `class`.
    */
  var selector: js.UndefOr[`class` | attribute] = js.undefined
}
object HydratedFlag {
  
  inline def apply(): HydratedFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HydratedFlag]
  }
  
  extension [Self <: HydratedFlag](x: Self) {
    
    inline def setHydratedValue(value: String): Self = StObject.set(x, "hydratedValue", value.asInstanceOf[js.Any])
    
    inline def setHydratedValueUndefined: Self = StObject.set(x, "hydratedValue", js.undefined)
    
    inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setSelector(value: `class` | attribute): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
