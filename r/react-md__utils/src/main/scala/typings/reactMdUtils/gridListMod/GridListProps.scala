package typings.reactMdUtils.gridListMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridListProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * An optional margin to apply to each cell as the `CELL_MARGIN_VAR` css
    * variable only when it is defined. This has to be a number string with a
    * `px`, `em`, `rem` or `%` suffix or else the grid will break.
    */
  var cellMargin: js.UndefOr[String] = js.native
  /**
    * The children to display within the grid list. This can either be a callback
    * function that will provide the current calculated width for each cell that
    * should return renderable elements or any renderable elements that are sized
    * with the `--rmd-cell-width` css variable.
    */
  @JSName("children")
  var children_GridListProps: ReactNode | RenderGridListChildren = js.native
  /**
    * Boolean if the current cell sizing should automatically be cloned into each
    * child. This will only work if the `children` is renderable element or a
    * list of renderable elements that accept the `style` and `className` props.
    */
  @JSName("clone")
  var clone_FGridListProps: js.UndefOr[Boolean] = js.native
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
    * Boolean if the resize observer should stop tracking width changes within
    * the `GridList`. This should normally stay as `false` since tracking width
    * changes will allow for dynamic content being added to the list to not mess
    * up the grid calculation when the user is on an OS that shows scrollbars.
    */
  var disableHeightObserver: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the current scrollbar width should no longer be subtracted from
    * the total width of the grid list. This should only be disabled if your
    * `containerPadding` is updated to include scrollbar width as well since
    * it'll mess up the grid on OSes that display scrollbars.
    */
  var disableScrollbarWidth: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the resize observer should stop tracking width changes within
    * the `GridList`. This should normally stay as `false` since tracking width
    * changes will allow for dynamic content being added to the list to not mess
    * up the grid calculation when the user is on an OS that shows scrollbars.
    */
  var disableWidthObserver: js.UndefOr[Boolean] = js.native
  /**
    * The max size that each cell can be.
    */
  var maxCellSize: js.UndefOr[Double] = js.native
  /**
    * Boolean if each child within the `GridList` should be wrapped with the
    * `GridListCell` component.  This will only work if the `children` is not a
    * `function`.
    */
  var wrapOnly: js.UndefOr[Boolean] = js.native
}

object GridListProps {
  @scala.inline
  def apply(): GridListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridListProps]
  }
  @scala.inline
  implicit class GridListPropsOps[Self <: GridListProps] (val x: Self) extends AnyVal {
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
    def setChildrenFunction1(value: /* size */ GridListSize => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ReactNode | RenderGridListChildren): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
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
    def setDisableHeightObserver(value: Boolean): Self = this.set("disableHeightObserver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHeightObserver: Self = this.set("disableHeightObserver", js.undefined)
    @scala.inline
    def setDisableScrollbarWidth(value: Boolean): Self = this.set("disableScrollbarWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScrollbarWidth: Self = this.set("disableScrollbarWidth", js.undefined)
    @scala.inline
    def setDisableWidthObserver(value: Boolean): Self = this.set("disableWidthObserver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWidthObserver: Self = this.set("disableWidthObserver", js.undefined)
    @scala.inline
    def setMaxCellSize(value: Double): Self = this.set("maxCellSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCellSize: Self = this.set("maxCellSize", js.undefined)
    @scala.inline
    def setWrapOnly(value: Boolean): Self = this.set("wrapOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapOnly: Self = this.set("wrapOnly", js.undefined)
  }
  
}

