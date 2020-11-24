package typings.reactSortablePane.paneMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactSortablePane.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class PanePropsOps[Self <: PaneProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: String | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultSize(value: Height): Self = this.set("defaultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSize: Self = this.set("defaultSize", js.undefined)
    
    @scala.inline
    def setGrid(value: js.Tuple2[Double, Double]): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: PaneSize): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: PaneSize): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: PaneSize): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: PaneSize): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setOnSizeChange(value: () => Unit): Self = this.set("onSizeChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSizeChange: Self = this.set("onSizeChange", js.undefined)
    
    @scala.inline
    def setResizable(value: IsPaneResizable): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
