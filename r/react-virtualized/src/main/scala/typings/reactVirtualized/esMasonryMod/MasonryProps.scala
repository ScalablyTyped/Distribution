package typings.reactVirtualized.esMasonryMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.ClientHeight
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheInterface
import typings.reactVirtualized.esCellMeasurerMod.KeyMapper
import typings.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasonryProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  
  var autoHeight: Boolean = js.native
  
  var cellCount: Double = js.native
  
  var cellMeasurerCache: CellMeasurerCacheInterface = js.native
  
  var cellPositioner: Positioner = js.native
  
  var cellRenderer: CellRenderer = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var height: Double = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var keyMapper: js.UndefOr[KeyMapper] = js.native
  
  var onCellsRendered: js.UndefOr[OnCellsRenderedCallback] = js.native
  
  var onScroll: js.UndefOr[OnScrollCallback] = js.native
  
  var overscanByPixels: js.UndefOr[Double] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabIndex: js.UndefOr[Double | Null] = js.native
  
  var width: Double = js.native
}
object MasonryProps {
  
  @scala.inline
  def apply(
    autoHeight: Boolean,
    cellCount: Double,
    cellMeasurerCache: CellMeasurerCacheInterface,
    cellPositioner: Positioner,
    cellRenderer: /* props */ MasonryCellProps => ReactNode,
    height: Double,
    width: Double
  ): MasonryProps = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], cellCount = cellCount.asInstanceOf[js.Any], cellMeasurerCache = cellMeasurerCache.asInstanceOf[js.Any], cellPositioner = cellPositioner.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps]
  }
  
  @scala.inline
  implicit class MasonryPropsOps[Self <: MasonryProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellCount(value: Double): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellMeasurerCache(value: CellMeasurerCacheInterface): Self = this.set("cellMeasurerCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellPositioner(value: Positioner): Self = this.set("cellPositioner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRenderer(value: /* props */ MasonryCellProps => ReactNode): Self = this.set("cellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKeyMapper(value: (/* rowIndex */ Double, /* columnIndex */ Double) => js.Any): Self = this.set("keyMapper", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteKeyMapper: Self = this.set("keyMapper", js.undefined)
    
    @scala.inline
    def setOnCellsRendered(value: /* params */ IndexRange => Unit): Self = this.set("onCellsRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCellsRendered: Self = this.set("onCellsRendered", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* params */ ClientHeight => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOverscanByPixels(value: Double): Self = this.set("overscanByPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanByPixels: Self = this.set("overscanByPixels", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setScrollingResetTimeInterval(value: Double): Self = this.set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollingResetTimeInterval: Self = this.set("scrollingResetTimeInterval", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTabIndexNull: Self = this.set("tabIndex", null)
  }
}
