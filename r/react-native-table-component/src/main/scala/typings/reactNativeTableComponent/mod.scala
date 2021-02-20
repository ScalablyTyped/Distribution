package typings.reactNativeTableComponent

import typings.react.mod.Component
import typings.react.mod.ReactChildren
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-table-component", "Cell")
  @js.native
  class Cell protected ()
    extends Component[CellProps, js.Object, js.Any] {
    def this(props: CellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CellProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-table-component", "Col")
  @js.native
  class Col protected ()
    extends Component[ColProps, js.Object, js.Any] {
    def this(props: ColProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-table-component", "Cols")
  @js.native
  class Cols protected ()
    extends Component[ColsProps, js.Object, js.Any] {
    def this(props: ColsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColsProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-table-component", "Row")
  @js.native
  class Row protected ()
    extends Component[RowProps, js.Object, js.Any] {
    def this(props: RowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RowProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-table-component", "Rows")
  @js.native
  class Rows protected ()
    extends Component[RowsProps, js.Object, js.Any] {
    def this(props: RowsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RowsProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-table-component", "Table")
  @js.native
  class Table protected ()
    extends Component[TableProps, js.Object, js.Any] {
    def this(props: TableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableProps, context: js.Any) = this()
    
    def _renderChildren(props: TableProps): ReactChildren = js.native
  }
  
  @JSImport("react-native-table-component", "TableWrapper")
  @js.native
  class TableWrapper protected ()
    extends Component[TableWrapperProps, js.Object, js.Any] {
    def this(props: TableWrapperProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableWrapperProps, context: js.Any) = this()
    
    def _renderChildren(props: TableWrapperProps): ReactChildren = js.native
  }
  
  @js.native
  trait CellProps extends StObject {
    
    var borderStyle: js.UndefOr[ViewStyle] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var flex: js.UndefOr[Double] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object CellProps {
    
    @scala.inline
    def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    @scala.inline
    implicit class CellPropsMutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderStyle(value: ViewStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ColProps extends StObject {
    
    var data: js.UndefOr[js.Array[_]] = js.native
    
    var heightArr: js.UndefOr[js.Array[Double]] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ColProps {
    
    @scala.inline
    def apply(): ColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColProps]
    }
    
    @scala.inline
    implicit class ColPropsMutableBuilder[Self <: ColProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeightArr(value: js.Array[Double]): Self = StObject.set(x, "heightArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightArrUndefined: Self = StObject.set(x, "heightArr", js.undefined)
      
      @scala.inline
      def setHeightArrVarargs(value: Double*): Self = StObject.set(x, "heightArr", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ColsProps extends StObject {
    
    var data: js.UndefOr[js.Array[_]] = js.native
    
    var flexArr: js.UndefOr[js.Array[Double]] = js.native
    
    var heightArr: js.UndefOr[js.Array[Double]] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
    
    var widthArr: js.UndefOr[js.Array[Double]] = js.native
  }
  object ColsProps {
    
    @scala.inline
    def apply(): ColsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColsProps]
    }
    
    @scala.inline
    implicit class ColsPropsMutableBuilder[Self <: ColsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFlexArr(value: js.Array[Double]): Self = StObject.set(x, "flexArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexArrUndefined: Self = StObject.set(x, "flexArr", js.undefined)
      
      @scala.inline
      def setFlexArrVarargs(value: Double*): Self = StObject.set(x, "flexArr", js.Array(value :_*))
      
      @scala.inline
      def setHeightArr(value: js.Array[Double]): Self = StObject.set(x, "heightArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightArrUndefined: Self = StObject.set(x, "heightArr", js.undefined)
      
      @scala.inline
      def setHeightArrVarargs(value: Double*): Self = StObject.set(x, "heightArr", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setWidthArr(value: js.Array[Double]): Self = StObject.set(x, "widthArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthArrUndefined: Self = StObject.set(x, "widthArr", js.undefined)
      
      @scala.inline
      def setWidthArrVarargs(value: Double*): Self = StObject.set(x, "widthArr", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RowProps extends StObject {
    
    var data: js.UndefOr[js.Array[_]] = js.native
    
    var flexArr: js.UndefOr[js.Array[Double]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
    
    var widthArr: js.UndefOr[js.Array[Double]] = js.native
  }
  object RowProps {
    
    @scala.inline
    def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    @scala.inline
    implicit class RowPropsMutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFlexArr(value: js.Array[Double]): Self = StObject.set(x, "flexArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexArrUndefined: Self = StObject.set(x, "flexArr", js.undefined)
      
      @scala.inline
      def setFlexArrVarargs(value: Double*): Self = StObject.set(x, "flexArr", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setWidthArr(value: js.Array[Double]): Self = StObject.set(x, "widthArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthArrUndefined: Self = StObject.set(x, "widthArr", js.undefined)
      
      @scala.inline
      def setWidthArrVarargs(value: Double*): Self = StObject.set(x, "widthArr", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RowsProps extends StObject {
    
    var data: js.UndefOr[js.Array[js.Array[_]]] = js.native
    
    var flexArr: js.UndefOr[js.Array[Double]] = js.native
    
    var heightArr: js.UndefOr[js.Array[Double]] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
    
    var textStyle: js.UndefOr[TextStyle] = js.native
    
    var widthArr: js.UndefOr[js.Array[Double]] = js.native
  }
  object RowsProps {
    
    @scala.inline
    def apply(): RowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowsProps]
    }
    
    @scala.inline
    implicit class RowsPropsMutableBuilder[Self <: RowsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[js.Array[_]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFlexArr(value: js.Array[Double]): Self = StObject.set(x, "flexArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexArrUndefined: Self = StObject.set(x, "flexArr", js.undefined)
      
      @scala.inline
      def setFlexArrVarargs(value: Double*): Self = StObject.set(x, "flexArr", js.Array(value :_*))
      
      @scala.inline
      def setHeightArr(value: js.Array[Double]): Self = StObject.set(x, "heightArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightArrUndefined: Self = StObject.set(x, "heightArr", js.undefined)
      
      @scala.inline
      def setHeightArrVarargs(value: Double*): Self = StObject.set(x, "heightArr", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setWidthArr(value: js.Array[Double]): Self = StObject.set(x, "widthArr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthArrUndefined: Self = StObject.set(x, "widthArr", js.undefined)
      
      @scala.inline
      def setWidthArrVarargs(value: Double*): Self = StObject.set(x, "widthArr", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TableProps extends StObject {
    
    var borderStyle: js.UndefOr[ViewStyle] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
  }
  object TableProps {
    
    @scala.inline
    def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderStyle(value: ViewStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait TableWrapperProps extends StObject {
    
    var borderStyle: js.UndefOr[ViewStyle] = js.native
    
    var style: js.UndefOr[ViewStyle] = js.native
  }
  object TableWrapperProps {
    
    @scala.inline
    def apply(): TableWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableWrapperProps]
    }
    
    @scala.inline
    implicit class TableWrapperPropsMutableBuilder[Self <: TableWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderStyle(value: ViewStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
