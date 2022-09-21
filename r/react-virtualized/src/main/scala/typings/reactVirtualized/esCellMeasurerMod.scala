package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.Index
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCellMeasurerMod {
  
  @JSImport("react-virtualized/dist/es/CellMeasurer", JSImport.Default)
  @js.native
  open class default protected () extends CellMeasurer {
    def this(props: CellMeasurerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CellMeasurerProps, context: Any) = this()
  }
  
  @JSImport("react-virtualized/dist/es/CellMeasurer", "CellMeasurer")
  @js.native
  open class CellMeasurer protected ()
    extends PureComponent[CellMeasurerProps, js.Object, Any] {
    def this(props: CellMeasurerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CellMeasurerProps, context: Any) = this()
  }
  
  @JSImport("react-virtualized/dist/es/CellMeasurer", "CellMeasurerCache")
  @js.native
  open class CellMeasurerCache ()
    extends StObject
       with CellMeasurerCacheInterface {
    def this(params: CellMeasurerCacheParams) = this()
    
    def clear(rowIndex: Double, columnIndex: Double): Unit = js.native
    
    def clearAll(): Unit = js.native
    
    def columnWidth(params: Index): Double = js.native
    
    val defaultHeight: Double = js.native
    
    val defaultWidth: Double = js.native
    
    def rowHeight(params: Index): Double = js.native
  }
  
  @js.native
  trait CellMeasurerCacheInterface extends StObject {
    
    def getHeight(rowIndex: Double): Double = js.native
    def getHeight(rowIndex: Double, columnIndex: Double): Double = js.native
    
    def getWidth(rowIndex: Double): Double = js.native
    def getWidth(rowIndex: Double, columnIndex: Double): Double = js.native
    
    def has(rowIndex: Double, columnIndex: Double): Boolean = js.native
    
    def hasFixedHeight(): Boolean = js.native
    
    def hasFixedWidth(): Boolean = js.native
    
    def set(rowIndex: Double, columnIndex: Double, width: Double, height: Double): Unit = js.native
  }
  
  trait CellMeasurerCacheParams extends StObject {
    
    var defaultHeight: js.UndefOr[Double] = js.undefined
    
    var defaultWidth: js.UndefOr[Double] = js.undefined
    
    var fixedHeight: js.UndefOr[Boolean] = js.undefined
    
    var fixedWidth: js.UndefOr[Boolean] = js.undefined
    
    var keyMapper: js.UndefOr[KeyMapper] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
  }
  object CellMeasurerCacheParams {
    
    inline def apply(): CellMeasurerCacheParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMeasurerCacheParams]
    }
    
    extension [Self <: CellMeasurerCacheParams](x: Self) {
      
      inline def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      inline def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      inline def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
      
      inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
      
      inline def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      inline def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      inline def setKeyMapper(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Any): Self = StObject.set(x, "keyMapper", js.Any.fromFunction2(value))
      
      inline def setKeyMapperUndefined: Self = StObject.set(x, "keyMapper", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
  
  trait CellMeasurerChildProps extends StObject {
    
    def measure(): Unit
    
    var registerChild: js.UndefOr[js.Function1[/* element */ js.UndefOr[Element], Unit]] = js.undefined
  }
  object CellMeasurerChildProps {
    
    inline def apply(measure: () => Unit): CellMeasurerChildProps = {
      val __obj = js.Dynamic.literal(measure = js.Any.fromFunction0(measure))
      __obj.asInstanceOf[CellMeasurerChildProps]
    }
    
    extension [Self <: CellMeasurerChildProps](x: Self) {
      
      inline def setMeasure(value: () => Unit): Self = StObject.set(x, "measure", js.Any.fromFunction0(value))
      
      inline def setRegisterChild(value: /* element */ js.UndefOr[Element] => Unit): Self = StObject.set(x, "registerChild", js.Any.fromFunction1(value))
      
      inline def setRegisterChildUndefined: Self = StObject.set(x, "registerChild", js.undefined)
    }
  }
  
  trait CellMeasurerProps
    extends StObject
       with /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[Any] {
    
    var cache: CellMeasurerCacheInterface
    
    var children: (js.Function1[/* props */ CellMeasurerChildProps, ReactNode]) | ReactNode
    
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var parent: MeasuredCellParent
    
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CellMeasurerProps {
    
    inline def apply(cache: CellMeasurerCacheInterface, parent: MeasuredCellParent): CellMeasurerProps = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellMeasurerProps]
    }
    
    extension [Self <: CellMeasurerProps](x: Self) {
      
      inline def setCache(value: CellMeasurerCacheInterface): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: (js.Function1[/* props */ CellMeasurerChildProps, ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ CellMeasurerChildProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setParent(value: MeasuredCellParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait CellPosition extends StObject {
    
    var columnIndex: Double
    
    var rowIndex: Double
  }
  object CellPosition {
    
    inline def apply(columnIndex: Double, rowIndex: Double): CellPosition = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellPosition]
    }
    
    extension [Self <: CellPosition](x: Self) {
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyMapper = js.Function2[/* rowIndex */ Double, /* columnIndex */ Double, Any]
  
  trait MeasuredCellParent extends StObject {
    
    var invalidateCellSizeAfterRender: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.undefined
    
    var recomputeGridSize: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.undefined
  }
  object MeasuredCellParent {
    
    inline def apply(): MeasuredCellParent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeasuredCellParent]
    }
    
    extension [Self <: MeasuredCellParent](x: Self) {
      
      inline def setInvalidateCellSizeAfterRender(value: /* cell */ CellPosition => Unit): Self = StObject.set(x, "invalidateCellSizeAfterRender", js.Any.fromFunction1(value))
      
      inline def setInvalidateCellSizeAfterRenderUndefined: Self = StObject.set(x, "invalidateCellSizeAfterRender", js.undefined)
      
      inline def setRecomputeGridSize(value: /* cell */ CellPosition => Unit): Self = StObject.set(x, "recomputeGridSize", js.Any.fromFunction1(value))
      
      inline def setRecomputeGridSizeUndefined: Self = StObject.set(x, "recomputeGridSize", js.undefined)
    }
  }
}
