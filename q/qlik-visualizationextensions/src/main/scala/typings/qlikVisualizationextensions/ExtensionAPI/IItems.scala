package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IItems
  extends StObject
     with /* other */ StringDictionary[js.Any] {
  
  var AddOns: js.UndefOr[IAddOns] = js.undefined
  
  var appearance: js.UndefOr[IAppearance] = js.undefined
  
  var dimentions: js.UndefOr[IDimensions] = js.undefined
  
  var measures: js.UndefOr[IMeasures] = js.undefined
  
  var sorting: js.UndefOr[ISorting] = js.undefined
}
object IItems {
  
  inline def apply(): IItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItems]
  }
  
  extension [Self <: IItems](x: Self) {
    
    inline def setAddOns(value: IAddOns): Self = StObject.set(x, "AddOns", value.asInstanceOf[js.Any])
    
    inline def setAddOnsUndefined: Self = StObject.set(x, "AddOns", js.undefined)
    
    inline def setAppearance(value: IAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def setDimentions(value: IDimensions): Self = StObject.set(x, "dimentions", value.asInstanceOf[js.Any])
    
    inline def setDimentionsUndefined: Self = StObject.set(x, "dimentions", js.undefined)
    
    inline def setMeasures(value: IMeasures): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setSorting(value: ISorting): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
  }
}
