package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColumnSizerMod {
  
  @JSImport("react-virtualized/dist/es/ColumnSizer", "ColumnSizer")
  @js.native
  class ColumnSizer protected ()
    extends PureComponent[ColumnSizerProps, js.Object, js.Any] {
    def this(props: ColumnSizerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnSizerProps, context: js.Any) = this()
  }
  /* static members */
  object ColumnSizer {
    
    @JSImport("react-virtualized/dist/es/ColumnSizer", "ColumnSizer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/ColumnSizer", "ColumnSizer.propTypes")
    @js.native
    def propTypes: Children = js.native
    @scala.inline
    def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ColumnSizerProps
    extends /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * Function responsible for rendering a virtualized Grid.
      * This function should implement the following signature:
      * ({ adjustedWidth, getColumnWidth, registerChild }) => PropTypes.element
      *
      * The specified :getColumnWidth function should be passed to the Grid's :columnWidth property.
      * The :registerChild should be passed to the Grid's :ref property.
      * The :adjustedWidth property is optional; it reflects the lesser of the overall width or the width of all columns.
      */
    def children(props: SizedColumnProps): ReactNode = js.native
    
    /** Number of columns in Grid or Table child */
    var columnCount: js.UndefOr[Double] = js.native
    
    /** Optional maximum allowed column width */
    var columnMaxWidth: js.UndefOr[Double] = js.native
    
    /** Optional minimum allowed column width */
    var columnMinWidth: js.UndefOr[Double] = js.native
    
    /** Width of Grid or Table child */
    var width: Double = js.native
  }
  object ColumnSizerProps {
    
    @scala.inline
    def apply(children: SizedColumnProps => ReactNode, width: Double): ColumnSizerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnSizerProps]
    }
    
    @scala.inline
    implicit class ColumnSizerPropsMutableBuilder[Self <: ColumnSizerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: SizedColumnProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      @scala.inline
      def setColumnMaxWidth(value: Double): Self = StObject.set(x, "columnMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnMaxWidthUndefined: Self = StObject.set(x, "columnMaxWidth", js.undefined)
      
      @scala.inline
      def setColumnMinWidth(value: Double): Self = StObject.set(x, "columnMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnMinWidthUndefined: Self = StObject.set(x, "columnMinWidth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SizedColumnProps extends StObject {
    
    var adjustedWidth: Double = js.native
    
    var columnWidth: Double = js.native
    
    def getColumnWidth(): Double = js.native
    
    var registerChild: js.Any = js.native
  }
  object SizedColumnProps {
    
    @scala.inline
    def apply(adjustedWidth: Double, columnWidth: Double, getColumnWidth: () => Double, registerChild: js.Any): SizedColumnProps = {
      val __obj = js.Dynamic.literal(adjustedWidth = adjustedWidth.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], getColumnWidth = js.Any.fromFunction0(getColumnWidth), registerChild = registerChild.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizedColumnProps]
    }
    
    @scala.inline
    implicit class SizedColumnPropsMutableBuilder[Self <: SizedColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustedWidth(value: Double): Self = StObject.set(x, "adjustedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetColumnWidth(value: () => Double): Self = StObject.set(x, "getColumnWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterChild(value: js.Any): Self = StObject.set(x, "registerChild", value.asInstanceOf[js.Any])
    }
  }
}
