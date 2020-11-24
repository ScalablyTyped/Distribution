package typings.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridPane extends js.Object {
  
  var backgroundColor: js.Any = js.native
  
  var changeHighlightCellBgColor: js.Any = js.native
  
  var columnDropIndicatorColor: js.Any = js.native
  
  var copyRectBackBorderColor: js.Any = js.native
  
  var copyRectForeBorderColor: js.Any = js.native
  
  var errorRectBorderColor: js.Any = js.native
  
  var fillRectBorderColor: js.Any = js.native
  
  var focusRectBorderColor: js.Any = js.native
  
  var horizontalBorderColor: js.Any = js.native
  
  var horizontalBorderStyle: js.Any = js.native
  
  var linkColor: js.Any = js.native
  
  var readonlySelectionRectBorderColor: js.Any = js.native
  
  var rowDropIndicatorColor: js.Any = js.native
  
  var selectedCellBgColor: js.Any = js.native
  
  var selectionRectBorderColor: js.Any = js.native
  
  var verticalBorderColor: js.Any = js.native
  
  var verticalBorderStyle: js.Any = js.native
  
  var visitedLinkColor: js.Any = js.native
}
object GridPane {
  
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    changeHighlightCellBgColor: js.Any,
    columnDropIndicatorColor: js.Any,
    copyRectBackBorderColor: js.Any,
    copyRectForeBorderColor: js.Any,
    errorRectBorderColor: js.Any,
    fillRectBorderColor: js.Any,
    focusRectBorderColor: js.Any,
    horizontalBorderColor: js.Any,
    horizontalBorderStyle: js.Any,
    linkColor: js.Any,
    readonlySelectionRectBorderColor: js.Any,
    rowDropIndicatorColor: js.Any,
    selectedCellBgColor: js.Any,
    selectionRectBorderColor: js.Any,
    verticalBorderColor: js.Any,
    verticalBorderStyle: js.Any,
    visitedLinkColor: js.Any
  ): GridPane = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], changeHighlightCellBgColor = changeHighlightCellBgColor.asInstanceOf[js.Any], columnDropIndicatorColor = columnDropIndicatorColor.asInstanceOf[js.Any], copyRectBackBorderColor = copyRectBackBorderColor.asInstanceOf[js.Any], copyRectForeBorderColor = copyRectForeBorderColor.asInstanceOf[js.Any], errorRectBorderColor = errorRectBorderColor.asInstanceOf[js.Any], fillRectBorderColor = fillRectBorderColor.asInstanceOf[js.Any], focusRectBorderColor = focusRectBorderColor.asInstanceOf[js.Any], horizontalBorderColor = horizontalBorderColor.asInstanceOf[js.Any], horizontalBorderStyle = horizontalBorderStyle.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], readonlySelectionRectBorderColor = readonlySelectionRectBorderColor.asInstanceOf[js.Any], rowDropIndicatorColor = rowDropIndicatorColor.asInstanceOf[js.Any], selectedCellBgColor = selectedCellBgColor.asInstanceOf[js.Any], selectionRectBorderColor = selectionRectBorderColor.asInstanceOf[js.Any], verticalBorderColor = verticalBorderColor.asInstanceOf[js.Any], verticalBorderStyle = verticalBorderStyle.asInstanceOf[js.Any], visitedLinkColor = visitedLinkColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridPane]
  }
  
  @scala.inline
  implicit class GridPaneOps[Self <: GridPane] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: js.Any): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeHighlightCellBgColor(value: js.Any): Self = this.set("changeHighlightCellBgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDropIndicatorColor(value: js.Any): Self = this.set("columnDropIndicatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyRectBackBorderColor(value: js.Any): Self = this.set("copyRectBackBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyRectForeBorderColor(value: js.Any): Self = this.set("copyRectForeBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRectBorderColor(value: js.Any): Self = this.set("errorRectBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRectBorderColor(value: js.Any): Self = this.set("fillRectBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRectBorderColor(value: js.Any): Self = this.set("focusRectBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalBorderColor(value: js.Any): Self = this.set("horizontalBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalBorderStyle(value: js.Any): Self = this.set("horizontalBorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkColor(value: js.Any): Self = this.set("linkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlySelectionRectBorderColor(value: js.Any): Self = this.set("readonlySelectionRectBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDropIndicatorColor(value: js.Any): Self = this.set("rowDropIndicatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedCellBgColor(value: js.Any): Self = this.set("selectedCellBgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRectBorderColor(value: js.Any): Self = this.set("selectionRectBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalBorderColor(value: js.Any): Self = this.set("verticalBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalBorderStyle(value: js.Any): Self = this.set("verticalBorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitedLinkColor(value: js.Any): Self = this.set("visitedLinkColor", value.asInstanceOf[js.Any])
  }
}
