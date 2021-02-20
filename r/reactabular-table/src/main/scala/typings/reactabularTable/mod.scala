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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait BodyProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var onRow: js.UndefOr[js.Function2[/* row */ js.Any, /* props */ RowIndexNumber, _]] = js.native
    
    var rowKey: String = js.native
    
    var rows: js.Array[_] = js.native
    
    var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  }
  object BodyProps {
    
    @scala.inline
    def apply(rowKey: String, rows: js.Array[_]): BodyProps = {
      val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyProps]
    }
    
    @scala.inline
    implicit class BodyPropsMutableBuilder[Self <: BodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnRow(value: (/* row */ js.Any, /* props */ RowIndexNumber) => _): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowUndefined: Self = StObject.set(x, "onRow", js.undefined)
      
      @scala.inline
      def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: js.Array[_]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: js.Any*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CellFormatter = js.Function2[/* value */ js.Any, /* props */ RowIndex, String | Element]
  
  type CellTransform = js.Function2[/* value */ js.Any, /* props */ ColumnIndex, js.Any]
  
  @js.native
  trait Column extends StObject {
    
    var cell: js.UndefOr[Formatters] = js.native
    
    var children: js.UndefOr[js.Array[Column]] = js.native
    
    var header: js.UndefOr[Draggable] = js.native
    
    var property: js.UndefOr[String] = js.native
  }
  object Column {
    
    @scala.inline
    def apply(): Column = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: Formatters): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[Column]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: Column*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setHeader(value: Draggable): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    }
  }
  
  type ColumnFormatter = js.Function2[/* label */ String | Element, /* props */ RowData, String | Element]
  
  type ColumnTransform = js.Function2[
    /* label */ String | Element | ReactInstance, 
    /* props */ typings.reactabularTable.anon.Column, 
    js.Any
  ]
  
  @js.native
  trait HeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var headerRows: js.UndefOr[js.Array[Column]] = js.native
    
    var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  }
  object HeaderProps {
    
    @scala.inline
    def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
    
    @scala.inline
    implicit class HeaderPropsMutableBuilder[Self <: HeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHeaderRows(value: js.Array[Column]): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
      
      @scala.inline
      def setHeaderRowsVarargs(value: Column*): Self = StObject.set(x, "headerRows", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait ProviderProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var columns: js.Array[Column] = js.native
    
    var renderers: js.UndefOr[Renderers] = js.native
    
    var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  }
  object ProviderProps {
    
    @scala.inline
    def apply(columns: js.Array[Column]): ProviderProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderProps]
    }
    
    @scala.inline
    implicit class ProviderPropsMutableBuilder[Self <: ProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setRenderers(value: Renderers): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
      
      @scala.inline
      def setStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Renderers extends StObject {
    
    var body: js.UndefOr[Row] = js.native
    
    var header: js.UndefOr[Cell] = js.native
    
    var table: js.UndefOr[String | js.Function0[Element]] = js.native
  }
  object Renderers {
    
    @scala.inline
    def apply(): Renderers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Renderers]
    }
    
    @scala.inline
    implicit class RenderersMutableBuilder[Self <: Renderers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Row): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeader(value: Cell): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setTable(value: String | js.Function0[Element]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableFunction0(value: () => Element): Self = StObject.set(x, "table", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
}
