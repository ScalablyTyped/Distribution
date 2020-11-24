package typings.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInitialProperties extends js.Object {
  
   // IListObjectDef;
  var fixed: js.UndefOr[Boolean] = js.native
  
  var percent: js.UndefOr[Boolean] = js.native
  
  var qHyperCubeDef: js.UndefOr[js.Any] = js.native
  
   // IHyperCubeDef;
  var qListObjectDef: js.UndefOr[js.Any] = js.native
  
  var selectionMode: js.UndefOr[SelectionModeType] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object IInitialProperties {
  
  @scala.inline
  def apply(): IInitialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitialProperties]
  }
  
  @scala.inline
  implicit class IInitialPropertiesOps[Self <: IInitialProperties] (val x: Self) extends AnyVal {
    
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
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setPercent(value: Boolean): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    
    @scala.inline
    def setQHyperCubeDef(value: js.Any): Self = this.set("qHyperCubeDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQHyperCubeDef: Self = this.set("qHyperCubeDef", js.undefined)
    
    @scala.inline
    def setQListObjectDef(value: js.Any): Self = this.set("qListObjectDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQListObjectDef: Self = this.set("qListObjectDef", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: SelectionModeType): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
