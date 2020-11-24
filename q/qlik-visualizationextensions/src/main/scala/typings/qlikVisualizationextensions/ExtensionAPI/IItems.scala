package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StringDictionary
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
  implicit class IItemsOps[Self <: IItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddOns(value: IAddOns): Self = this.set("AddOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOns: Self = this.set("AddOns", js.undefined)
    
    @scala.inline
    def setAppearance(value: IAppearance): Self = this.set("appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    
    @scala.inline
    def setDimentions(value: IDimensions): Self = this.set("dimentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimentions: Self = this.set("dimentions", js.undefined)
    
    @scala.inline
    def setMeasures(value: IMeasures): Self = this.set("measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
    
    @scala.inline
    def setSorting(value: ISorting): Self = this.set("sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
  }
}
