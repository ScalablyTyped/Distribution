package typings.reactMdUtils.useGridListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGridListOptions extends js.Object {
  
  /**
    * An optional margin to apply to each cell as the `CELL_MARGIN_VAR` css
    * variable only when it is defined. This has to be a number string with a
    * `px`, `em`, `rem` or `%` suffix or else the grid will break.
    */
  var cellMargin: js.UndefOr[String] = js.native
  
  /**
    * An optional className to merge with the grid list class name
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * This is _normally_ the amount of padding on the grid list item itself to
    * subtract from the `offsetWidth` since `padding`, `border`, and vertical
    * scrollbars will be included.  If you add a border or change the padding or
    * add borders to this component, you'll need to update the `containerPadding`
    * to be the new number.
    */
  var containerPadding: js.UndefOr[Double] = js.native
  
  /**
    * Since the `GridList` requires being fully rendered in the DOM to be able to
    * correctly calculate the number of `columns` and `cellWidth`, this _might_
    * cause problems when server-side rendering when using the children renderer
    * to create a grid list dynamically based on the number of columns. If the
    * number of columns and default `cellWidth` can be guessed server-side, you
    * should provide this prop. Otherwise it will be: `{ cellSize; maxCellSize,
    * columns: -1 }`
    */
  var defaultSize: js.UndefOr[GridListSize | js.Function0[GridListSize]] = js.native
  
  /**
    * Boolean if the recalculation of grid sizing should not happen for height
    * changes.
    */
  var disableHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the recalculation of grid sizing should not happen for width
    * changes.
    */
  var disableWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * The max size that each cell can be.
    */
  var maxCellSize: js.UndefOr[Double] = js.native
  
  /**
    * An optional style object to merge with the grid custom css properties
    * object.
    */
  var style: js.UndefOr[typings.react.mod.CSSProperties] = js.native
}
object UseGridListOptions {
  
  @scala.inline
  def apply(): UseGridListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGridListOptions]
  }
  
  @scala.inline
  implicit class UseGridListOptionsOps[Self <: UseGridListOptions] (val x: Self) extends AnyVal {
    
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
    def setCellMargin(value: String): Self = this.set("cellMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellMargin: Self = this.set("cellMargin", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContainerPadding(value: Double): Self = this.set("containerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerPadding: Self = this.set("containerPadding", js.undefined)
    
    @scala.inline
    def setDefaultSizeFunction0(value: () => GridListSize): Self = this.set("defaultSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultSize(value: GridListSize | js.Function0[GridListSize]): Self = this.set("defaultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSize: Self = this.set("defaultSize", js.undefined)
    
    @scala.inline
    def setDisableHeight(value: Boolean): Self = this.set("disableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHeight: Self = this.set("disableHeight", js.undefined)
    
    @scala.inline
    def setDisableWidth(value: Boolean): Self = this.set("disableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWidth: Self = this.set("disableWidth", js.undefined)
    
    @scala.inline
    def setMaxCellSize(value: Double): Self = this.set("maxCellSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCellSize: Self = this.set("maxCellSize", js.undefined)
    
    @scala.inline
    def setStyle(value: typings.react.mod.CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
