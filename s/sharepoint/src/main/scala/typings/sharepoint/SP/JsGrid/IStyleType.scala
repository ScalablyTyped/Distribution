package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStyleType extends StObject
object IStyleType {
  
  trait Cell
    extends StObject
       with IStyleType {
    
    /** -> CSS background-color */
    var backgroundColor: Any
    
    /** -> CSS font-family */
    var font: Any
    
    /** -> CSS font-size */
    var fontSize: Any
    
    /** -> CSS font-style */
    var fontStyle: Any
    
    /** -> CSS font-weight */
    var fontWeight: Any
    
    /** -> CSS text-align */
    var textAlign: Any
    
    /** -> CSS color */
    var textColor: Any
  }
  object Cell {
    
    inline def apply(
      backgroundColor: Any,
      font: Any,
      fontSize: Any,
      fontStyle: Any,
      fontWeight: Any,
      textAlign: Any,
      textColor: Any
    ): Cell = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cell]
    }
    
    extension [Self <: Cell](x: Self) {
      
      inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setFont(value: Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontStyle(value: Any): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: Any): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: Any): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait GridPane extends StObject {
    
    var backgroundColor: Any
    
    var changeHighlightCellBgColor: Any
    
    var columnDropIndicatorColor: Any
    
    var copyRectBackBorderColor: Any
    
    var copyRectForeBorderColor: Any
    
    var errorRectBorderColor: Any
    
    var fillRectBorderColor: Any
    
    var focusRectBorderColor: Any
    
    var horizontalBorderColor: Any
    
    var horizontalBorderStyle: Any
    
    var linkColor: Any
    
    var readonlySelectionRectBorderColor: Any
    
    var rowDropIndicatorColor: Any
    
    var selectedCellBgColor: Any
    
    var selectionRectBorderColor: Any
    
    var verticalBorderColor: Any
    
    var verticalBorderStyle: Any
    
    var visitedLinkColor: Any
  }
  object GridPane {
    
    inline def apply(
      backgroundColor: Any,
      changeHighlightCellBgColor: Any,
      columnDropIndicatorColor: Any,
      copyRectBackBorderColor: Any,
      copyRectForeBorderColor: Any,
      errorRectBorderColor: Any,
      fillRectBorderColor: Any,
      focusRectBorderColor: Any,
      horizontalBorderColor: Any,
      horizontalBorderStyle: Any,
      linkColor: Any,
      readonlySelectionRectBorderColor: Any,
      rowDropIndicatorColor: Any,
      selectedCellBgColor: Any,
      selectionRectBorderColor: Any,
      verticalBorderColor: Any,
      verticalBorderStyle: Any,
      visitedLinkColor: Any
    ): GridPane = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], changeHighlightCellBgColor = changeHighlightCellBgColor.asInstanceOf[js.Any], columnDropIndicatorColor = columnDropIndicatorColor.asInstanceOf[js.Any], copyRectBackBorderColor = copyRectBackBorderColor.asInstanceOf[js.Any], copyRectForeBorderColor = copyRectForeBorderColor.asInstanceOf[js.Any], errorRectBorderColor = errorRectBorderColor.asInstanceOf[js.Any], fillRectBorderColor = fillRectBorderColor.asInstanceOf[js.Any], focusRectBorderColor = focusRectBorderColor.asInstanceOf[js.Any], horizontalBorderColor = horizontalBorderColor.asInstanceOf[js.Any], horizontalBorderStyle = horizontalBorderStyle.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], readonlySelectionRectBorderColor = readonlySelectionRectBorderColor.asInstanceOf[js.Any], rowDropIndicatorColor = rowDropIndicatorColor.asInstanceOf[js.Any], selectedCellBgColor = selectedCellBgColor.asInstanceOf[js.Any], selectionRectBorderColor = selectionRectBorderColor.asInstanceOf[js.Any], verticalBorderColor = verticalBorderColor.asInstanceOf[js.Any], verticalBorderStyle = verticalBorderStyle.asInstanceOf[js.Any], visitedLinkColor = visitedLinkColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridPane]
    }
    
    extension [Self <: GridPane](x: Self) {
      
      inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setChangeHighlightCellBgColor(value: Any): Self = StObject.set(x, "changeHighlightCellBgColor", value.asInstanceOf[js.Any])
      
      inline def setColumnDropIndicatorColor(value: Any): Self = StObject.set(x, "columnDropIndicatorColor", value.asInstanceOf[js.Any])
      
      inline def setCopyRectBackBorderColor(value: Any): Self = StObject.set(x, "copyRectBackBorderColor", value.asInstanceOf[js.Any])
      
      inline def setCopyRectForeBorderColor(value: Any): Self = StObject.set(x, "copyRectForeBorderColor", value.asInstanceOf[js.Any])
      
      inline def setErrorRectBorderColor(value: Any): Self = StObject.set(x, "errorRectBorderColor", value.asInstanceOf[js.Any])
      
      inline def setFillRectBorderColor(value: Any): Self = StObject.set(x, "fillRectBorderColor", value.asInstanceOf[js.Any])
      
      inline def setFocusRectBorderColor(value: Any): Self = StObject.set(x, "focusRectBorderColor", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBorderColor(value: Any): Self = StObject.set(x, "horizontalBorderColor", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBorderStyle(value: Any): Self = StObject.set(x, "horizontalBorderStyle", value.asInstanceOf[js.Any])
      
      inline def setLinkColor(value: Any): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      inline def setReadonlySelectionRectBorderColor(value: Any): Self = StObject.set(x, "readonlySelectionRectBorderColor", value.asInstanceOf[js.Any])
      
      inline def setRowDropIndicatorColor(value: Any): Self = StObject.set(x, "rowDropIndicatorColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedCellBgColor(value: Any): Self = StObject.set(x, "selectedCellBgColor", value.asInstanceOf[js.Any])
      
      inline def setSelectionRectBorderColor(value: Any): Self = StObject.set(x, "selectionRectBorderColor", value.asInstanceOf[js.Any])
      
      inline def setVerticalBorderColor(value: Any): Self = StObject.set(x, "verticalBorderColor", value.asInstanceOf[js.Any])
      
      inline def setVerticalBorderStyle(value: Any): Self = StObject.set(x, "verticalBorderStyle", value.asInstanceOf[js.Any])
      
      inline def setVisitedLinkColor(value: Any): Self = StObject.set(x, "visitedLinkColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Header extends StObject {
    
    var backgroundColor: Any
    
    var elementClickBorderColor: Any
    
    var elementClickColor: Any
    
    var eyeBrowBorderColor: Any
    
    var eyeBrowColor: Any
    
    var eyeBrowHoverBorderColor: Any
    
    var eyeBrowHoverColor: Any
    
    var font: Any
    
    var fontSize: Any
    
    var fontWeight: Any
    
    var innerBorderColor: Any
    
    var menuBorderColor: Any
    
    var menuColor: Any
    
    var menuHoverBorderColor: Any
    
    var menuHoverColor: Any
    
    var outerBorderColor: Any
    
    var resizeBorderColor: Any
    
    var resizeColor: Any
    
    var resizeHoverBorderColor: Any
    
    var resizeHoverColor: Any
    
    var textColor: Any
  }
  object Header {
    
    inline def apply(
      backgroundColor: Any,
      elementClickBorderColor: Any,
      elementClickColor: Any,
      eyeBrowBorderColor: Any,
      eyeBrowColor: Any,
      eyeBrowHoverBorderColor: Any,
      eyeBrowHoverColor: Any,
      font: Any,
      fontSize: Any,
      fontWeight: Any,
      innerBorderColor: Any,
      menuBorderColor: Any,
      menuColor: Any,
      menuHoverBorderColor: Any,
      menuHoverColor: Any,
      outerBorderColor: Any,
      resizeBorderColor: Any,
      resizeColor: Any,
      resizeHoverBorderColor: Any,
      resizeHoverColor: Any,
      textColor: Any
    ): Header = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], elementClickBorderColor = elementClickBorderColor.asInstanceOf[js.Any], elementClickColor = elementClickColor.asInstanceOf[js.Any], eyeBrowBorderColor = eyeBrowBorderColor.asInstanceOf[js.Any], eyeBrowColor = eyeBrowColor.asInstanceOf[js.Any], eyeBrowHoverBorderColor = eyeBrowHoverBorderColor.asInstanceOf[js.Any], eyeBrowHoverColor = eyeBrowHoverColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], menuBorderColor = menuBorderColor.asInstanceOf[js.Any], menuColor = menuColor.asInstanceOf[js.Any], menuHoverBorderColor = menuHoverBorderColor.asInstanceOf[js.Any], menuHoverColor = menuHoverColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any], resizeBorderColor = resizeBorderColor.asInstanceOf[js.Any], resizeColor = resizeColor.asInstanceOf[js.Any], resizeHoverBorderColor = resizeHoverBorderColor.asInstanceOf[js.Any], resizeHoverColor = resizeHoverColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setElementClickBorderColor(value: Any): Self = StObject.set(x, "elementClickBorderColor", value.asInstanceOf[js.Any])
      
      inline def setElementClickColor(value: Any): Self = StObject.set(x, "elementClickColor", value.asInstanceOf[js.Any])
      
      inline def setEyeBrowBorderColor(value: Any): Self = StObject.set(x, "eyeBrowBorderColor", value.asInstanceOf[js.Any])
      
      inline def setEyeBrowColor(value: Any): Self = StObject.set(x, "eyeBrowColor", value.asInstanceOf[js.Any])
      
      inline def setEyeBrowHoverBorderColor(value: Any): Self = StObject.set(x, "eyeBrowHoverBorderColor", value.asInstanceOf[js.Any])
      
      inline def setEyeBrowHoverColor(value: Any): Self = StObject.set(x, "eyeBrowHoverColor", value.asInstanceOf[js.Any])
      
      inline def setFont(value: Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: Any): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setInnerBorderColor(value: Any): Self = StObject.set(x, "innerBorderColor", value.asInstanceOf[js.Any])
      
      inline def setMenuBorderColor(value: Any): Self = StObject.set(x, "menuBorderColor", value.asInstanceOf[js.Any])
      
      inline def setMenuColor(value: Any): Self = StObject.set(x, "menuColor", value.asInstanceOf[js.Any])
      
      inline def setMenuHoverBorderColor(value: Any): Self = StObject.set(x, "menuHoverBorderColor", value.asInstanceOf[js.Any])
      
      inline def setMenuHoverColor(value: Any): Self = StObject.set(x, "menuHoverColor", value.asInstanceOf[js.Any])
      
      inline def setOuterBorderColor(value: Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
      
      inline def setResizeBorderColor(value: Any): Self = StObject.set(x, "resizeBorderColor", value.asInstanceOf[js.Any])
      
      inline def setResizeColor(value: Any): Self = StObject.set(x, "resizeColor", value.asInstanceOf[js.Any])
      
      inline def setResizeHoverBorderColor(value: Any): Self = StObject.set(x, "resizeHoverBorderColor", value.asInstanceOf[js.Any])
      
      inline def setResizeHoverColor(value: Any): Self = StObject.set(x, "resizeHoverColor", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowHeaderStyle extends StObject {
    
    var backgroundColor: Any
    
    var innerBorderColor: Any
    
    var outerBorderColor: Any
  }
  object RowHeaderStyle {
    
    inline def apply(backgroundColor: Any, innerBorderColor: Any, outerBorderColor: Any): RowHeaderStyle = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowHeaderStyle]
    }
    
    extension [Self <: RowHeaderStyle](x: Self) {
      
      inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setInnerBorderColor(value: Any): Self = StObject.set(x, "innerBorderColor", value.asInstanceOf[js.Any])
      
      inline def setOuterBorderColor(value: Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Splitter
    extends StObject
       with IStyleType {
    
    var backgroundColor: Any
    
    var innerBorderColor: Any
    
    var leftInnerBorderColor: Any
    
    var outerBorderColor: Any
  }
  object Splitter {
    
    inline def apply(backgroundColor: Any, innerBorderColor: Any, leftInnerBorderColor: Any, outerBorderColor: Any): Splitter = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], leftInnerBorderColor = leftInnerBorderColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Splitter]
    }
    
    extension [Self <: Splitter](x: Self) {
      
      inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setInnerBorderColor(value: Any): Self = StObject.set(x, "innerBorderColor", value.asInstanceOf[js.Any])
      
      inline def setLeftInnerBorderColor(value: Any): Self = StObject.set(x, "leftInnerBorderColor", value.asInstanceOf[js.Any])
      
      inline def setOuterBorderColor(value: Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait SplitterHandle
    extends StObject
       with IStyleType {
    
    var backgroundColor: Any
    
    var gripLowerColor: Any
    
    var gripUpperColor: Any
    
    var innerBorderColor: Any
    
    var leftInnerBorderColor: Any
    
    var outerBorderColor: Any
  }
  object SplitterHandle {
    
    inline def apply(
      backgroundColor: Any,
      gripLowerColor: Any,
      gripUpperColor: Any,
      innerBorderColor: Any,
      leftInnerBorderColor: Any,
      outerBorderColor: Any
    ): SplitterHandle = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], gripLowerColor = gripLowerColor.asInstanceOf[js.Any], gripUpperColor = gripUpperColor.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], leftInnerBorderColor = leftInnerBorderColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitterHandle]
    }
    
    extension [Self <: SplitterHandle](x: Self) {
      
      inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setGripLowerColor(value: Any): Self = StObject.set(x, "gripLowerColor", value.asInstanceOf[js.Any])
      
      inline def setGripUpperColor(value: Any): Self = StObject.set(x, "gripUpperColor", value.asInstanceOf[js.Any])
      
      inline def setInnerBorderColor(value: Any): Self = StObject.set(x, "innerBorderColor", value.asInstanceOf[js.Any])
      
      inline def setLeftInnerBorderColor(value: Any): Self = StObject.set(x, "leftInnerBorderColor", value.asInstanceOf[js.Any])
      
      inline def setOuterBorderColor(value: Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimescaleTier extends StObject {
    
    var backgroundColor: Any
    
    var font: Any
    
    var fontSize: Any
    
    var fontWeight: Any
    
    var horizontalBorderColor: Any
    
    var horizontalBorderStyle: Any
    
    var outerBorderColor: Any
    
    var textColor: Any
    
    var todayLineColor: Any
    
    var verticalBorderColor: Any
    
    var verticalBorderStyle: Any
  }
  object TimescaleTier {
    
    inline def apply(
      backgroundColor: Any,
      font: Any,
      fontSize: Any,
      fontWeight: Any,
      horizontalBorderColor: Any,
      horizontalBorderStyle: Any,
      outerBorderColor: Any,
      textColor: Any,
      todayLineColor: Any,
      verticalBorderColor: Any,
      verticalBorderStyle: Any
    ): TimescaleTier = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], horizontalBorderColor = horizontalBorderColor.asInstanceOf[js.Any], horizontalBorderStyle = horizontalBorderStyle.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], todayLineColor = todayLineColor.asInstanceOf[js.Any], verticalBorderColor = verticalBorderColor.asInstanceOf[js.Any], verticalBorderStyle = verticalBorderStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimescaleTier]
    }
    
    extension [Self <: TimescaleTier](x: Self) {
      
      inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setFont(value: Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: Any): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBorderColor(value: Any): Self = StObject.set(x, "horizontalBorderColor", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBorderStyle(value: Any): Self = StObject.set(x, "horizontalBorderStyle", value.asInstanceOf[js.Any])
      
      inline def setOuterBorderColor(value: Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTodayLineColor(value: Any): Self = StObject.set(x, "todayLineColor", value.asInstanceOf[js.Any])
      
      inline def setVerticalBorderColor(value: Any): Self = StObject.set(x, "verticalBorderColor", value.asInstanceOf[js.Any])
      
      inline def setVerticalBorderStyle(value: Any): Self = StObject.set(x, "verticalBorderStyle", value.asInstanceOf[js.Any])
    }
  }
  
  trait Widget extends StObject {
    
    var backgroundColor: Any
    
    var borderColor: Any
  }
  object Widget {
    
    inline def apply(backgroundColor: Any, borderColor: Any): Widget = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Widget]
    }
    
    extension [Self <: Widget](x: Self) {
      
      inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: Any): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    }
  }
}
