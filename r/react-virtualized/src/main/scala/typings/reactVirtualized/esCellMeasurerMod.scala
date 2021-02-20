package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.Index
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCellMeasurerMod {
  
  @JSImport("react-virtualized/dist/es/CellMeasurer", "CellMeasurer")
  @js.native
  class CellMeasurer protected ()
    extends PureComponent[CellMeasurerProps, js.Object, js.Any] {
    def this(props: CellMeasurerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CellMeasurerProps, context: js.Any) = this()
  }
  
  @JSImport("react-virtualized/dist/es/CellMeasurer", "CellMeasurerCache")
  @js.native
  class CellMeasurerCache () extends CellMeasurerCacheInterface {
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
  
  @js.native
  trait CellMeasurerCacheParams extends StObject {
    
    var defaultHeight: js.UndefOr[Double] = js.native
    
    var defaultWidth: js.UndefOr[Double] = js.native
    
    var fixedHeight: js.UndefOr[Boolean] = js.native
    
    var fixedWidth: js.UndefOr[Boolean] = js.native
    
    var keyMapper: js.UndefOr[KeyMapper] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
  }
  object CellMeasurerCacheParams {
    
    @scala.inline
    def apply(): CellMeasurerCacheParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMeasurerCacheParams]
    }
    
    @scala.inline
    implicit class CellMeasurerCacheParamsMutableBuilder[Self <: CellMeasurerCacheParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      @scala.inline
      def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      @scala.inline
      def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
      
      @scala.inline
      def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      @scala.inline
      def setKeyMapper(value: (/* rowIndex */ Double, /* columnIndex */ Double) => js.Any): Self = StObject.set(x, "keyMapper", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyMapperUndefined: Self = StObject.set(x, "keyMapper", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
  
  @js.native
  trait CellMeasurerChildProps extends StObject {
    
    def measure(): Unit = js.native
    
    var registerChild: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
  }
  object CellMeasurerChildProps {
    
    @scala.inline
    def apply(measure: () => Unit): CellMeasurerChildProps = {
      val __obj = js.Dynamic.literal(measure = js.Any.fromFunction0(measure))
      __obj.asInstanceOf[CellMeasurerChildProps]
    }
    
    @scala.inline
    implicit class CellMeasurerChildPropsMutableBuilder[Self <: CellMeasurerChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeasure(value: () => Unit): Self = StObject.set(x, "measure", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterChild(value: /* element */ Element => Unit): Self = StObject.set(x, "registerChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterChildUndefined: Self = StObject.set(x, "registerChild", js.undefined)
    }
  }
  
  @js.native
  trait CellMeasurerProps
    extends /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] {
    
    var cache: CellMeasurerCacheInterface = js.native
    
    var children: (js.Function1[/* props */ CellMeasurerChildProps, ReactNode]) | ReactNode = js.native
    
    var columnIndex: js.UndefOr[Double] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var parent: MeasuredCellParent = js.native
    
    var rowIndex: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CellMeasurerProps {
    
    @scala.inline
    def apply(cache: CellMeasurerCacheInterface, parent: MeasuredCellParent): CellMeasurerProps = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellMeasurerProps]
    }
    
    @scala.inline
    implicit class CellMeasurerPropsMutableBuilder[Self <: CellMeasurerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: CellMeasurerCacheInterface): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: (js.Function1[/* props */ CellMeasurerChildProps, ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ CellMeasurerChildProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setParent(value: MeasuredCellParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CellPosition extends StObject {
    
    var columnIndex: Double = js.native
    
    var rowIndex: Double = js.native
  }
  object CellPosition {
    
    @scala.inline
    def apply(columnIndex: Double, rowIndex: Double): CellPosition = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellPosition]
    }
    
    @scala.inline
    implicit class CellPositionMutableBuilder[Self <: CellPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyMapper = js.Function2[/* rowIndex */ Double, /* columnIndex */ Double, js.Any]
  
  @js.native
  trait MeasuredCellParent extends StObject {
    
    var invalidateCellSizeAfterRender: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.native
    
    var recomputeGridSize: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.native
  }
  object MeasuredCellParent {
    
    @scala.inline
    def apply(): MeasuredCellParent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeasuredCellParent]
    }
    
    @scala.inline
    implicit class MeasuredCellParentMutableBuilder[Self <: MeasuredCellParent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalidateCellSizeAfterRender(value: /* cell */ CellPosition => Unit): Self = StObject.set(x, "invalidateCellSizeAfterRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInvalidateCellSizeAfterRenderUndefined: Self = StObject.set(x, "invalidateCellSizeAfterRender", js.undefined)
      
      @scala.inline
      def setRecomputeGridSize(value: /* cell */ CellPosition => Unit): Self = StObject.set(x, "recomputeGridSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRecomputeGridSizeUndefined: Self = StObject.set(x, "recomputeGridSize", js.undefined)
    }
  }
}
