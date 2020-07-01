package typings.reactMasonryLayout.mod.ReactMasonryLayoutExport

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryLayoutProps extends js.Object {
  /**
    * The css classname you want to use
    *
    * @default ''
    */
  var className: js.UndefOr[String] = js.undefined
  var id: String
  /**
    * The function that used to load more data
    *
    * @default () => {}
    */
  var infiniteScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * By default, it will listen to the window's scroll event. If you want to listen to some div's scroll event, please set the container's id to it
    *
    * @default 'window'
    */
  var infiniteScrollContainer: js.UndefOr[String] = js.undefined
  /**
    * If you don't want to trigger infiniteScroll, set it to true
    *
    * @default false
    */
  var infiniteScrollDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The distance to trigger infiniteScroll
    *
    * @default 200
    */
  var infiniteScrollDistance: js.UndefOr[Double] = js.undefined
  /**
    * When no more data, please set it to true, then the infiniteScroll will not trigger
    *
    * @default false
    */
  var infiniteScrollEnd: js.UndefOr[Boolean] = js.undefined
  /**
    * Override it if you want to custom the no more data indicator
    *
    * @default <div>no more data</div>
    */
  var infiniteScrollEndIndicator: js.UndefOr[ReactNode] = js.undefined
  /**
    * When you are loading data, please set it to true, then the infiniteScroll will not trigger
    *
    * @default false
    */
  var infiniteScrollLoading: js.UndefOr[Boolean] = js.undefined
  /**
    * Override it if you want to custom the loading spinner
    *
    * @default <div>this is a loader</div>
    */
  var infiniteScrollSpinner: js.UndefOr[ReactNode] = js.undefined
  /**
    * An attribute added to the grid items after they're positioned within the grid. If the attribute is not prefixed with data-, it will be added.
    * @default data-packed
    */
  var packed: js.UndefOr[String] = js.undefined
  /**
    * A boolean, defaulting to true, indicating that the grid items should be positioned using the top and left CSS properties.
    *
    * If set to false, the grid items will be positioned using the transform CSS property.
    *
    * @default false
    */
  var position: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of objects describing the grid's properties at different breakpoints.
    *
    * When defining your sizes, note the following:
    *
    * - Sizes must be listed smallest to largest
    * - Sizes must use min-width media queries (any unit)
    * - Width of the grid items at each breakpoint should be set in your CSS (in px)
    * - The size without the mq property is assumed to be your smallest breakpoint, and must appear first
    * @default [ { columns: 2, gutter: 20 }, { mq: '768px', columns: 3, gutter: 20 }, { mq: '1024px', columns: 6, gutter: 20 } ]
    */
  var sizes: js.UndefOr[js.Array[MasonryLayoutSizes]] = js.undefined
  /**
    * The inline style you want to use
    *
    * @default {}
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object MasonryLayoutProps {
  @scala.inline
  def apply(
    id: String,
    className: String = null,
    infiniteScroll: () => Unit = null,
    infiniteScrollContainer: String = null,
    infiniteScrollDisabled: js.UndefOr[Boolean] = js.undefined,
    infiniteScrollDistance: js.UndefOr[Double] = js.undefined,
    infiniteScrollEnd: js.UndefOr[Boolean] = js.undefined,
    infiniteScrollEndIndicator: ReactNode = null,
    infiniteScrollLoading: js.UndefOr[Boolean] = js.undefined,
    infiniteScrollSpinner: ReactNode = null,
    packed: String = null,
    position: js.UndefOr[Boolean] = js.undefined,
    sizes: js.Array[MasonryLayoutSizes] = null,
    style: CSSProperties = null
  ): MasonryLayoutProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (infiniteScroll != null) __obj.updateDynamic("infiniteScroll")(js.Any.fromFunction0(infiniteScroll))
    if (infiniteScrollContainer != null) __obj.updateDynamic("infiniteScrollContainer")(infiniteScrollContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteScrollDisabled)) __obj.updateDynamic("infiniteScrollDisabled")(infiniteScrollDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteScrollDistance)) __obj.updateDynamic("infiniteScrollDistance")(infiniteScrollDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteScrollEnd)) __obj.updateDynamic("infiniteScrollEnd")(infiniteScrollEnd.get.asInstanceOf[js.Any])
    if (infiniteScrollEndIndicator != null) __obj.updateDynamic("infiniteScrollEndIndicator")(infiniteScrollEndIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(infiniteScrollLoading)) __obj.updateDynamic("infiniteScrollLoading")(infiniteScrollLoading.get.asInstanceOf[js.Any])
    if (infiniteScrollSpinner != null) __obj.updateDynamic("infiniteScrollSpinner")(infiniteScrollSpinner.asInstanceOf[js.Any])
    if (packed != null) __obj.updateDynamic("packed")(packed.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryLayoutProps]
  }
}

