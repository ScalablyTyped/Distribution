package typings.reactabularTable

import typings.react.mod.Component
import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import typings.reactabularTable.anon.Cell
import typings.reactabularTable.anon.ColumnIndex
import typings.reactabularTable.anon.Draggable
import typings.reactabularTable.anon.Formatters
import typings.reactabularTable.anon.PartialCSSStyleDeclaratio
import typings.reactabularTable.anon.Row
import typings.reactabularTable.anon.RowData
import typings.reactabularTable.anon.RowIndex
import typings.reactabularTable.anon.RowIndexNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactabular-table", "Body")
  @js.native
  class Body protected ()
    extends Component[BodyProps, js.Object, js.Any] {
    def this(props: BodyProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BodyProps, context: js.Any) = this()
  }
  
  @JSImport("reactabular-table", "Header")
  @js.native
  class Header protected ()
    extends Component[HeaderProps, js.Object, js.Any] {
    def this(props: HeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HeaderProps, context: js.Any) = this()
  }
  
  @JSImport("reactabular-table", "Provider")
  @js.native
  class Provider protected ()
    extends Component[ProviderProps, js.Object, js.Any] {
    def this(props: ProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ProviderProps, context: js.Any) = this()
  }
  
  trait BodyProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onRow: js.UndefOr[js.Function2[/* row */ js.Any, /* props */ RowIndexNumber, js.Any]] = js.undefined
    
    var rowKey: String
    
    var rows: js.Array[js.Any]
    
    var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  }
  object BodyProps {
    
    inline def apply(rowKey: String, rows: js.Array[js.Any]): BodyProps = {
      val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyProps]
    }
    
    extension [Self <: BodyProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnRow(value: (/* row */ js.Any, /* props */ RowIndexNumber) => js.Any): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      inline def setOnRowUndefined: Self = StObject.set(x, "onRow", js.undefined)
      
      inline def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      inline def setRows(value: js.Array[js.Any]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: js.Any*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      inline def setStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CellFormatter = js.Function2[/* value */ js.Any, /* props */ RowIndex, String | Element]
  
  type CellTransform = js.Function2[/* value */ js.Any, /* props */ ColumnIndex, js.Any]
  
  trait Column extends StObject {
    
    var cell: js.UndefOr[Formatters] = js.undefined
    
    var children: js.UndefOr[js.Array[Column]] = js.undefined
    
    var header: js.UndefOr[Draggable] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
  }
  object Column {
    
    inline def apply(): Column = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setCell(value: Formatters): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setChildren(value: js.Array[Column]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Column*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setHeader(value: Draggable): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    }
  }
  
  type ColumnFormatter = js.Function2[/* label */ String | Element, /* props */ RowData, String | Element]
  
  type ColumnTransform = js.Function2[
    /* label */ String | Element | ReactInstance, 
    /* props */ typings.reactabularTable.anon.Column, 
    js.Any
  ]
  
  trait HeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var headerRows: js.UndefOr[js.Array[Column]] = js.undefined
    
    var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
    
    extension [Self <: HeaderProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHeaderRows(value: js.Array[Column]): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
      
      inline def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
      
      inline def setHeaderRowsVarargs(value: Column*): Self = StObject.set(x, "headerRows", js.Array(value :_*))
      
      inline def setStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ProviderProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var columns: js.Array[Column]
    
    var renderers: js.UndefOr[Renderers] = js.undefined
    
    var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  }
  object ProviderProps {
    
    inline def apply(columns: js.Array[Column]): ProviderProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps]
    }
    
    extension [Self <: ProviderProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setRenderers(value: Renderers): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      inline def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
      
      inline def setStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Renderers extends StObject {
    
    var body: js.UndefOr[Row] = js.undefined
    
    var header: js.UndefOr[Cell] = js.undefined
    
    var table: js.UndefOr[String | js.Function0[Element]] = js.undefined
  }
  object Renderers {
    
    inline def apply(): Renderers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Renderers]
    }
    
    extension [Self <: Renderers](x: Self) {
      
      inline def setBody(value: Row): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeader(value: Cell): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setTable(value: String | js.Function0[Element]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableFunction0(value: () => Element): Self = StObject.set(x, "table", js.Any.fromFunction0(value))
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
}
