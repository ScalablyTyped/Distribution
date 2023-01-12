package typings.reactSortablePane

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactSortablePane.anon.ClassName
import typings.reactSortablePane.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaneMod {
  
  @JSImport("react-sortable-pane/lib/pane", "Pane")
  @js.native
  open class Pane protected ()
    extends Component[PaneProps, js.Object, Any] {
    def this(props: PaneProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaneProps, context: Any) = this()
    
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
    inline def defaultProps_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IsPaneResizable extends StObject {
    
    var x: js.UndefOr[Boolean] = js.undefined
    
    var xy: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Boolean] = js.undefined
  }
  object IsPaneResizable {
    
    inline def apply(): IsPaneResizable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsPaneResizable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsPaneResizable] (val x: Self) extends AnyVal {
      
      inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXy(value: Boolean): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
      
      inline def setXyUndefined: Self = StObject.set(x, "xy", js.undefined)
      
      inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait PaneProps
    extends StObject
       with /* otherProps */ StringDictionary[Any] {
    
    var children: js.UndefOr[String | ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultSize: js.UndefOr[Height] = js.undefined
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var maxHeight: js.UndefOr[PaneSize] = js.undefined
    
    var maxWidth: js.UndefOr[PaneSize] = js.undefined
    
    var minHeight: js.UndefOr[PaneSize] = js.undefined
    
    var minWidth: js.UndefOr[PaneSize] = js.undefined
    
    var onSizeChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var resizable: js.UndefOr[IsPaneResizable] = js.undefined
    
    var size: js.UndefOr[Height] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PaneProps {
    
    inline def apply(): PaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaneProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaneProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultSize(value: Height): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      inline def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setMaxHeight(value: PaneSize): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: PaneSize): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: PaneSize): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: PaneSize): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOnSizeChange(value: () => Unit): Self = StObject.set(x, "onSizeChange", js.Any.fromFunction0(value))
      
      inline def setOnSizeChangeUndefined: Self = StObject.set(x, "onSizeChange", js.undefined)
      
      inline def setResizable(value: IsPaneResizable): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type PaneSize = String | Double
}
