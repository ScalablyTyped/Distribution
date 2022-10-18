package typings.reactabularTable

import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import typings.reactabularTable.mod.CellFormatter
import typings.reactabularTable.mod.CellTransform
import typings.reactabularTable.mod.ColumnFormatter
import typings.reactabularTable.mod.ColumnTransform
import typings.std.CSSRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cell extends StObject {
    
    var cell: js.UndefOr[
        String | (js.Function2[/* props */ Any, /* column */ typings.reactabularTable.mod.Column, Element]) | (js.Function1[/* props */ Any, ReactInstance])
      ] = js.undefined
    
    var row: js.UndefOr[String | (js.Function1[/* props */ Any, Element | ReactInstance])] = js.undefined
    
    var wrapper: js.UndefOr[String | (js.Function1[/* props */ Any, Element | ReactInstance])] = js.undefined
  }
  object Cell {
    
    inline def apply(): Cell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cell]
    }
    
    extension [Self <: Cell](x: Self) {
      
      inline def setCell(
        value: String | (js.Function2[/* props */ Any, /* column */ typings.reactabularTable.mod.Column, Element]) | (js.Function1[/* props */ Any, ReactInstance])
      ): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellFunction1(value: /* props */ Any => ReactInstance): Self = StObject.set(x, "cell", js.Any.fromFunction1(value))
      
      inline def setCellFunction2(value: (/* props */ Any, /* column */ typings.reactabularTable.mod.Column) => Element): Self = StObject.set(x, "cell", js.Any.fromFunction2(value))
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setRow(value: String | (js.Function1[/* props */ Any, Element | ReactInstance])): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowFunction1(value: /* props */ Any => Element | ReactInstance): Self = StObject.set(x, "row", js.Any.fromFunction1(value))
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setWrapper(value: String | (js.Function1[/* props */ Any, Element | ReactInstance])): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperFunction1(value: /* props */ Any => Element | ReactInstance): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait Column extends StObject {
    
    var column: typings.reactabularTable.mod.Column
    
    var columnIndex: Double
    
    var rowData: Any
    
    var rowIndex: Double
  }
  object Column {
    
    inline def apply(column: typings.reactabularTable.mod.Column, columnIndex: Double, rowData: Any, rowIndex: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: typings.reactabularTable.mod.Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnIndex extends StObject {
    
    var column: typings.reactabularTable.mod.Column
    
    var columnIndex: Double
    
    var property: String
    
    var rowData: Any
    
    var rowIndex: Double
  }
  object ColumnIndex {
    
    inline def apply(
      column: typings.reactabularTable.mod.Column,
      columnIndex: Double,
      property: String,
      rowData: Any,
      rowIndex: Double
    ): ColumnIndex = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnIndex]
    }
    
    extension [Self <: ColumnIndex](x: Self) {
      
      inline def setColumn(value: typings.reactabularTable.mod.Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Draggable extends StObject {
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var formatters: js.UndefOr[js.Array[ColumnFormatter]] = js.undefined
    
    var label: String | Element
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var transforms: js.UndefOr[js.Array[ColumnTransform]] = js.undefined
  }
  object Draggable {
    
    inline def apply(label: String | Element): Draggable = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Draggable]
    }
    
    extension [Self <: Draggable](x: Self) {
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFormatters(value: js.Array[ColumnFormatter]): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      inline def setFormattersVarargs(value: ColumnFormatter*): Self = StObject.set(x, "formatters", js.Array(value*))
      
      inline def setLabel(value: String | Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setTransforms(value: js.Array[ColumnTransform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: ColumnTransform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  trait Formatters extends StObject {
    
    var formatters: js.UndefOr[js.Array[CellFormatter]] = js.undefined
    
    var transforms: js.UndefOr[js.Array[CellTransform]] = js.undefined
  }
  object Formatters {
    
    inline def apply(): Formatters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Formatters]
    }
    
    extension [Self <: Formatters](x: Self) {
      
      inline def setFormatters(value: js.Array[CellFormatter]): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      inline def setFormattersVarargs(value: CellFormatter*): Self = StObject.set(x, "formatters", js.Array(value*))
      
      inline def setTransforms(value: js.Array[CellTransform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: CellTransform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<std.CSSStyleDeclaration> */
  trait PartialCSSStyleDeclaratio extends StObject {
    
    var accentColor: js.UndefOr[String] = js.undefined
    
    var alignContent: js.UndefOr[String] = js.undefined
    
    var alignItems: js.UndefOr[String] = js.undefined
    
    var alignSelf: js.UndefOr[String] = js.undefined
    
    var alignmentBaseline: js.UndefOr[String] = js.undefined
    
    var all: js.UndefOr[String] = js.undefined
    
    var animation: js.UndefOr[String] = js.undefined
    
    var animationDelay: js.UndefOr[String] = js.undefined
    
    var animationDirection: js.UndefOr[String] = js.undefined
    
    var animationDuration: js.UndefOr[String] = js.undefined
    
    var animationFillMode: js.UndefOr[String] = js.undefined
    
    var animationIterationCount: js.UndefOr[String] = js.undefined
    
    var animationName: js.UndefOr[String] = js.undefined
    
    var animationPlayState: js.UndefOr[String] = js.undefined
    
    var animationTimingFunction: js.UndefOr[String] = js.undefined
    
    var appearance: js.UndefOr[String] = js.undefined
    
    var aspectRatio: js.UndefOr[String] = js.undefined
    
    var backfaceVisibility: js.UndefOr[String] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var backgroundAttachment: js.UndefOr[String] = js.undefined
    
    var backgroundBlendMode: js.UndefOr[String] = js.undefined
    
    var backgroundClip: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var backgroundImage: js.UndefOr[String] = js.undefined
    
    var backgroundOrigin: js.UndefOr[String] = js.undefined
    
    var backgroundPosition: js.UndefOr[String] = js.undefined
    
    var backgroundPositionX: js.UndefOr[String] = js.undefined
    
    var backgroundPositionY: js.UndefOr[String] = js.undefined
    
    var backgroundRepeat: js.UndefOr[String] = js.undefined
    
    var backgroundSize: js.UndefOr[String] = js.undefined
    
    var baselineShift: js.UndefOr[String] = js.undefined
    
    var blockSize: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[String] = js.undefined
    
    var borderBlock: js.UndefOr[String] = js.undefined
    
    var borderBlockColor: js.UndefOr[String] = js.undefined
    
    var borderBlockEnd: js.UndefOr[String] = js.undefined
    
    var borderBlockEndColor: js.UndefOr[String] = js.undefined
    
    var borderBlockEndStyle: js.UndefOr[String] = js.undefined
    
    var borderBlockEndWidth: js.UndefOr[String] = js.undefined
    
    var borderBlockStart: js.UndefOr[String] = js.undefined
    
    var borderBlockStartColor: js.UndefOr[String] = js.undefined
    
    var borderBlockStartStyle: js.UndefOr[String] = js.undefined
    
    var borderBlockStartWidth: js.UndefOr[String] = js.undefined
    
    var borderBlockStyle: js.UndefOr[String] = js.undefined
    
    var borderBlockWidth: js.UndefOr[String] = js.undefined
    
    var borderBottom: js.UndefOr[String] = js.undefined
    
    var borderBottomColor: js.UndefOr[String] = js.undefined
    
    var borderBottomLeftRadius: js.UndefOr[String] = js.undefined
    
    var borderBottomRightRadius: js.UndefOr[String] = js.undefined
    
    var borderBottomStyle: js.UndefOr[String] = js.undefined
    
    var borderBottomWidth: js.UndefOr[String] = js.undefined
    
    var borderCollapse: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var borderEndEndRadius: js.UndefOr[String] = js.undefined
    
    var borderEndStartRadius: js.UndefOr[String] = js.undefined
    
    var borderImage: js.UndefOr[String] = js.undefined
    
    var borderImageOutset: js.UndefOr[String] = js.undefined
    
    var borderImageRepeat: js.UndefOr[String] = js.undefined
    
    var borderImageSlice: js.UndefOr[String] = js.undefined
    
    var borderImageSource: js.UndefOr[String] = js.undefined
    
    var borderImageWidth: js.UndefOr[String] = js.undefined
    
    var borderInline: js.UndefOr[String] = js.undefined
    
    var borderInlineColor: js.UndefOr[String] = js.undefined
    
    var borderInlineEnd: js.UndefOr[String] = js.undefined
    
    var borderInlineEndColor: js.UndefOr[String] = js.undefined
    
    var borderInlineEndStyle: js.UndefOr[String] = js.undefined
    
    var borderInlineEndWidth: js.UndefOr[String] = js.undefined
    
    var borderInlineStart: js.UndefOr[String] = js.undefined
    
    var borderInlineStartColor: js.UndefOr[String] = js.undefined
    
    var borderInlineStartStyle: js.UndefOr[String] = js.undefined
    
    var borderInlineStartWidth: js.UndefOr[String] = js.undefined
    
    var borderInlineStyle: js.UndefOr[String] = js.undefined
    
    var borderInlineWidth: js.UndefOr[String] = js.undefined
    
    var borderLeft: js.UndefOr[String] = js.undefined
    
    var borderLeftColor: js.UndefOr[String] = js.undefined
    
    var borderLeftStyle: js.UndefOr[String] = js.undefined
    
    var borderLeftWidth: js.UndefOr[String] = js.undefined
    
    var borderRadius: js.UndefOr[String] = js.undefined
    
    var borderRight: js.UndefOr[String] = js.undefined
    
    var borderRightColor: js.UndefOr[String] = js.undefined
    
    var borderRightStyle: js.UndefOr[String] = js.undefined
    
    var borderRightWidth: js.UndefOr[String] = js.undefined
    
    var borderSpacing: js.UndefOr[String] = js.undefined
    
    var borderStartEndRadius: js.UndefOr[String] = js.undefined
    
    var borderStartStartRadius: js.UndefOr[String] = js.undefined
    
    var borderStyle: js.UndefOr[String] = js.undefined
    
    var borderTop: js.UndefOr[String] = js.undefined
    
    var borderTopColor: js.UndefOr[String] = js.undefined
    
    var borderTopLeftRadius: js.UndefOr[String] = js.undefined
    
    var borderTopRightRadius: js.UndefOr[String] = js.undefined
    
    var borderTopStyle: js.UndefOr[String] = js.undefined
    
    var borderTopWidth: js.UndefOr[String] = js.undefined
    
    var borderWidth: js.UndefOr[String] = js.undefined
    
    var bottom: js.UndefOr[String] = js.undefined
    
    var boxShadow: js.UndefOr[String] = js.undefined
    
    var boxSizing: js.UndefOr[String] = js.undefined
    
    var breakAfter: js.UndefOr[String] = js.undefined
    
    var breakBefore: js.UndefOr[String] = js.undefined
    
    var breakInside: js.UndefOr[String] = js.undefined
    
    var captionSide: js.UndefOr[String] = js.undefined
    
    var caretColor: js.UndefOr[String] = js.undefined
    
    var clear: js.UndefOr[String] = js.undefined
    
    var clip: js.UndefOr[String] = js.undefined
    
    var clipPath: js.UndefOr[String] = js.undefined
    
    var clipRule: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var colorInterpolation: js.UndefOr[String] = js.undefined
    
    var colorInterpolationFilters: js.UndefOr[String] = js.undefined
    
    var colorScheme: js.UndefOr[String] = js.undefined
    
    var columnCount: js.UndefOr[String] = js.undefined
    
    var columnFill: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[String] = js.undefined
    
    var columnRule: js.UndefOr[String] = js.undefined
    
    var columnRuleColor: js.UndefOr[String] = js.undefined
    
    var columnRuleStyle: js.UndefOr[String] = js.undefined
    
    var columnRuleWidth: js.UndefOr[String] = js.undefined
    
    var columnSpan: js.UndefOr[String] = js.undefined
    
    var columnWidth: js.UndefOr[String] = js.undefined
    
    var columns: js.UndefOr[String] = js.undefined
    
    var contain: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var counterIncrement: js.UndefOr[String] = js.undefined
    
    var counterReset: js.UndefOr[String] = js.undefined
    
    var counterSet: js.UndefOr[String] = js.undefined
    
    var cssFloat: js.UndefOr[String] = js.undefined
    
    var cssText: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    var dominantBaseline: js.UndefOr[String] = js.undefined
    
    var emptyCells: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[String] = js.undefined
    
    var fillRule: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var flex: js.UndefOr[String] = js.undefined
    
    var flexBasis: js.UndefOr[String] = js.undefined
    
    var flexDirection: js.UndefOr[String] = js.undefined
    
    var flexFlow: js.UndefOr[String] = js.undefined
    
    var flexGrow: js.UndefOr[String] = js.undefined
    
    var flexShrink: js.UndefOr[String] = js.undefined
    
    var flexWrap: js.UndefOr[String] = js.undefined
    
    var float: js.UndefOr[String] = js.undefined
    
    var floodColor: js.UndefOr[String] = js.undefined
    
    var floodOpacity: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontFeatureSettings: js.UndefOr[String] = js.undefined
    
    var fontKerning: js.UndefOr[String] = js.undefined
    
    var fontOpticalSizing: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontSizeAdjust: js.UndefOr[String] = js.undefined
    
    var fontStretch: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontSynthesis: js.UndefOr[String] = js.undefined
    
    var fontVariant: js.UndefOr[String] = js.undefined
    
    var fontVariantAlternates: js.UndefOr[String] = js.undefined
    
    var fontVariantCaps: js.UndefOr[String] = js.undefined
    
    var fontVariantEastAsian: js.UndefOr[String] = js.undefined
    
    var fontVariantLigatures: js.UndefOr[String] = js.undefined
    
    var fontVariantNumeric: js.UndefOr[String] = js.undefined
    
    var fontVariantPosition: js.UndefOr[String] = js.undefined
    
    var fontVariationSettings: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
    
    var gap: js.UndefOr[String] = js.undefined
    
    var getPropertyPriority: js.UndefOr[js.Function1[/* property */ String, String]] = js.undefined
    
    var getPropertyValue: js.UndefOr[js.Function1[/* property */ String, String]] = js.undefined
    
    var grid: js.UndefOr[String] = js.undefined
    
    var gridArea: js.UndefOr[String] = js.undefined
    
    var gridAutoColumns: js.UndefOr[String] = js.undefined
    
    var gridAutoFlow: js.UndefOr[String] = js.undefined
    
    var gridAutoRows: js.UndefOr[String] = js.undefined
    
    var gridColumn: js.UndefOr[String] = js.undefined
    
    var gridColumnEnd: js.UndefOr[String] = js.undefined
    
    var gridColumnGap: js.UndefOr[String] = js.undefined
    
    var gridColumnStart: js.UndefOr[String] = js.undefined
    
    var gridGap: js.UndefOr[String] = js.undefined
    
    var gridRow: js.UndefOr[String] = js.undefined
    
    var gridRowEnd: js.UndefOr[String] = js.undefined
    
    var gridRowGap: js.UndefOr[String] = js.undefined
    
    var gridRowStart: js.UndefOr[String] = js.undefined
    
    var gridTemplate: js.UndefOr[String] = js.undefined
    
    var gridTemplateAreas: js.UndefOr[String] = js.undefined
    
    var gridTemplateColumns: js.UndefOr[String] = js.undefined
    
    var gridTemplateRows: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var hyphens: js.UndefOr[String] = js.undefined
    
    var imageOrientation: js.UndefOr[String] = js.undefined
    
    var imageRendering: js.UndefOr[String] = js.undefined
    
    var inlineSize: js.UndefOr[String] = js.undefined
    
    var inset: js.UndefOr[String] = js.undefined
    
    var insetBlock: js.UndefOr[String] = js.undefined
    
    var insetBlockEnd: js.UndefOr[String] = js.undefined
    
    var insetBlockStart: js.UndefOr[String] = js.undefined
    
    var insetInline: js.UndefOr[String] = js.undefined
    
    var insetInlineEnd: js.UndefOr[String] = js.undefined
    
    var insetInlineStart: js.UndefOr[String] = js.undefined
    
    var isolation: js.UndefOr[String] = js.undefined
    
    var item: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
    
    var justifyContent: js.UndefOr[String] = js.undefined
    
    var justifyItems: js.UndefOr[String] = js.undefined
    
    var justifySelf: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[String] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var letterSpacing: js.UndefOr[String] = js.undefined
    
    var lightingColor: js.UndefOr[String] = js.undefined
    
    var lineBreak: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[String] = js.undefined
    
    var listStyle: js.UndefOr[String] = js.undefined
    
    var listStyleImage: js.UndefOr[String] = js.undefined
    
    var listStylePosition: js.UndefOr[String] = js.undefined
    
    var listStyleType: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[String] = js.undefined
    
    var marginBlock: js.UndefOr[String] = js.undefined
    
    var marginBlockEnd: js.UndefOr[String] = js.undefined
    
    var marginBlockStart: js.UndefOr[String] = js.undefined
    
    var marginBottom: js.UndefOr[String] = js.undefined
    
    var marginInline: js.UndefOr[String] = js.undefined
    
    var marginInlineEnd: js.UndefOr[String] = js.undefined
    
    var marginInlineStart: js.UndefOr[String] = js.undefined
    
    var marginLeft: js.UndefOr[String] = js.undefined
    
    var marginRight: js.UndefOr[String] = js.undefined
    
    var marginTop: js.UndefOr[String] = js.undefined
    
    var marker: js.UndefOr[String] = js.undefined
    
    var markerEnd: js.UndefOr[String] = js.undefined
    
    var markerMid: js.UndefOr[String] = js.undefined
    
    var markerStart: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var maskClip: js.UndefOr[String] = js.undefined
    
    var maskComposite: js.UndefOr[String] = js.undefined
    
    var maskImage: js.UndefOr[String] = js.undefined
    
    var maskMode: js.UndefOr[String] = js.undefined
    
    var maskOrigin: js.UndefOr[String] = js.undefined
    
    var maskPosition: js.UndefOr[String] = js.undefined
    
    var maskRepeat: js.UndefOr[String] = js.undefined
    
    var maskSize: js.UndefOr[String] = js.undefined
    
    var maskType: js.UndefOr[String] = js.undefined
    
    var maxBlockSize: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[String] = js.undefined
    
    var maxInlineSize: js.UndefOr[String] = js.undefined
    
    var maxWidth: js.UndefOr[String] = js.undefined
    
    var minBlockSize: js.UndefOr[String] = js.undefined
    
    var minHeight: js.UndefOr[String] = js.undefined
    
    var minInlineSize: js.UndefOr[String] = js.undefined
    
    var minWidth: js.UndefOr[String] = js.undefined
    
    var mixBlendMode: js.UndefOr[String] = js.undefined
    
    var objectFit: js.UndefOr[String] = js.undefined
    
    var objectPosition: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[String] = js.undefined
    
    var offsetDistance: js.UndefOr[String] = js.undefined
    
    var offsetPath: js.UndefOr[String] = js.undefined
    
    var offsetRotate: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[String] = js.undefined
    
    var orphans: js.UndefOr[String] = js.undefined
    
    var outline: js.UndefOr[String] = js.undefined
    
    var outlineColor: js.UndefOr[String] = js.undefined
    
    var outlineOffset: js.UndefOr[String] = js.undefined
    
    var outlineStyle: js.UndefOr[String] = js.undefined
    
    var outlineWidth: js.UndefOr[String] = js.undefined
    
    var overflow: js.UndefOr[String] = js.undefined
    
    var overflowAnchor: js.UndefOr[String] = js.undefined
    
    var overflowWrap: js.UndefOr[String] = js.undefined
    
    var overflowX: js.UndefOr[String] = js.undefined
    
    var overflowY: js.UndefOr[String] = js.undefined
    
    var overscrollBehavior: js.UndefOr[String] = js.undefined
    
    var overscrollBehaviorBlock: js.UndefOr[String] = js.undefined
    
    var overscrollBehaviorInline: js.UndefOr[String] = js.undefined
    
    var overscrollBehaviorX: js.UndefOr[String] = js.undefined
    
    var overscrollBehaviorY: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[String] = js.undefined
    
    var paddingBlock: js.UndefOr[String] = js.undefined
    
    var paddingBlockEnd: js.UndefOr[String] = js.undefined
    
    var paddingBlockStart: js.UndefOr[String] = js.undefined
    
    var paddingBottom: js.UndefOr[String] = js.undefined
    
    var paddingInline: js.UndefOr[String] = js.undefined
    
    var paddingInlineEnd: js.UndefOr[String] = js.undefined
    
    var paddingInlineStart: js.UndefOr[String] = js.undefined
    
    var paddingLeft: js.UndefOr[String] = js.undefined
    
    var paddingRight: js.UndefOr[String] = js.undefined
    
    var paddingTop: js.UndefOr[String] = js.undefined
    
    var pageBreakAfter: js.UndefOr[String] = js.undefined
    
    var pageBreakBefore: js.UndefOr[String] = js.undefined
    
    var pageBreakInside: js.UndefOr[String] = js.undefined
    
    var paintOrder: js.UndefOr[String] = js.undefined
    
    var parentRule: js.UndefOr[CSSRule | Null] = js.undefined
    
    var perspective: js.UndefOr[String] = js.undefined
    
    var perspectiveOrigin: js.UndefOr[String] = js.undefined
    
    var placeContent: js.UndefOr[String] = js.undefined
    
    var placeItems: js.UndefOr[String] = js.undefined
    
    var placeSelf: js.UndefOr[String] = js.undefined
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var printColorAdjust: js.UndefOr[String] = js.undefined
    
    var quotes: js.UndefOr[String] = js.undefined
    
    var removeProperty: js.UndefOr[js.Function1[/* property */ String, String]] = js.undefined
    
    var resize: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[String] = js.undefined
    
    var rowGap: js.UndefOr[String] = js.undefined
    
    var rubyPosition: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[String] = js.undefined
    
    var scrollBehavior: js.UndefOr[String] = js.undefined
    
    var scrollMargin: js.UndefOr[String] = js.undefined
    
    var scrollMarginBlock: js.UndefOr[String] = js.undefined
    
    var scrollMarginBlockEnd: js.UndefOr[String] = js.undefined
    
    var scrollMarginBlockStart: js.UndefOr[String] = js.undefined
    
    var scrollMarginBottom: js.UndefOr[String] = js.undefined
    
    var scrollMarginInline: js.UndefOr[String] = js.undefined
    
    var scrollMarginInlineEnd: js.UndefOr[String] = js.undefined
    
    var scrollMarginInlineStart: js.UndefOr[String] = js.undefined
    
    var scrollMarginLeft: js.UndefOr[String] = js.undefined
    
    var scrollMarginRight: js.UndefOr[String] = js.undefined
    
    var scrollMarginTop: js.UndefOr[String] = js.undefined
    
    var scrollPadding: js.UndefOr[String] = js.undefined
    
    var scrollPaddingBlock: js.UndefOr[String] = js.undefined
    
    var scrollPaddingBlockEnd: js.UndefOr[String] = js.undefined
    
    var scrollPaddingBlockStart: js.UndefOr[String] = js.undefined
    
    var scrollPaddingBottom: js.UndefOr[String] = js.undefined
    
    var scrollPaddingInline: js.UndefOr[String] = js.undefined
    
    var scrollPaddingInlineEnd: js.UndefOr[String] = js.undefined
    
    var scrollPaddingInlineStart: js.UndefOr[String] = js.undefined
    
    var scrollPaddingLeft: js.UndefOr[String] = js.undefined
    
    var scrollPaddingRight: js.UndefOr[String] = js.undefined
    
    var scrollPaddingTop: js.UndefOr[String] = js.undefined
    
    var scrollSnapAlign: js.UndefOr[String] = js.undefined
    
    var scrollSnapStop: js.UndefOr[String] = js.undefined
    
    var scrollSnapType: js.UndefOr[String] = js.undefined
    
    var scrollbarGutter: js.UndefOr[String] = js.undefined
    
    var setProperty: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.undefined
    
    var shapeImageThreshold: js.UndefOr[String] = js.undefined
    
    var shapeMargin: js.UndefOr[String] = js.undefined
    
    var shapeOutside: js.UndefOr[String] = js.undefined
    
    var shapeRendering: js.UndefOr[String] = js.undefined
    
    var stopColor: js.UndefOr[String] = js.undefined
    
    var stopOpacity: js.UndefOr[String] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var strokeDasharray: js.UndefOr[String] = js.undefined
    
    var strokeDashoffset: js.UndefOr[String] = js.undefined
    
    var strokeLinecap: js.UndefOr[String] = js.undefined
    
    var strokeLinejoin: js.UndefOr[String] = js.undefined
    
    var strokeMiterlimit: js.UndefOr[String] = js.undefined
    
    var strokeOpacity: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[String] = js.undefined
    
    var tabSize: js.UndefOr[String] = js.undefined
    
    var tableLayout: js.UndefOr[String] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var textAlignLast: js.UndefOr[String] = js.undefined
    
    var textAnchor: js.UndefOr[String] = js.undefined
    
    var textCombineUpright: js.UndefOr[String] = js.undefined
    
    var textDecoration: js.UndefOr[String] = js.undefined
    
    var textDecorationColor: js.UndefOr[String] = js.undefined
    
    var textDecorationLine: js.UndefOr[String] = js.undefined
    
    var textDecorationSkipInk: js.UndefOr[String] = js.undefined
    
    var textDecorationStyle: js.UndefOr[String] = js.undefined
    
    var textDecorationThickness: js.UndefOr[String] = js.undefined
    
    var textEmphasis: js.UndefOr[String] = js.undefined
    
    var textEmphasisColor: js.UndefOr[String] = js.undefined
    
    var textEmphasisPosition: js.UndefOr[String] = js.undefined
    
    var textEmphasisStyle: js.UndefOr[String] = js.undefined
    
    var textIndent: js.UndefOr[String] = js.undefined
    
    var textOrientation: js.UndefOr[String] = js.undefined
    
    var textOverflow: js.UndefOr[String] = js.undefined
    
    var textRendering: js.UndefOr[String] = js.undefined
    
    var textShadow: js.UndefOr[String] = js.undefined
    
    var textTransform: js.UndefOr[String] = js.undefined
    
    var textUnderlineOffset: js.UndefOr[String] = js.undefined
    
    var textUnderlinePosition: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[String] = js.undefined
    
    var touchAction: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
    
    var transformBox: js.UndefOr[String] = js.undefined
    
    var transformOrigin: js.UndefOr[String] = js.undefined
    
    var transformStyle: js.UndefOr[String] = js.undefined
    
    var transition: js.UndefOr[String] = js.undefined
    
    var transitionDelay: js.UndefOr[String] = js.undefined
    
    var transitionDuration: js.UndefOr[String] = js.undefined
    
    var transitionProperty: js.UndefOr[String] = js.undefined
    
    var transitionTimingFunction: js.UndefOr[String] = js.undefined
    
    var translate: js.UndefOr[String] = js.undefined
    
    var unicodeBidi: js.UndefOr[String] = js.undefined
    
    var userSelect: js.UndefOr[String] = js.undefined
    
    var verticalAlign: js.UndefOr[String] = js.undefined
    
    var visibility: js.UndefOr[String] = js.undefined
    
    var webkitAlignContent: js.UndefOr[String] = js.undefined
    
    var webkitAlignItems: js.UndefOr[String] = js.undefined
    
    var webkitAlignSelf: js.UndefOr[String] = js.undefined
    
    var webkitAnimation: js.UndefOr[String] = js.undefined
    
    var webkitAnimationDelay: js.UndefOr[String] = js.undefined
    
    var webkitAnimationDirection: js.UndefOr[String] = js.undefined
    
    var webkitAnimationDuration: js.UndefOr[String] = js.undefined
    
    var webkitAnimationFillMode: js.UndefOr[String] = js.undefined
    
    var webkitAnimationIterationCount: js.UndefOr[String] = js.undefined
    
    var webkitAnimationName: js.UndefOr[String] = js.undefined
    
    var webkitAnimationPlayState: js.UndefOr[String] = js.undefined
    
    var webkitAnimationTimingFunction: js.UndefOr[String] = js.undefined
    
    var webkitAppearance: js.UndefOr[String] = js.undefined
    
    var webkitBackfaceVisibility: js.UndefOr[String] = js.undefined
    
    var webkitBackgroundClip: js.UndefOr[String] = js.undefined
    
    var webkitBackgroundOrigin: js.UndefOr[String] = js.undefined
    
    var webkitBackgroundSize: js.UndefOr[String] = js.undefined
    
    var webkitBorderBottomLeftRadius: js.UndefOr[String] = js.undefined
    
    var webkitBorderBottomRightRadius: js.UndefOr[String] = js.undefined
    
    var webkitBorderRadius: js.UndefOr[String] = js.undefined
    
    var webkitBorderTopLeftRadius: js.UndefOr[String] = js.undefined
    
    var webkitBorderTopRightRadius: js.UndefOr[String] = js.undefined
    
    var webkitBoxAlign: js.UndefOr[String] = js.undefined
    
    var webkitBoxFlex: js.UndefOr[String] = js.undefined
    
    var webkitBoxOrdinalGroup: js.UndefOr[String] = js.undefined
    
    var webkitBoxOrient: js.UndefOr[String] = js.undefined
    
    var webkitBoxPack: js.UndefOr[String] = js.undefined
    
    var webkitBoxShadow: js.UndefOr[String] = js.undefined
    
    var webkitBoxSizing: js.UndefOr[String] = js.undefined
    
    var webkitFilter: js.UndefOr[String] = js.undefined
    
    var webkitFlex: js.UndefOr[String] = js.undefined
    
    var webkitFlexBasis: js.UndefOr[String] = js.undefined
    
    var webkitFlexDirection: js.UndefOr[String] = js.undefined
    
    var webkitFlexFlow: js.UndefOr[String] = js.undefined
    
    var webkitFlexGrow: js.UndefOr[String] = js.undefined
    
    var webkitFlexShrink: js.UndefOr[String] = js.undefined
    
    var webkitFlexWrap: js.UndefOr[String] = js.undefined
    
    var webkitJustifyContent: js.UndefOr[String] = js.undefined
    
    var webkitLineClamp: js.UndefOr[String] = js.undefined
    
    var webkitMask: js.UndefOr[String] = js.undefined
    
    var webkitMaskBoxImage: js.UndefOr[String] = js.undefined
    
    var webkitMaskBoxImageOutset: js.UndefOr[String] = js.undefined
    
    var webkitMaskBoxImageRepeat: js.UndefOr[String] = js.undefined
    
    var webkitMaskBoxImageSlice: js.UndefOr[String] = js.undefined
    
    var webkitMaskBoxImageSource: js.UndefOr[String] = js.undefined
    
    var webkitMaskBoxImageWidth: js.UndefOr[String] = js.undefined
    
    var webkitMaskClip: js.UndefOr[String] = js.undefined
    
    var webkitMaskComposite: js.UndefOr[String] = js.undefined
    
    var webkitMaskImage: js.UndefOr[String] = js.undefined
    
    var webkitMaskOrigin: js.UndefOr[String] = js.undefined
    
    var webkitMaskPosition: js.UndefOr[String] = js.undefined
    
    var webkitMaskRepeat: js.UndefOr[String] = js.undefined
    
    var webkitMaskSize: js.UndefOr[String] = js.undefined
    
    var webkitOrder: js.UndefOr[String] = js.undefined
    
    var webkitPerspective: js.UndefOr[String] = js.undefined
    
    var webkitPerspectiveOrigin: js.UndefOr[String] = js.undefined
    
    var webkitTextFillColor: js.UndefOr[String] = js.undefined
    
    var webkitTextSizeAdjust: js.UndefOr[String] = js.undefined
    
    var webkitTextStroke: js.UndefOr[String] = js.undefined
    
    var webkitTextStrokeColor: js.UndefOr[String] = js.undefined
    
    var webkitTextStrokeWidth: js.UndefOr[String] = js.undefined
    
    var webkitTransform: js.UndefOr[String] = js.undefined
    
    var webkitTransformOrigin: js.UndefOr[String] = js.undefined
    
    var webkitTransformStyle: js.UndefOr[String] = js.undefined
    
    var webkitTransition: js.UndefOr[String] = js.undefined
    
    var webkitTransitionDelay: js.UndefOr[String] = js.undefined
    
    var webkitTransitionDuration: js.UndefOr[String] = js.undefined
    
    var webkitTransitionProperty: js.UndefOr[String] = js.undefined
    
    var webkitTransitionTimingFunction: js.UndefOr[String] = js.undefined
    
    var webkitUserSelect: js.UndefOr[String] = js.undefined
    
    var whiteSpace: js.UndefOr[String] = js.undefined
    
    var widows: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    var willChange: js.UndefOr[String] = js.undefined
    
    var wordBreak: js.UndefOr[String] = js.undefined
    
    var wordSpacing: js.UndefOr[String] = js.undefined
    
    var wordWrap: js.UndefOr[String] = js.undefined
    
    var writingMode: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[String] = js.undefined
  }
  object PartialCSSStyleDeclaratio {
    
    inline def apply(): PartialCSSStyleDeclaratio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCSSStyleDeclaratio]
    }
    
    extension [Self <: PartialCSSStyleDeclaratio](x: Self) {
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      inline def setAlignContent(value: String): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignSelf(value: String): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationDelay(value: String): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
      
      inline def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
      
      inline def setAnimationDirection(value: String): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
      
      inline def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
      
      inline def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationFillMode(value: String): Self = StObject.set(x, "animationFillMode", value.asInstanceOf[js.Any])
      
      inline def setAnimationFillModeUndefined: Self = StObject.set(x, "animationFillMode", js.undefined)
      
      inline def setAnimationIterationCount(value: String): Self = StObject.set(x, "animationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setAnimationIterationCountUndefined: Self = StObject.set(x, "animationIterationCount", js.undefined)
      
      inline def setAnimationName(value: String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
      
      inline def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
      
      inline def setAnimationPlayState(value: String): Self = StObject.set(x, "animationPlayState", value.asInstanceOf[js.Any])
      
      inline def setAnimationPlayStateUndefined: Self = StObject.set(x, "animationPlayState", js.undefined)
      
      inline def setAnimationTimingFunction(value: String): Self = StObject.set(x, "animationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setBackfaceVisibility(value: String): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAttachment(value: String): Self = StObject.set(x, "backgroundAttachment", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAttachmentUndefined: Self = StObject.set(x, "backgroundAttachment", js.undefined)
      
      inline def setBackgroundBlendMode(value: String): Self = StObject.set(x, "backgroundBlendMode", value.asInstanceOf[js.Any])
      
      inline def setBackgroundBlendModeUndefined: Self = StObject.set(x, "backgroundBlendMode", js.undefined)
      
      inline def setBackgroundClip(value: String): Self = StObject.set(x, "backgroundClip", value.asInstanceOf[js.Any])
      
      inline def setBackgroundClipUndefined: Self = StObject.set(x, "backgroundClip", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundOrigin(value: String): Self = StObject.set(x, "backgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOriginUndefined: Self = StObject.set(x, "backgroundOrigin", js.undefined)
      
      inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      inline def setBackgroundPositionX(value: String): Self = StObject.set(x, "backgroundPositionX", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionXUndefined: Self = StObject.set(x, "backgroundPositionX", js.undefined)
      
      inline def setBackgroundPositionY(value: String): Self = StObject.set(x, "backgroundPositionY", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionYUndefined: Self = StObject.set(x, "backgroundPositionY", js.undefined)
      
      inline def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setBackgroundSize(value: String): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBaselineShift(value: String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def setBlockSize(value: String): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderBlock(value: String): Self = StObject.set(x, "borderBlock", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockColor(value: String): Self = StObject.set(x, "borderBlockColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockColorUndefined: Self = StObject.set(x, "borderBlockColor", js.undefined)
      
      inline def setBorderBlockEnd(value: String): Self = StObject.set(x, "borderBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndColor(value: String): Self = StObject.set(x, "borderBlockEndColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndColorUndefined: Self = StObject.set(x, "borderBlockEndColor", js.undefined)
      
      inline def setBorderBlockEndStyle(value: String): Self = StObject.set(x, "borderBlockEndStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndStyleUndefined: Self = StObject.set(x, "borderBlockEndStyle", js.undefined)
      
      inline def setBorderBlockEndUndefined: Self = StObject.set(x, "borderBlockEnd", js.undefined)
      
      inline def setBorderBlockEndWidth(value: String): Self = StObject.set(x, "borderBlockEndWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockEndWidthUndefined: Self = StObject.set(x, "borderBlockEndWidth", js.undefined)
      
      inline def setBorderBlockStart(value: String): Self = StObject.set(x, "borderBlockStart", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartColor(value: String): Self = StObject.set(x, "borderBlockStartColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartColorUndefined: Self = StObject.set(x, "borderBlockStartColor", js.undefined)
      
      inline def setBorderBlockStartStyle(value: String): Self = StObject.set(x, "borderBlockStartStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartStyleUndefined: Self = StObject.set(x, "borderBlockStartStyle", js.undefined)
      
      inline def setBorderBlockStartUndefined: Self = StObject.set(x, "borderBlockStart", js.undefined)
      
      inline def setBorderBlockStartWidth(value: String): Self = StObject.set(x, "borderBlockStartWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStartWidthUndefined: Self = StObject.set(x, "borderBlockStartWidth", js.undefined)
      
      inline def setBorderBlockStyle(value: String): Self = StObject.set(x, "borderBlockStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockStyleUndefined: Self = StObject.set(x, "borderBlockStyle", js.undefined)
      
      inline def setBorderBlockUndefined: Self = StObject.set(x, "borderBlock", js.undefined)
      
      inline def setBorderBlockWidth(value: String): Self = StObject.set(x, "borderBlockWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBlockWidthUndefined: Self = StObject.set(x, "borderBlockWidth", js.undefined)
      
      inline def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      inline def setBorderBottomLeftRadius(value: String): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      inline def setBorderBottomRightRadius(value: String): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      inline def setBorderBottomStyle(value: String): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
      
      inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      inline def setBorderBottomWidth(value: String): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      inline def setBorderCollapse(value: String): Self = StObject.set(x, "borderCollapse", value.asInstanceOf[js.Any])
      
      inline def setBorderCollapseUndefined: Self = StObject.set(x, "borderCollapse", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderEndEndRadius(value: String): Self = StObject.set(x, "borderEndEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderEndEndRadiusUndefined: Self = StObject.set(x, "borderEndEndRadius", js.undefined)
      
      inline def setBorderEndStartRadius(value: String): Self = StObject.set(x, "borderEndStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderEndStartRadiusUndefined: Self = StObject.set(x, "borderEndStartRadius", js.undefined)
      
      inline def setBorderImage(value: String): Self = StObject.set(x, "borderImage", value.asInstanceOf[js.Any])
      
      inline def setBorderImageOutset(value: String): Self = StObject.set(x, "borderImageOutset", value.asInstanceOf[js.Any])
      
      inline def setBorderImageOutsetUndefined: Self = StObject.set(x, "borderImageOutset", js.undefined)
      
      inline def setBorderImageRepeat(value: String): Self = StObject.set(x, "borderImageRepeat", value.asInstanceOf[js.Any])
      
      inline def setBorderImageRepeatUndefined: Self = StObject.set(x, "borderImageRepeat", js.undefined)
      
      inline def setBorderImageSlice(value: String): Self = StObject.set(x, "borderImageSlice", value.asInstanceOf[js.Any])
      
      inline def setBorderImageSliceUndefined: Self = StObject.set(x, "borderImageSlice", js.undefined)
      
      inline def setBorderImageSource(value: String): Self = StObject.set(x, "borderImageSource", value.asInstanceOf[js.Any])
      
      inline def setBorderImageSourceUndefined: Self = StObject.set(x, "borderImageSource", js.undefined)
      
      inline def setBorderImageUndefined: Self = StObject.set(x, "borderImage", js.undefined)
      
      inline def setBorderImageWidth(value: String): Self = StObject.set(x, "borderImageWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderImageWidthUndefined: Self = StObject.set(x, "borderImageWidth", js.undefined)
      
      inline def setBorderInline(value: String): Self = StObject.set(x, "borderInline", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineColor(value: String): Self = StObject.set(x, "borderInlineColor", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineColorUndefined: Self = StObject.set(x, "borderInlineColor", js.undefined)
      
      inline def setBorderInlineEnd(value: String): Self = StObject.set(x, "borderInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndColor(value: String): Self = StObject.set(x, "borderInlineEndColor", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndColorUndefined: Self = StObject.set(x, "borderInlineEndColor", js.undefined)
      
      inline def setBorderInlineEndStyle(value: String): Self = StObject.set(x, "borderInlineEndStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndStyleUndefined: Self = StObject.set(x, "borderInlineEndStyle", js.undefined)
      
      inline def setBorderInlineEndUndefined: Self = StObject.set(x, "borderInlineEnd", js.undefined)
      
      inline def setBorderInlineEndWidth(value: String): Self = StObject.set(x, "borderInlineEndWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineEndWidthUndefined: Self = StObject.set(x, "borderInlineEndWidth", js.undefined)
      
      inline def setBorderInlineStart(value: String): Self = StObject.set(x, "borderInlineStart", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartColor(value: String): Self = StObject.set(x, "borderInlineStartColor", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartColorUndefined: Self = StObject.set(x, "borderInlineStartColor", js.undefined)
      
      inline def setBorderInlineStartStyle(value: String): Self = StObject.set(x, "borderInlineStartStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartStyleUndefined: Self = StObject.set(x, "borderInlineStartStyle", js.undefined)
      
      inline def setBorderInlineStartUndefined: Self = StObject.set(x, "borderInlineStart", js.undefined)
      
      inline def setBorderInlineStartWidth(value: String): Self = StObject.set(x, "borderInlineStartWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStartWidthUndefined: Self = StObject.set(x, "borderInlineStartWidth", js.undefined)
      
      inline def setBorderInlineStyle(value: String): Self = StObject.set(x, "borderInlineStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineStyleUndefined: Self = StObject.set(x, "borderInlineStyle", js.undefined)
      
      inline def setBorderInlineUndefined: Self = StObject.set(x, "borderInline", js.undefined)
      
      inline def setBorderInlineWidth(value: String): Self = StObject.set(x, "borderInlineWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderInlineWidthUndefined: Self = StObject.set(x, "borderInlineWidth", js.undefined)
      
      inline def setBorderLeft(value: String): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColor(value: String): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      inline def setBorderLeftStyle(value: String): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
      
      inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      inline def setBorderLeftWidth(value: String): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
      
      inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderRight(value: String): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColor(value: String): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      inline def setBorderRightStyle(value: String): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
      
      inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      inline def setBorderRightWidth(value: String): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
      
      inline def setBorderSpacing(value: String): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
      
      inline def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
      
      inline def setBorderStartEndRadius(value: String): Self = StObject.set(x, "borderStartEndRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderStartEndRadiusUndefined: Self = StObject.set(x, "borderStartEndRadius", js.undefined)
      
      inline def setBorderStartStartRadius(value: String): Self = StObject.set(x, "borderStartStartRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderStartStartRadiusUndefined: Self = StObject.set(x, "borderStartStartRadius", js.undefined)
      
      inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setBorderTop(value: String): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColor(value: String): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      inline def setBorderTopLeftRadius(value: String): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      inline def setBorderTopRightRadius(value: String): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      inline def setBorderTopStyle(value: String): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
      
      inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      inline def setBorderTopWidth(value: String): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderWidth(value: String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      inline def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      inline def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
      
      inline def setBreakAfter(value: String): Self = StObject.set(x, "breakAfter", value.asInstanceOf[js.Any])
      
      inline def setBreakAfterUndefined: Self = StObject.set(x, "breakAfter", js.undefined)
      
      inline def setBreakBefore(value: String): Self = StObject.set(x, "breakBefore", value.asInstanceOf[js.Any])
      
      inline def setBreakBeforeUndefined: Self = StObject.set(x, "breakBefore", js.undefined)
      
      inline def setBreakInside(value: String): Self = StObject.set(x, "breakInside", value.asInstanceOf[js.Any])
      
      inline def setBreakInsideUndefined: Self = StObject.set(x, "breakInside", js.undefined)
      
      inline def setCaptionSide(value: String): Self = StObject.set(x, "captionSide", value.asInstanceOf[js.Any])
      
      inline def setCaptionSideUndefined: Self = StObject.set(x, "captionSide", js.undefined)
      
      inline def setCaretColor(value: String): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
      
      inline def setCaretColorUndefined: Self = StObject.set(x, "caretColor", js.undefined)
      
      inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setClip(value: String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipRule(value: String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolation(value: String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFilters(value: String): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      inline def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      inline def setColorScheme(value: String): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnCount(value: String): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setColumnFill(value: String): Self = StObject.set(x, "columnFill", value.asInstanceOf[js.Any])
      
      inline def setColumnFillUndefined: Self = StObject.set(x, "columnFill", js.undefined)
      
      inline def setColumnGap(value: String): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setColumnRule(value: String): Self = StObject.set(x, "columnRule", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleColor(value: String): Self = StObject.set(x, "columnRuleColor", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleColorUndefined: Self = StObject.set(x, "columnRuleColor", js.undefined)
      
      inline def setColumnRuleStyle(value: String): Self = StObject.set(x, "columnRuleStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleStyleUndefined: Self = StObject.set(x, "columnRuleStyle", js.undefined)
      
      inline def setColumnRuleUndefined: Self = StObject.set(x, "columnRule", js.undefined)
      
      inline def setColumnRuleWidth(value: String): Self = StObject.set(x, "columnRuleWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleWidthUndefined: Self = StObject.set(x, "columnRuleWidth", js.undefined)
      
      inline def setColumnSpan(value: String): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      inline def setColumnWidth(value: String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setContain(value: String): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCounterIncrement(value: String): Self = StObject.set(x, "counterIncrement", value.asInstanceOf[js.Any])
      
      inline def setCounterIncrementUndefined: Self = StObject.set(x, "counterIncrement", js.undefined)
      
      inline def setCounterReset(value: String): Self = StObject.set(x, "counterReset", value.asInstanceOf[js.Any])
      
      inline def setCounterResetUndefined: Self = StObject.set(x, "counterReset", js.undefined)
      
      inline def setCounterSet(value: String): Self = StObject.set(x, "counterSet", value.asInstanceOf[js.Any])
      
      inline def setCounterSetUndefined: Self = StObject.set(x, "counterSet", js.undefined)
      
      inline def setCssFloat(value: String): Self = StObject.set(x, "cssFloat", value.asInstanceOf[js.Any])
      
      inline def setCssFloatUndefined: Self = StObject.set(x, "cssFloat", js.undefined)
      
      inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
      
      inline def setCssTextUndefined: Self = StObject.set(x, "cssText", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDominantBaseline(value: String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      inline def setEmptyCells(value: String): Self = StObject.set(x, "emptyCells", value.asInstanceOf[js.Any])
      
      inline def setEmptyCellsUndefined: Self = StObject.set(x, "emptyCells", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexBasis(value: String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexFlow(value: String): Self = StObject.set(x, "flexFlow", value.asInstanceOf[js.Any])
      
      inline def setFlexFlowUndefined: Self = StObject.set(x, "flexFlow", js.undefined)
      
      inline def setFlexGrow(value: String): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexShrink(value: String): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexWrap(value: String): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setFloat(value: String): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setFloodColor(value: String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      inline def setFloodOpacity(value: String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      inline def setFontKerning(value: String): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
      
      inline def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
      
      inline def setFontOpticalSizing(value: String): Self = StObject.set(x, "fontOpticalSizing", value.asInstanceOf[js.Any])
      
      inline def setFontOpticalSizingUndefined: Self = StObject.set(x, "fontOpticalSizing", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjust(value: String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontSynthesis(value: String): Self = StObject.set(x, "fontSynthesis", value.asInstanceOf[js.Any])
      
      inline def setFontSynthesisUndefined: Self = StObject.set(x, "fontSynthesis", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantAlternates(value: String): Self = StObject.set(x, "fontVariantAlternates", value.asInstanceOf[js.Any])
      
      inline def setFontVariantAlternatesUndefined: Self = StObject.set(x, "fontVariantAlternates", js.undefined)
      
      inline def setFontVariantCaps(value: String): Self = StObject.set(x, "fontVariantCaps", value.asInstanceOf[js.Any])
      
      inline def setFontVariantCapsUndefined: Self = StObject.set(x, "fontVariantCaps", js.undefined)
      
      inline def setFontVariantEastAsian(value: String): Self = StObject.set(x, "fontVariantEastAsian", value.asInstanceOf[js.Any])
      
      inline def setFontVariantEastAsianUndefined: Self = StObject.set(x, "fontVariantEastAsian", js.undefined)
      
      inline def setFontVariantLigatures(value: String): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
      
      inline def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
      
      inline def setFontVariantNumeric(value: String): Self = StObject.set(x, "fontVariantNumeric", value.asInstanceOf[js.Any])
      
      inline def setFontVariantNumericUndefined: Self = StObject.set(x, "fontVariantNumeric", js.undefined)
      
      inline def setFontVariantPosition(value: String): Self = StObject.set(x, "fontVariantPosition", value.asInstanceOf[js.Any])
      
      inline def setFontVariantPositionUndefined: Self = StObject.set(x, "fontVariantPosition", js.undefined)
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontVariationSettings(value: String): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
      
      inline def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setGap(value: String): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGetPropertyPriority(value: /* property */ String => String): Self = StObject.set(x, "getPropertyPriority", js.Any.fromFunction1(value))
      
      inline def setGetPropertyPriorityUndefined: Self = StObject.set(x, "getPropertyPriority", js.undefined)
      
      inline def setGetPropertyValue(value: /* property */ String => String): Self = StObject.set(x, "getPropertyValue", js.Any.fromFunction1(value))
      
      inline def setGetPropertyValueUndefined: Self = StObject.set(x, "getPropertyValue", js.undefined)
      
      inline def setGrid(value: String): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridArea(value: String): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGridAutoColumns(value: String): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      inline def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      inline def setGridAutoFlow(value: String): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      inline def setGridAutoRows(value: String): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      inline def setGridColumn(value: String): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEnd(value: String): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
      
      inline def setGridColumnGap(value: String): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      inline def setGridColumnStart(value: String): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
      
      inline def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
      
      inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      inline def setGridGap(value: String): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      inline def setGridRow(value: String): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      inline def setGridRowEnd(value: String): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
      
      inline def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
      
      inline def setGridRowGap(value: String): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      inline def setGridRowStart(value: String): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
      
      inline def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
      
      inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      inline def setGridTemplate(value: String): Self = StObject.set(x, "gridTemplate", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreas(value: String): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      inline def setGridTemplateColumns(value: String): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      inline def setGridTemplateRows(value: String): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      inline def setGridTemplateUndefined: Self = StObject.set(x, "gridTemplate", js.undefined)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHyphens(value: String): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
      
      inline def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
      
      inline def setImageOrientation(value: String): Self = StObject.set(x, "imageOrientation", value.asInstanceOf[js.Any])
      
      inline def setImageOrientationUndefined: Self = StObject.set(x, "imageOrientation", js.undefined)
      
      inline def setImageRendering(value: String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      inline def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      inline def setInlineSize(value: String): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
      
      inline def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
      
      inline def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetBlock(value: String): Self = StObject.set(x, "insetBlock", value.asInstanceOf[js.Any])
      
      inline def setInsetBlockEnd(value: String): Self = StObject.set(x, "insetBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setInsetBlockEndUndefined: Self = StObject.set(x, "insetBlockEnd", js.undefined)
      
      inline def setInsetBlockStart(value: String): Self = StObject.set(x, "insetBlockStart", value.asInstanceOf[js.Any])
      
      inline def setInsetBlockStartUndefined: Self = StObject.set(x, "insetBlockStart", js.undefined)
      
      inline def setInsetBlockUndefined: Self = StObject.set(x, "insetBlock", js.undefined)
      
      inline def setInsetInline(value: String): Self = StObject.set(x, "insetInline", value.asInstanceOf[js.Any])
      
      inline def setInsetInlineEnd(value: String): Self = StObject.set(x, "insetInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setInsetInlineEndUndefined: Self = StObject.set(x, "insetInlineEnd", js.undefined)
      
      inline def setInsetInlineStart(value: String): Self = StObject.set(x, "insetInlineStart", value.asInstanceOf[js.Any])
      
      inline def setInsetInlineStartUndefined: Self = StObject.set(x, "insetInlineStart", js.undefined)
      
      inline def setInsetInlineUndefined: Self = StObject.set(x, "insetInline", js.undefined)
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      inline def setIsolation(value: String): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
      
      inline def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
      
      inline def setItem(value: /* index */ Double => String): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setJustifyItems(value: String): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      inline def setJustifySelf(value: String): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLightingColor(value: String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      inline def setLineBreak(value: String): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setListStyle(value: String): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleImage(value: String): Self = StObject.set(x, "listStyleImage", value.asInstanceOf[js.Any])
      
      inline def setListStyleImageUndefined: Self = StObject.set(x, "listStyleImage", js.undefined)
      
      inline def setListStylePosition(value: String): Self = StObject.set(x, "listStylePosition", value.asInstanceOf[js.Any])
      
      inline def setListStylePositionUndefined: Self = StObject.set(x, "listStylePosition", js.undefined)
      
      inline def setListStyleType(value: String): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
      
      inline def setListStyleTypeUndefined: Self = StObject.set(x, "listStyleType", js.undefined)
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBlock(value: String): Self = StObject.set(x, "marginBlock", value.asInstanceOf[js.Any])
      
      inline def setMarginBlockEnd(value: String): Self = StObject.set(x, "marginBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setMarginBlockEndUndefined: Self = StObject.set(x, "marginBlockEnd", js.undefined)
      
      inline def setMarginBlockStart(value: String): Self = StObject.set(x, "marginBlockStart", value.asInstanceOf[js.Any])
      
      inline def setMarginBlockStartUndefined: Self = StObject.set(x, "marginBlockStart", js.undefined)
      
      inline def setMarginBlockUndefined: Self = StObject.set(x, "marginBlock", js.undefined)
      
      inline def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginInline(value: String): Self = StObject.set(x, "marginInline", value.asInstanceOf[js.Any])
      
      inline def setMarginInlineEnd(value: String): Self = StObject.set(x, "marginInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setMarginInlineEndUndefined: Self = StObject.set(x, "marginInlineEnd", js.undefined)
      
      inline def setMarginInlineStart(value: String): Self = StObject.set(x, "marginInlineStart", value.asInstanceOf[js.Any])
      
      inline def setMarginInlineStartUndefined: Self = StObject.set(x, "marginInlineStart", js.undefined)
      
      inline def setMarginInlineUndefined: Self = StObject.set(x, "marginInline", js.undefined)
      
      inline def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskClip(value: String): Self = StObject.set(x, "maskClip", value.asInstanceOf[js.Any])
      
      inline def setMaskClipUndefined: Self = StObject.set(x, "maskClip", js.undefined)
      
      inline def setMaskComposite(value: String): Self = StObject.set(x, "maskComposite", value.asInstanceOf[js.Any])
      
      inline def setMaskCompositeUndefined: Self = StObject.set(x, "maskComposite", js.undefined)
      
      inline def setMaskImage(value: String): Self = StObject.set(x, "maskImage", value.asInstanceOf[js.Any])
      
      inline def setMaskImageUndefined: Self = StObject.set(x, "maskImage", js.undefined)
      
      inline def setMaskMode(value: String): Self = StObject.set(x, "maskMode", value.asInstanceOf[js.Any])
      
      inline def setMaskModeUndefined: Self = StObject.set(x, "maskMode", js.undefined)
      
      inline def setMaskOrigin(value: String): Self = StObject.set(x, "maskOrigin", value.asInstanceOf[js.Any])
      
      inline def setMaskOriginUndefined: Self = StObject.set(x, "maskOrigin", js.undefined)
      
      inline def setMaskPosition(value: String): Self = StObject.set(x, "maskPosition", value.asInstanceOf[js.Any])
      
      inline def setMaskPositionUndefined: Self = StObject.set(x, "maskPosition", js.undefined)
      
      inline def setMaskRepeat(value: String): Self = StObject.set(x, "maskRepeat", value.asInstanceOf[js.Any])
      
      inline def setMaskRepeatUndefined: Self = StObject.set(x, "maskRepeat", js.undefined)
      
      inline def setMaskSize(value: String): Self = StObject.set(x, "maskSize", value.asInstanceOf[js.Any])
      
      inline def setMaskSizeUndefined: Self = StObject.set(x, "maskSize", js.undefined)
      
      inline def setMaskType(value: String): Self = StObject.set(x, "maskType", value.asInstanceOf[js.Any])
      
      inline def setMaskTypeUndefined: Self = StObject.set(x, "maskType", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaxBlockSize(value: String): Self = StObject.set(x, "maxBlockSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBlockSizeUndefined: Self = StObject.set(x, "maxBlockSize", js.undefined)
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxInlineSize(value: String): Self = StObject.set(x, "maxInlineSize", value.asInstanceOf[js.Any])
      
      inline def setMaxInlineSizeUndefined: Self = StObject.set(x, "maxInlineSize", js.undefined)
      
      inline def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinBlockSize(value: String): Self = StObject.set(x, "minBlockSize", value.asInstanceOf[js.Any])
      
      inline def setMinBlockSizeUndefined: Self = StObject.set(x, "minBlockSize", js.undefined)
      
      inline def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinInlineSize(value: String): Self = StObject.set(x, "minInlineSize", value.asInstanceOf[js.Any])
      
      inline def setMinInlineSizeUndefined: Self = StObject.set(x, "minInlineSize", js.undefined)
      
      inline def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMixBlendMode(value: String): Self = StObject.set(x, "mixBlendMode", value.asInstanceOf[js.Any])
      
      inline def setMixBlendModeUndefined: Self = StObject.set(x, "mixBlendMode", js.undefined)
      
      inline def setObjectFit(value: String): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
      
      inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
      
      inline def setObjectPosition(value: String): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
      
      inline def setObjectPositionUndefined: Self = StObject.set(x, "objectPosition", js.undefined)
      
      inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetDistance(value: String): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
      
      inline def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
      
      inline def setOffsetPath(value: String): Self = StObject.set(x, "offsetPath", value.asInstanceOf[js.Any])
      
      inline def setOffsetPathUndefined: Self = StObject.set(x, "offsetPath", js.undefined)
      
      inline def setOffsetRotate(value: String): Self = StObject.set(x, "offsetRotate", value.asInstanceOf[js.Any])
      
      inline def setOffsetRotateUndefined: Self = StObject.set(x, "offsetRotate", js.undefined)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrphans(value: String): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
      
      inline def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
      
      inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineOffset(value: String): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
      
      inline def setOutlineOffsetUndefined: Self = StObject.set(x, "outlineOffset", js.undefined)
      
      inline def setOutlineStyle(value: String): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
      
      inline def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutlineWidth(value: String): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowAnchor(value: String): Self = StObject.set(x, "overflowAnchor", value.asInstanceOf[js.Any])
      
      inline def setOverflowAnchorUndefined: Self = StObject.set(x, "overflowAnchor", js.undefined)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowWrap(value: String): Self = StObject.set(x, "overflowWrap", value.asInstanceOf[js.Any])
      
      inline def setOverflowWrapUndefined: Self = StObject.set(x, "overflowWrap", js.undefined)
      
      inline def setOverflowX(value: String): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setOverscrollBehavior(value: String): Self = StObject.set(x, "overscrollBehavior", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorBlock(value: String): Self = StObject.set(x, "overscrollBehaviorBlock", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorBlockUndefined: Self = StObject.set(x, "overscrollBehaviorBlock", js.undefined)
      
      inline def setOverscrollBehaviorInline(value: String): Self = StObject.set(x, "overscrollBehaviorInline", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorInlineUndefined: Self = StObject.set(x, "overscrollBehaviorInline", js.undefined)
      
      inline def setOverscrollBehaviorUndefined: Self = StObject.set(x, "overscrollBehavior", js.undefined)
      
      inline def setOverscrollBehaviorX(value: String): Self = StObject.set(x, "overscrollBehaviorX", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorXUndefined: Self = StObject.set(x, "overscrollBehaviorX", js.undefined)
      
      inline def setOverscrollBehaviorY(value: String): Self = StObject.set(x, "overscrollBehaviorY", value.asInstanceOf[js.Any])
      
      inline def setOverscrollBehaviorYUndefined: Self = StObject.set(x, "overscrollBehaviorY", js.undefined)
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlock(value: String): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEnd(value: String): Self = StObject.set(x, "paddingBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockEndUndefined: Self = StObject.set(x, "paddingBlockEnd", js.undefined)
      
      inline def setPaddingBlockStart(value: String): Self = StObject.set(x, "paddingBlockStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockStartUndefined: Self = StObject.set(x, "paddingBlockStart", js.undefined)
      
      inline def setPaddingBlockUndefined: Self = StObject.set(x, "paddingBlock", js.undefined)
      
      inline def setPaddingBottom(value: String): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingInline(value: String): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEnd(value: String): Self = StObject.set(x, "paddingInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineEndUndefined: Self = StObject.set(x, "paddingInlineEnd", js.undefined)
      
      inline def setPaddingInlineStart(value: String): Self = StObject.set(x, "paddingInlineStart", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlineStartUndefined: Self = StObject.set(x, "paddingInlineStart", js.undefined)
      
      inline def setPaddingInlineUndefined: Self = StObject.set(x, "paddingInline", js.undefined)
      
      inline def setPaddingLeft(value: String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(value: String): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPageBreakAfter(value: String): Self = StObject.set(x, "pageBreakAfter", value.asInstanceOf[js.Any])
      
      inline def setPageBreakAfterUndefined: Self = StObject.set(x, "pageBreakAfter", js.undefined)
      
      inline def setPageBreakBefore(value: String): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
      
      inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
      
      inline def setPageBreakInside(value: String): Self = StObject.set(x, "pageBreakInside", value.asInstanceOf[js.Any])
      
      inline def setPageBreakInsideUndefined: Self = StObject.set(x, "pageBreakInside", js.undefined)
      
      inline def setPaintOrder(value: String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      inline def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      inline def setParentRule(value: CSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
      
      inline def setParentRuleNull: Self = StObject.set(x, "parentRule", null)
      
      inline def setParentRuleUndefined: Self = StObject.set(x, "parentRule", js.undefined)
      
      inline def setPerspective(value: String): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveOrigin(value: String): Self = StObject.set(x, "perspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveOriginUndefined: Self = StObject.set(x, "perspectiveOrigin", js.undefined)
      
      inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      inline def setPlaceContent(value: String): Self = StObject.set(x, "placeContent", value.asInstanceOf[js.Any])
      
      inline def setPlaceContentUndefined: Self = StObject.set(x, "placeContent", js.undefined)
      
      inline def setPlaceItems(value: String): Self = StObject.set(x, "placeItems", value.asInstanceOf[js.Any])
      
      inline def setPlaceItemsUndefined: Self = StObject.set(x, "placeItems", js.undefined)
      
      inline def setPlaceSelf(value: String): Self = StObject.set(x, "placeSelf", value.asInstanceOf[js.Any])
      
      inline def setPlaceSelfUndefined: Self = StObject.set(x, "placeSelf", js.undefined)
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPrintColorAdjust(value: String): Self = StObject.set(x, "printColorAdjust", value.asInstanceOf[js.Any])
      
      inline def setPrintColorAdjustUndefined: Self = StObject.set(x, "printColorAdjust", js.undefined)
      
      inline def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setRemoveProperty(value: /* property */ String => String): Self = StObject.set(x, "removeProperty", js.Any.fromFunction1(value))
      
      inline def setRemovePropertyUndefined: Self = StObject.set(x, "removeProperty", js.undefined)
      
      inline def setResize(value: String): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRowGap(value: String): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
      
      inline def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
      
      inline def setRubyPosition(value: String): Self = StObject.set(x, "rubyPosition", value.asInstanceOf[js.Any])
      
      inline def setRubyPositionUndefined: Self = StObject.set(x, "rubyPosition", js.undefined)
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScrollBehavior(value: String): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
      
      inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
      
      inline def setScrollMargin(value: String): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlock(value: String): Self = StObject.set(x, "scrollMarginBlock", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlockEnd(value: String): Self = StObject.set(x, "scrollMarginBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlockEndUndefined: Self = StObject.set(x, "scrollMarginBlockEnd", js.undefined)
      
      inline def setScrollMarginBlockStart(value: String): Self = StObject.set(x, "scrollMarginBlockStart", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBlockStartUndefined: Self = StObject.set(x, "scrollMarginBlockStart", js.undefined)
      
      inline def setScrollMarginBlockUndefined: Self = StObject.set(x, "scrollMarginBlock", js.undefined)
      
      inline def setScrollMarginBottom(value: String): Self = StObject.set(x, "scrollMarginBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginBottomUndefined: Self = StObject.set(x, "scrollMarginBottom", js.undefined)
      
      inline def setScrollMarginInline(value: String): Self = StObject.set(x, "scrollMarginInline", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginInlineEnd(value: String): Self = StObject.set(x, "scrollMarginInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginInlineEndUndefined: Self = StObject.set(x, "scrollMarginInlineEnd", js.undefined)
      
      inline def setScrollMarginInlineStart(value: String): Self = StObject.set(x, "scrollMarginInlineStart", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginInlineStartUndefined: Self = StObject.set(x, "scrollMarginInlineStart", js.undefined)
      
      inline def setScrollMarginInlineUndefined: Self = StObject.set(x, "scrollMarginInline", js.undefined)
      
      inline def setScrollMarginLeft(value: String): Self = StObject.set(x, "scrollMarginLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginLeftUndefined: Self = StObject.set(x, "scrollMarginLeft", js.undefined)
      
      inline def setScrollMarginRight(value: String): Self = StObject.set(x, "scrollMarginRight", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginRightUndefined: Self = StObject.set(x, "scrollMarginRight", js.undefined)
      
      inline def setScrollMarginTop(value: String): Self = StObject.set(x, "scrollMarginTop", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginTopUndefined: Self = StObject.set(x, "scrollMarginTop", js.undefined)
      
      inline def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      inline def setScrollPadding(value: String): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlock(value: String): Self = StObject.set(x, "scrollPaddingBlock", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlockEnd(value: String): Self = StObject.set(x, "scrollPaddingBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlockEndUndefined: Self = StObject.set(x, "scrollPaddingBlockEnd", js.undefined)
      
      inline def setScrollPaddingBlockStart(value: String): Self = StObject.set(x, "scrollPaddingBlockStart", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBlockStartUndefined: Self = StObject.set(x, "scrollPaddingBlockStart", js.undefined)
      
      inline def setScrollPaddingBlockUndefined: Self = StObject.set(x, "scrollPaddingBlock", js.undefined)
      
      inline def setScrollPaddingBottom(value: String): Self = StObject.set(x, "scrollPaddingBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingBottomUndefined: Self = StObject.set(x, "scrollPaddingBottom", js.undefined)
      
      inline def setScrollPaddingInline(value: String): Self = StObject.set(x, "scrollPaddingInline", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingInlineEnd(value: String): Self = StObject.set(x, "scrollPaddingInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingInlineEndUndefined: Self = StObject.set(x, "scrollPaddingInlineEnd", js.undefined)
      
      inline def setScrollPaddingInlineStart(value: String): Self = StObject.set(x, "scrollPaddingInlineStart", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingInlineStartUndefined: Self = StObject.set(x, "scrollPaddingInlineStart", js.undefined)
      
      inline def setScrollPaddingInlineUndefined: Self = StObject.set(x, "scrollPaddingInline", js.undefined)
      
      inline def setScrollPaddingLeft(value: String): Self = StObject.set(x, "scrollPaddingLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingLeftUndefined: Self = StObject.set(x, "scrollPaddingLeft", js.undefined)
      
      inline def setScrollPaddingRight(value: String): Self = StObject.set(x, "scrollPaddingRight", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingRightUndefined: Self = StObject.set(x, "scrollPaddingRight", js.undefined)
      
      inline def setScrollPaddingTop(value: String): Self = StObject.set(x, "scrollPaddingTop", value.asInstanceOf[js.Any])
      
      inline def setScrollPaddingTopUndefined: Self = StObject.set(x, "scrollPaddingTop", js.undefined)
      
      inline def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
      
      inline def setScrollSnapAlign(value: String): Self = StObject.set(x, "scrollSnapAlign", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapAlignUndefined: Self = StObject.set(x, "scrollSnapAlign", js.undefined)
      
      inline def setScrollSnapStop(value: String): Self = StObject.set(x, "scrollSnapStop", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapStopUndefined: Self = StObject.set(x, "scrollSnapStop", js.undefined)
      
      inline def setScrollSnapType(value: String): Self = StObject.set(x, "scrollSnapType", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapTypeUndefined: Self = StObject.set(x, "scrollSnapType", js.undefined)
      
      inline def setScrollbarGutter(value: String): Self = StObject.set(x, "scrollbarGutter", value.asInstanceOf[js.Any])
      
      inline def setScrollbarGutterUndefined: Self = StObject.set(x, "scrollbarGutter", js.undefined)
      
      inline def setSetProperty(value: /* property */ String => Unit): Self = StObject.set(x, "setProperty", js.Any.fromFunction1(value))
      
      inline def setSetPropertyUndefined: Self = StObject.set(x, "setProperty", js.undefined)
      
      inline def setShapeImageThreshold(value: String): Self = StObject.set(x, "shapeImageThreshold", value.asInstanceOf[js.Any])
      
      inline def setShapeImageThresholdUndefined: Self = StObject.set(x, "shapeImageThreshold", js.undefined)
      
      inline def setShapeMargin(value: String): Self = StObject.set(x, "shapeMargin", value.asInstanceOf[js.Any])
      
      inline def setShapeMarginUndefined: Self = StObject.set(x, "shapeMargin", js.undefined)
      
      inline def setShapeOutside(value: String): Self = StObject.set(x, "shapeOutside", value.asInstanceOf[js.Any])
      
      inline def setShapeOutsideUndefined: Self = StObject.set(x, "shapeOutside", js.undefined)
      
      inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      inline def setStopOpacity(value: String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(value: String): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDashoffset(value: String): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeLinecap(value: String): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinejoin(value: String): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeMiterlimit(value: String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      inline def setStrokeOpacity(value: String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTabSize(value: String): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setTableLayout(value: String): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      inline def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignLast(value: String): Self = StObject.set(x, "textAlignLast", value.asInstanceOf[js.Any])
      
      inline def setTextAlignLastUndefined: Self = StObject.set(x, "textAlignLast", js.undefined)
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextCombineUpright(value: String): Self = StObject.set(x, "textCombineUpright", value.asInstanceOf[js.Any])
      
      inline def setTextCombineUprightUndefined: Self = StObject.set(x, "textCombineUpright", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationColor(value: String): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationColorUndefined: Self = StObject.set(x, "textDecorationColor", js.undefined)
      
      inline def setTextDecorationLine(value: String): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
      
      inline def setTextDecorationSkipInk(value: String): Self = StObject.set(x, "textDecorationSkipInk", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationSkipInkUndefined: Self = StObject.set(x, "textDecorationSkipInk", js.undefined)
      
      inline def setTextDecorationStyle(value: String): Self = StObject.set(x, "textDecorationStyle", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationStyleUndefined: Self = StObject.set(x, "textDecorationStyle", js.undefined)
      
      inline def setTextDecorationThickness(value: String): Self = StObject.set(x, "textDecorationThickness", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationThicknessUndefined: Self = StObject.set(x, "textDecorationThickness", js.undefined)
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextEmphasis(value: String): Self = StObject.set(x, "textEmphasis", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisColor(value: String): Self = StObject.set(x, "textEmphasisColor", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisColorUndefined: Self = StObject.set(x, "textEmphasisColor", js.undefined)
      
      inline def setTextEmphasisPosition(value: String): Self = StObject.set(x, "textEmphasisPosition", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisPositionUndefined: Self = StObject.set(x, "textEmphasisPosition", js.undefined)
      
      inline def setTextEmphasisStyle(value: String): Self = StObject.set(x, "textEmphasisStyle", value.asInstanceOf[js.Any])
      
      inline def setTextEmphasisStyleUndefined: Self = StObject.set(x, "textEmphasisStyle", js.undefined)
      
      inline def setTextEmphasisUndefined: Self = StObject.set(x, "textEmphasis", js.undefined)
      
      inline def setTextIndent(value: String): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
      
      inline def setTextIndentUndefined: Self = StObject.set(x, "textIndent", js.undefined)
      
      inline def setTextOrientation(value: String): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
      
      inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
      
      inline def setTextOverflow(value: String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextRendering(value: String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      inline def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      inline def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      inline def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setTextUnderlineOffset(value: String): Self = StObject.set(x, "textUnderlineOffset", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlineOffsetUndefined: Self = StObject.set(x, "textUnderlineOffset", js.undefined)
      
      inline def setTextUnderlinePosition(value: String): Self = StObject.set(x, "textUnderlinePosition", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlinePositionUndefined: Self = StObject.set(x, "textUnderlinePosition", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformBox(value: String): Self = StObject.set(x, "transformBox", value.asInstanceOf[js.Any])
      
      inline def setTransformBoxUndefined: Self = StObject.set(x, "transformBox", js.undefined)
      
      inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      inline def setTransformStyle(value: String): Self = StObject.set(x, "transformStyle", value.asInstanceOf[js.Any])
      
      inline def setTransformStyleUndefined: Self = StObject.set(x, "transformStyle", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelay(value: String): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      inline def setTransitionDuration(value: String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionProperty(value: String): Self = StObject.set(x, "transitionProperty", value.asInstanceOf[js.Any])
      
      inline def setTransitionPropertyUndefined: Self = StObject.set(x, "transitionProperty", js.undefined)
      
      inline def setTransitionTimingFunction(value: String): Self = StObject.set(x, "transitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setTransitionTimingFunctionUndefined: Self = StObject.set(x, "transitionTimingFunction", js.undefined)
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTranslate(value: String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setUnicodeBidi(value: String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      inline def setUserSelect(value: String): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
      
      inline def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
      
      inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWebkitAlignContent(value: String): Self = StObject.set(x, "webkitAlignContent", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignContentUndefined: Self = StObject.set(x, "webkitAlignContent", js.undefined)
      
      inline def setWebkitAlignItems(value: String): Self = StObject.set(x, "webkitAlignItems", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignItemsUndefined: Self = StObject.set(x, "webkitAlignItems", js.undefined)
      
      inline def setWebkitAlignSelf(value: String): Self = StObject.set(x, "webkitAlignSelf", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignSelfUndefined: Self = StObject.set(x, "webkitAlignSelf", js.undefined)
      
      inline def setWebkitAnimation(value: String): Self = StObject.set(x, "webkitAnimation", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDelay(value: String): Self = StObject.set(x, "webkitAnimationDelay", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDelayUndefined: Self = StObject.set(x, "webkitAnimationDelay", js.undefined)
      
      inline def setWebkitAnimationDirection(value: String): Self = StObject.set(x, "webkitAnimationDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDirectionUndefined: Self = StObject.set(x, "webkitAnimationDirection", js.undefined)
      
      inline def setWebkitAnimationDuration(value: String): Self = StObject.set(x, "webkitAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDurationUndefined: Self = StObject.set(x, "webkitAnimationDuration", js.undefined)
      
      inline def setWebkitAnimationFillMode(value: String): Self = StObject.set(x, "webkitAnimationFillMode", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationFillModeUndefined: Self = StObject.set(x, "webkitAnimationFillMode", js.undefined)
      
      inline def setWebkitAnimationIterationCount(value: String): Self = StObject.set(x, "webkitAnimationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationIterationCountUndefined: Self = StObject.set(x, "webkitAnimationIterationCount", js.undefined)
      
      inline def setWebkitAnimationName(value: String): Self = StObject.set(x, "webkitAnimationName", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationNameUndefined: Self = StObject.set(x, "webkitAnimationName", js.undefined)
      
      inline def setWebkitAnimationPlayState(value: String): Self = StObject.set(x, "webkitAnimationPlayState", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationPlayStateUndefined: Self = StObject.set(x, "webkitAnimationPlayState", js.undefined)
      
      inline def setWebkitAnimationTimingFunction(value: String): Self = StObject.set(x, "webkitAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationTimingFunctionUndefined: Self = StObject.set(x, "webkitAnimationTimingFunction", js.undefined)
      
      inline def setWebkitAnimationUndefined: Self = StObject.set(x, "webkitAnimation", js.undefined)
      
      inline def setWebkitAppearance(value: String): Self = StObject.set(x, "webkitAppearance", value.asInstanceOf[js.Any])
      
      inline def setWebkitAppearanceUndefined: Self = StObject.set(x, "webkitAppearance", js.undefined)
      
      inline def setWebkitBackfaceVisibility(value: String): Self = StObject.set(x, "webkitBackfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackfaceVisibilityUndefined: Self = StObject.set(x, "webkitBackfaceVisibility", js.undefined)
      
      inline def setWebkitBackgroundClip(value: String): Self = StObject.set(x, "webkitBackgroundClip", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundClipUndefined: Self = StObject.set(x, "webkitBackgroundClip", js.undefined)
      
      inline def setWebkitBackgroundOrigin(value: String): Self = StObject.set(x, "webkitBackgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundOriginUndefined: Self = StObject.set(x, "webkitBackgroundOrigin", js.undefined)
      
      inline def setWebkitBackgroundSize(value: String): Self = StObject.set(x, "webkitBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundSizeUndefined: Self = StObject.set(x, "webkitBackgroundSize", js.undefined)
      
      inline def setWebkitBorderBottomLeftRadius(value: String): Self = StObject.set(x, "webkitBorderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "webkitBorderBottomLeftRadius", js.undefined)
      
      inline def setWebkitBorderBottomRightRadius(value: String): Self = StObject.set(x, "webkitBorderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBottomRightRadiusUndefined: Self = StObject.set(x, "webkitBorderBottomRightRadius", js.undefined)
      
      inline def setWebkitBorderRadius(value: String): Self = StObject.set(x, "webkitBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "webkitBorderRadius", js.undefined)
      
      inline def setWebkitBorderTopLeftRadius(value: String): Self = StObject.set(x, "webkitBorderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderTopLeftRadiusUndefined: Self = StObject.set(x, "webkitBorderTopLeftRadius", js.undefined)
      
      inline def setWebkitBorderTopRightRadius(value: String): Self = StObject.set(x, "webkitBorderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderTopRightRadiusUndefined: Self = StObject.set(x, "webkitBorderTopRightRadius", js.undefined)
      
      inline def setWebkitBoxAlign(value: String): Self = StObject.set(x, "webkitBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxAlignUndefined: Self = StObject.set(x, "webkitBoxAlign", js.undefined)
      
      inline def setWebkitBoxFlex(value: String): Self = StObject.set(x, "webkitBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxFlexUndefined: Self = StObject.set(x, "webkitBoxFlex", js.undefined)
      
      inline def setWebkitBoxOrdinalGroup(value: String): Self = StObject.set(x, "webkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrdinalGroupUndefined: Self = StObject.set(x, "webkitBoxOrdinalGroup", js.undefined)
      
      inline def setWebkitBoxOrient(value: String): Self = StObject.set(x, "webkitBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrientUndefined: Self = StObject.set(x, "webkitBoxOrient", js.undefined)
      
      inline def setWebkitBoxPack(value: String): Self = StObject.set(x, "webkitBoxPack", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxPackUndefined: Self = StObject.set(x, "webkitBoxPack", js.undefined)
      
      inline def setWebkitBoxShadow(value: String): Self = StObject.set(x, "webkitBoxShadow", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxShadowUndefined: Self = StObject.set(x, "webkitBoxShadow", js.undefined)
      
      inline def setWebkitBoxSizing(value: String): Self = StObject.set(x, "webkitBoxSizing", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxSizingUndefined: Self = StObject.set(x, "webkitBoxSizing", js.undefined)
      
      inline def setWebkitFilter(value: String): Self = StObject.set(x, "webkitFilter", value.asInstanceOf[js.Any])
      
      inline def setWebkitFilterUndefined: Self = StObject.set(x, "webkitFilter", js.undefined)
      
      inline def setWebkitFlex(value: String): Self = StObject.set(x, "webkitFlex", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexBasis(value: String): Self = StObject.set(x, "webkitFlexBasis", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexBasisUndefined: Self = StObject.set(x, "webkitFlexBasis", js.undefined)
      
      inline def setWebkitFlexDirection(value: String): Self = StObject.set(x, "webkitFlexDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexDirectionUndefined: Self = StObject.set(x, "webkitFlexDirection", js.undefined)
      
      inline def setWebkitFlexFlow(value: String): Self = StObject.set(x, "webkitFlexFlow", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexFlowUndefined: Self = StObject.set(x, "webkitFlexFlow", js.undefined)
      
      inline def setWebkitFlexGrow(value: String): Self = StObject.set(x, "webkitFlexGrow", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexGrowUndefined: Self = StObject.set(x, "webkitFlexGrow", js.undefined)
      
      inline def setWebkitFlexShrink(value: String): Self = StObject.set(x, "webkitFlexShrink", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexShrinkUndefined: Self = StObject.set(x, "webkitFlexShrink", js.undefined)
      
      inline def setWebkitFlexUndefined: Self = StObject.set(x, "webkitFlex", js.undefined)
      
      inline def setWebkitFlexWrap(value: String): Self = StObject.set(x, "webkitFlexWrap", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexWrapUndefined: Self = StObject.set(x, "webkitFlexWrap", js.undefined)
      
      inline def setWebkitJustifyContent(value: String): Self = StObject.set(x, "webkitJustifyContent", value.asInstanceOf[js.Any])
      
      inline def setWebkitJustifyContentUndefined: Self = StObject.set(x, "webkitJustifyContent", js.undefined)
      
      inline def setWebkitLineClamp(value: String): Self = StObject.set(x, "webkitLineClamp", value.asInstanceOf[js.Any])
      
      inline def setWebkitLineClampUndefined: Self = StObject.set(x, "webkitLineClamp", js.undefined)
      
      inline def setWebkitMask(value: String): Self = StObject.set(x, "webkitMask", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImage(value: String): Self = StObject.set(x, "webkitMaskBoxImage", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageOutset(value: String): Self = StObject.set(x, "webkitMaskBoxImageOutset", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageOutsetUndefined: Self = StObject.set(x, "webkitMaskBoxImageOutset", js.undefined)
      
      inline def setWebkitMaskBoxImageRepeat(value: String): Self = StObject.set(x, "webkitMaskBoxImageRepeat", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageRepeatUndefined: Self = StObject.set(x, "webkitMaskBoxImageRepeat", js.undefined)
      
      inline def setWebkitMaskBoxImageSlice(value: String): Self = StObject.set(x, "webkitMaskBoxImageSlice", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageSliceUndefined: Self = StObject.set(x, "webkitMaskBoxImageSlice", js.undefined)
      
      inline def setWebkitMaskBoxImageSource(value: String): Self = StObject.set(x, "webkitMaskBoxImageSource", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageSourceUndefined: Self = StObject.set(x, "webkitMaskBoxImageSource", js.undefined)
      
      inline def setWebkitMaskBoxImageUndefined: Self = StObject.set(x, "webkitMaskBoxImage", js.undefined)
      
      inline def setWebkitMaskBoxImageWidth(value: String): Self = StObject.set(x, "webkitMaskBoxImageWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskBoxImageWidthUndefined: Self = StObject.set(x, "webkitMaskBoxImageWidth", js.undefined)
      
      inline def setWebkitMaskClip(value: String): Self = StObject.set(x, "webkitMaskClip", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskClipUndefined: Self = StObject.set(x, "webkitMaskClip", js.undefined)
      
      inline def setWebkitMaskComposite(value: String): Self = StObject.set(x, "webkitMaskComposite", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskCompositeUndefined: Self = StObject.set(x, "webkitMaskComposite", js.undefined)
      
      inline def setWebkitMaskImage(value: String): Self = StObject.set(x, "webkitMaskImage", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskImageUndefined: Self = StObject.set(x, "webkitMaskImage", js.undefined)
      
      inline def setWebkitMaskOrigin(value: String): Self = StObject.set(x, "webkitMaskOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskOriginUndefined: Self = StObject.set(x, "webkitMaskOrigin", js.undefined)
      
      inline def setWebkitMaskPosition(value: String): Self = StObject.set(x, "webkitMaskPosition", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskPositionUndefined: Self = StObject.set(x, "webkitMaskPosition", js.undefined)
      
      inline def setWebkitMaskRepeat(value: String): Self = StObject.set(x, "webkitMaskRepeat", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskRepeatUndefined: Self = StObject.set(x, "webkitMaskRepeat", js.undefined)
      
      inline def setWebkitMaskSize(value: String): Self = StObject.set(x, "webkitMaskSize", value.asInstanceOf[js.Any])
      
      inline def setWebkitMaskSizeUndefined: Self = StObject.set(x, "webkitMaskSize", js.undefined)
      
      inline def setWebkitMaskUndefined: Self = StObject.set(x, "webkitMask", js.undefined)
      
      inline def setWebkitOrder(value: String): Self = StObject.set(x, "webkitOrder", value.asInstanceOf[js.Any])
      
      inline def setWebkitOrderUndefined: Self = StObject.set(x, "webkitOrder", js.undefined)
      
      inline def setWebkitPerspective(value: String): Self = StObject.set(x, "webkitPerspective", value.asInstanceOf[js.Any])
      
      inline def setWebkitPerspectiveOrigin(value: String): Self = StObject.set(x, "webkitPerspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitPerspectiveOriginUndefined: Self = StObject.set(x, "webkitPerspectiveOrigin", js.undefined)
      
      inline def setWebkitPerspectiveUndefined: Self = StObject.set(x, "webkitPerspective", js.undefined)
      
      inline def setWebkitTextFillColor(value: String): Self = StObject.set(x, "webkitTextFillColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextFillColorUndefined: Self = StObject.set(x, "webkitTextFillColor", js.undefined)
      
      inline def setWebkitTextSizeAdjust(value: String): Self = StObject.set(x, "webkitTextSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextSizeAdjustUndefined: Self = StObject.set(x, "webkitTextSizeAdjust", js.undefined)
      
      inline def setWebkitTextStroke(value: String): Self = StObject.set(x, "webkitTextStroke", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextStrokeColor(value: String): Self = StObject.set(x, "webkitTextStrokeColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextStrokeColorUndefined: Self = StObject.set(x, "webkitTextStrokeColor", js.undefined)
      
      inline def setWebkitTextStrokeUndefined: Self = StObject.set(x, "webkitTextStroke", js.undefined)
      
      inline def setWebkitTextStrokeWidth(value: String): Self = StObject.set(x, "webkitTextStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextStrokeWidthUndefined: Self = StObject.set(x, "webkitTextStrokeWidth", js.undefined)
      
      inline def setWebkitTransform(value: String): Self = StObject.set(x, "webkitTransform", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformOrigin(value: String): Self = StObject.set(x, "webkitTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformOriginUndefined: Self = StObject.set(x, "webkitTransformOrigin", js.undefined)
      
      inline def setWebkitTransformStyle(value: String): Self = StObject.set(x, "webkitTransformStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformStyleUndefined: Self = StObject.set(x, "webkitTransformStyle", js.undefined)
      
      inline def setWebkitTransformUndefined: Self = StObject.set(x, "webkitTransform", js.undefined)
      
      inline def setWebkitTransition(value: String): Self = StObject.set(x, "webkitTransition", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDelay(value: String): Self = StObject.set(x, "webkitTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDelayUndefined: Self = StObject.set(x, "webkitTransitionDelay", js.undefined)
      
      inline def setWebkitTransitionDuration(value: String): Self = StObject.set(x, "webkitTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDurationUndefined: Self = StObject.set(x, "webkitTransitionDuration", js.undefined)
      
      inline def setWebkitTransitionProperty(value: String): Self = StObject.set(x, "webkitTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionPropertyUndefined: Self = StObject.set(x, "webkitTransitionProperty", js.undefined)
      
      inline def setWebkitTransitionTimingFunction(value: String): Self = StObject.set(x, "webkitTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionTimingFunctionUndefined: Self = StObject.set(x, "webkitTransitionTimingFunction", js.undefined)
      
      inline def setWebkitTransitionUndefined: Self = StObject.set(x, "webkitTransition", js.undefined)
      
      inline def setWebkitUserSelect(value: String): Self = StObject.set(x, "webkitUserSelect", value.asInstanceOf[js.Any])
      
      inline def setWebkitUserSelectUndefined: Self = StObject.set(x, "webkitUserSelect", js.undefined)
      
      inline def setWhiteSpace(value: String): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
      
      inline def setWidows(value: String): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
      
      inline def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWillChange(value: String): Self = StObject.set(x, "willChange", value.asInstanceOf[js.Any])
      
      inline def setWillChangeUndefined: Self = StObject.set(x, "willChange", js.undefined)
      
      inline def setWordBreak(value: String): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
      
      inline def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
      
      inline def setWordSpacing(value: String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      inline def setWordWrap(value: String): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      inline def setWritingMode(value: String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      inline def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      inline def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait Property extends StObject {
    
    var column: typings.reactabularTable.mod.Column
    
    var columnIndex: Double
    
    var property: String
  }
  object Property {
    
    inline def apply(column: typings.reactabularTable.mod.Column, columnIndex: Double, property: String): Property = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[Property]
    }
    
    extension [Self <: Property](x: Self) {
      
      inline def setColumn(value: typings.reactabularTable.mod.Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait Row extends StObject {
    
    var cell: js.UndefOr[String | (js.Function1[/* props */ Any, Element | ReactInstance])] = js.undefined
    
    var row: js.UndefOr[
        String | (js.Function2[/* props */ Any, /* rowData */ Any, Element]) | (js.Function1[/* props */ Any, ReactInstance])
      ] = js.undefined
    
    var wrapper: js.UndefOr[String | (js.Function1[/* props */ Any, Element | ReactInstance])] = js.undefined
  }
  object Row {
    
    inline def apply(): Row = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Row]
    }
    
    extension [Self <: Row](x: Self) {
      
      inline def setCell(value: String | (js.Function1[/* props */ Any, Element | ReactInstance])): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellFunction1(value: /* props */ Any => Element | ReactInstance): Self = StObject.set(x, "cell", js.Any.fromFunction1(value))
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setRow(
        value: String | (js.Function2[/* props */ Any, /* rowData */ Any, Element]) | (js.Function1[/* props */ Any, ReactInstance])
      ): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowFunction1(value: /* props */ Any => ReactInstance): Self = StObject.set(x, "row", js.Any.fromFunction1(value))
      
      inline def setRowFunction2(value: (/* props */ Any, /* rowData */ Any) => Element): Self = StObject.set(x, "row", js.Any.fromFunction2(value))
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setWrapper(value: String | (js.Function1[/* props */ Any, Element | ReactInstance])): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperFunction1(value: /* props */ Any => Element | ReactInstance): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait RowData extends StObject {
    
    var column: typings.reactabularTable.mod.Column
    
    var columnIndex: Double
    
    var rowData: Any
  }
  object RowData {
    
    inline def apply(column: typings.reactabularTable.mod.Column, columnIndex: Double, rowData: Any): RowData = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowData]
    }
    
    extension [Self <: RowData](x: Self) {
      
      inline def setColumn(value: typings.reactabularTable.mod.Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowIndex extends StObject {
    
    var rowIndex: Double
  }
  object RowIndex {
    
    inline def apply(rowIndex: Double): RowIndex = {
      val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowIndex]
    }
    
    extension [Self <: RowIndex](x: Self) {
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
}
