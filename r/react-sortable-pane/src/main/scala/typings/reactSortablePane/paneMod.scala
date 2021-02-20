package typings.reactSortablePane

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactSortablePane.anon.ClassName
import typings.reactSortablePane.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paneMod {
  
  @JSImport("react-sortable-pane/lib/pane", "Pane")
  @js.native
  class Pane protected ()
    extends Component[PaneProps, js.Object, js.Any] {
    def this(props: PaneProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaneProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPane(prevProps: PaneProps): Unit = js.native
    
    val createAllowedProps: PaneProps = js.native
  }
  /* static members */
  object Pane {
    
    @JSImport("react-sortable-pane/lib/pane", "Pane")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sortable-pane/lib/pane", "Pane.defaultProps")
    @js.native
    def defaultProps: ClassName = js.native
    @scala.inline
    def defaultProps_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IsPaneResizable extends StObject {
    
    var x: js.UndefOr[Boolean] = js.native
    
    var xy: js.UndefOr[Boolean] = js.native
    
    var y: js.UndefOr[Boolean] = js.native
  }
  object IsPaneResizable {
    
    @scala.inline
    def apply(): IsPaneResizable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsPaneResizable]
    }
    
    @scala.inline
    implicit class IsPaneResizableMutableBuilder[Self <: IsPaneResizable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXy(value: Boolean): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXyUndefined: Self = StObject.set(x, "xy", js.undefined)
      
      @scala.inline
      def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait PaneProps
    extends /* otherProps */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[String | ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var defaultSize: js.UndefOr[Height] = js.native
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var maxHeight: js.UndefOr[PaneSize] = js.native
    
    var maxWidth: js.UndefOr[PaneSize] = js.native
    
    var minHeight: js.UndefOr[PaneSize] = js.native
    
    var minWidth: js.UndefOr[PaneSize] = js.native
    
    var onSizeChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    var resizable: js.UndefOr[IsPaneResizable] = js.native
    
    var size: js.UndefOr[Height] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object PaneProps {
    
    @scala.inline
    def apply(): PaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaneProps]
    }
    
    @scala.inline
    implicit class PanePropsMutableBuilder[Self <: PaneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSize(value: Height): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      @scala.inline
      def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: PaneSize): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: PaneSize): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: PaneSize): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: PaneSize): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOnSizeChange(value: () => Unit): Self = StObject.set(x, "onSizeChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSizeChangeUndefined: Self = StObject.set(x, "onSizeChange", js.undefined)
      
      @scala.inline
      def setResizable(value: IsPaneResizable): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type PaneSize = String | Double
}
