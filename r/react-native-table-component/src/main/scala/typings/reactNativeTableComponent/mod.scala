package typings.reactNativeTableComponent

import typings.react.mod.Component
import typings.react.mod.ReactChildren
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait CellProps extends StObject {
    
    var borderStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var flex: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object CellProps {
    
    inline def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    extension [Self <: CellProps](x: Self) {
      
      inline def setBorderStyle(value: ViewStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColProps extends StObject {
    
    var data: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var heightArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ColProps {
    
    inline def apply(): ColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColProps]
    }
    
    extension [Self <: ColProps](x: Self) {
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setHeightArr(value: js.Array[Double]): Self = StObject.set(x, "heightArr", value.asInstanceOf[js.Any])
      
      inline def setHeightArrUndefined: Self = StObject.set(x, "heightArr", js.undefined)
      
      inline def setHeightArrVarargs(value: Double*): Self = StObject.set(x, "heightArr", js.Array(value :_*))
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColsProps extends StObject {
    
    var data: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var flexArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var heightArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var widthArr: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ColsProps {
    
    inline def apply(): ColsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColsProps]
    }
    
    extension [Self <: ColsProps](x: Self) {
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setFlexArr(value: js.Array[Double]): Self = StObject.set(x, "flexArr", value.asInstanceOf[js.Any])
      
      inline def setFlexArrUndefined: Self = StObject.set(x, "flexArr", js.undefined)
      
      inline def setFlexArrVarargs(value: Double*): Self = StObject.set(x, "flexArr", js.Array(value :_*))
      
      inline def setHeightArr(value: js.Array[Double]): Self = StObject.set(x, "heightArr", value.asInstanceOf[js.Any])
      
      inline def setHeightArrUndefined: Self = StObject.set(x, "heightArr", js.undefined)
      
      inline def setHeightArrVarargs(value: Double*): Self = StObject.set(x, "heightArr", js.Array(value :_*))
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidthArr(value: js.Array[Double]): Self = StObject.set(x, "widthArr", value.asInstanceOf[js.Any])
      
      inline def setWidthArrUndefined: Self = StObject.set(x, "widthArr", js.undefined)
      
      inline def setWidthArrVarargs(value: Double*): Self = StObject.set(x, "widthArr", js.Array(value :_*))
    }
  }
  
  trait RowProps extends StObject {
    
    var data: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var flexArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var widthArr: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object RowProps {
    
    inline def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    extension [Self <: RowProps](x: Self) {
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setFlexArr(value: js.Array[Double]): Self = StObject.set(x, "flexArr", value.asInstanceOf[js.Any])
      
      inline def setFlexArrUndefined: Self = StObject.set(x, "flexArr", js.undefined)
      
      inline def setFlexArrVarargs(value: Double*): Self = StObject.set(x, "flexArr", js.Array(value :_*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidthArr(value: js.Array[Double]): Self = StObject.set(x, "widthArr", value.asInstanceOf[js.Any])
      
      inline def setWidthArrUndefined: Self = StObject.set(x, "widthArr", js.undefined)
      
      inline def setWidthArrVarargs(value: Double*): Self = StObject.set(x, "widthArr", js.Array(value :_*))
    }
  }
  
  trait RowsProps extends StObject {
    
    var data: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
    
    var flexArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var heightArr: js.UndefOr[js.Array[Double]] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var widthArr: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object RowsProps {
    
    inline def apply(): RowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowsProps]
    }
    
    extension [Self <: RowsProps](x: Self) {
      
      inline def setData(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setFlexArr(value: js.Array[Double]): Self = StObject.set(x, "flexArr", value.asInstanceOf[js.Any])
      
      inline def setFlexArrUndefined: Self = StObject.set(x, "flexArr", js.undefined)
      
      inline def setFlexArrVarargs(value: Double*): Self = StObject.set(x, "flexArr", js.Array(value :_*))
      
      inline def setHeightArr(value: js.Array[Double]): Self = StObject.set(x, "heightArr", value.asInstanceOf[js.Any])
      
      inline def setHeightArrUndefined: Self = StObject.set(x, "heightArr", js.undefined)
      
      inline def setHeightArrVarargs(value: Double*): Self = StObject.set(x, "heightArr", js.Array(value :_*))
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setWidthArr(value: js.Array[Double]): Self = StObject.set(x, "widthArr", value.asInstanceOf[js.Any])
      
      inline def setWidthArrUndefined: Self = StObject.set(x, "widthArr", js.undefined)
      
      inline def setWidthArrVarargs(value: Double*): Self = StObject.set(x, "widthArr", js.Array(value :_*))
    }
  }
  
  trait TableProps extends StObject {
    
    var borderStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
  }
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
    
    extension [Self <: TableProps](x: Self) {
      
      inline def setBorderStyle(value: ViewStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TableWrapperProps extends StObject {
    
    var borderStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
  }
  object TableWrapperProps {
    
    inline def apply(): TableWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableWrapperProps]
    }
    
    extension [Self <: TableWrapperProps](x: Self) {
      
      inline def setBorderStyle(value: ViewStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
