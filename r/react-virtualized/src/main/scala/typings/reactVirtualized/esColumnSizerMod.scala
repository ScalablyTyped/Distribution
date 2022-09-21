package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColumnSizerMod {
  
  @JSImport("react-virtualized/dist/es/ColumnSizer", JSImport.Default)
  @js.native
  open class default protected () extends ColumnSizer {
    def this(props: ColumnSizerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnSizerProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-virtualized/dist/es/ColumnSizer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/ColumnSizer", "default.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-virtualized/dist/es/ColumnSizer", "ColumnSizer")
  @js.native
  open class ColumnSizer protected ()
    extends PureComponent[ColumnSizerProps, js.Object, Any] {
    def this(props: ColumnSizerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnSizerProps, context: Any) = this()
  }
  /* static members */
  object ColumnSizer {
    
    @JSImport("react-virtualized/dist/es/ColumnSizer", "ColumnSizer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/ColumnSizer", "ColumnSizer.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ColumnSizerProps
    extends StObject
       with /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Function responsible for rendering a virtualized Grid.
      * This function should implement the following signature:
      * ({ adjustedWidth, getColumnWidth, registerChild }) => PropTypes.element
      *
      * The specified :getColumnWidth function should be passed to the Grid's :columnWidth property.
      * The :registerChild should be passed to the Grid's :ref property.
      * The :adjustedWidth property is optional; it reflects the lesser of the overall width or the width of all columns.
      */
    def children(props: SizedColumnProps): ReactNode
    
    /** Number of columns in Grid or Table child */
    var columnCount: js.UndefOr[Double] = js.undefined
    
    /** Optional maximum allowed column width */
    var columnMaxWidth: js.UndefOr[Double] = js.undefined
    
    /** Optional minimum allowed column width */
    var columnMinWidth: js.UndefOr[Double] = js.undefined
    
    /** Width of Grid or Table child */
    var width: Double
  }
  object ColumnSizerProps {
    
    inline def apply(children: SizedColumnProps => ReactNode, width: Double): ColumnSizerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnSizerProps]
    }
    
    extension [Self <: ColumnSizerProps](x: Self) {
      
      inline def setChildren(value: SizedColumnProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setColumnMaxWidth(value: Double): Self = StObject.set(x, "columnMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnMaxWidthUndefined: Self = StObject.set(x, "columnMaxWidth", js.undefined)
      
      inline def setColumnMinWidth(value: Double): Self = StObject.set(x, "columnMinWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnMinWidthUndefined: Self = StObject.set(x, "columnMinWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizedColumnProps extends StObject {
    
    var adjustedWidth: Double
    
    var columnWidth: Double
    
    def getColumnWidth(): Double
    
    var registerChild: Any
  }
  object SizedColumnProps {
    
    inline def apply(adjustedWidth: Double, columnWidth: Double, getColumnWidth: () => Double, registerChild: Any): SizedColumnProps = {
      val __obj = js.Dynamic.literal(adjustedWidth = adjustedWidth.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], getColumnWidth = js.Any.fromFunction0(getColumnWidth), registerChild = registerChild.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizedColumnProps]
    }
    
    extension [Self <: SizedColumnProps](x: Self) {
      
      inline def setAdjustedWidth(value: Double): Self = StObject.set(x, "adjustedWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setGetColumnWidth(value: () => Double): Self = StObject.set(x, "getColumnWidth", js.Any.fromFunction0(value))
      
      inline def setRegisterChild(value: Any): Self = StObject.set(x, "registerChild", value.asInstanceOf[js.Any])
    }
  }
}
