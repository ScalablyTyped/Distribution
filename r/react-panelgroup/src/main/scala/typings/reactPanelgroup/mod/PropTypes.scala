package typings.reactPanelgroup.mod

import typings.reactPanelgroup.reactPanelgroupStrings.column
import typings.reactPanelgroup.reactPanelgroupStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropTypes extends js.Object {
  
  var borderColor: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[row | column] = js.native
  
  var onUpdate: js.UndefOr[js.Function1[/* data */ PanelWidth, Unit]] = js.native
  
  var panelColor: js.UndefOr[String] = js.native
  
  var panelWidths: js.UndefOr[js.Array[PanelWidth | Null]] = js.native
  
  var spacing: js.UndefOr[Double] = js.native
}
object PropTypes {
  
  @scala.inline
  def apply(): PropTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropTypes]
  }
  
  @scala.inline
  implicit class PropTypesOps[Self <: PropTypes] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setDirection(value: row | column): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* data */ PanelWidth => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPanelColor(value: String): Self = this.set("panelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelColor: Self = this.set("panelColor", js.undefined)
    
    @scala.inline
    def setPanelWidthsVarargs(value: (PanelWidth | Null)*): Self = this.set("panelWidths", js.Array(value :_*))
    
    @scala.inline
    def setPanelWidths(value: js.Array[PanelWidth | Null]): Self = this.set("panelWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelWidths: Self = this.set("panelWidths", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
}
