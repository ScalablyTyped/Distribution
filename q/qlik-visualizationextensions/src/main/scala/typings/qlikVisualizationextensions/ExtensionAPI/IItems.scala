package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IItems
  extends /* other */ StringDictionary[js.Any] {
  
  var AddOns: js.UndefOr[IAddOns] = js.native
  
  var appearance: js.UndefOr[IAppearance] = js.native
  
  var dimentions: js.UndefOr[IDimensions] = js.native
  
  var measures: js.UndefOr[IMeasures] = js.native
  
  var sorting: js.UndefOr[ISorting] = js.native
}
object IItems {
  
  @scala.inline
  def apply(): IItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItems]
  }
  
  @scala.inline
  implicit class IItemsMutableBuilder[Self <: IItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOns(value: IAddOns): Self = StObject.set(x, "AddOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnsUndefined: Self = StObject.set(x, "AddOns", js.undefined)
    
    @scala.inline
    def setAppearance(value: IAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setDimentions(value: IDimensions): Self = StObject.set(x, "dimentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimentionsUndefined: Self = StObject.set(x, "dimentions", js.undefined)
    
    @scala.inline
    def setMeasures(value: IMeasures): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    @scala.inline
    def setSorting(value: ISorting): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
  }
}
