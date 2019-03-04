package typings
package reactDashVirtualizedLib.distEsInfiniteLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteLoaderProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Minimum number of rows to be loaded at a time.
    * This property can be used to batch requests to reduce HTTP requests.
    */
  var minimumBatchSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of rows in list; can be arbitrary high number if actual number is unknown.
    */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Threshold at which to pre-fetch data.
    * A threshold X means that data will start loading when a user scrolls within X rows.
    * This value defaults to 15.
    */
  var threshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Function responsible for rendering a virtualized component.
    * This function should implement the following signature:
    * ({ onRowsRendered, registerChild }) => PropTypes.element
    *
    * The specified :onRowsRendered function should be passed through to the child's :onRowsRendered property.
    * The :registerChild callback should be set as the virtualized component's :ref.
    */
  def children(props: InfiniteLoaderChildProps): reactLib.reactMod.ReactNs.ReactNode
  /**
    * Function responsible for tracking the loaded state of each row.
    * It should implement the following signature: ({ index: number }): boolean
    */
  def isRowLoaded(params: reactDashVirtualizedLib.reactDashVirtualizedMod.Index): scala.Boolean
  /**
    * Callback to be invoked when more rows must be loaded.
    * It should implement the following signature: ({ startIndex, stopIndex }): Promise
    * The returned Promise should be resolved once row data has finished loading.
    * It will be used to determine when to refresh the list with the newly-loaded data.
    * This callback may be called multiple times in reaction to a single scroll event.
    */
  def loadMoreRows(params: reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange): js.Promise[_]
}

object InfiniteLoaderProps {
  @scala.inline
  def apply(
    children: js.Function1[InfiniteLoaderChildProps, reactLib.reactMod.ReactNs.ReactNode],
    isRowLoaded: js.Function1[reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Boolean],
    loadMoreRows: js.Function1[reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange, js.Promise[_]],
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    minimumBatchSize: scala.Int | scala.Double = null,
    rowCount: scala.Int | scala.Double = null,
    threshold: scala.Int | scala.Double = null
  ): InfiniteLoaderProps = {
    val __obj = js.Dynamic.literal(children = children, isRowLoaded = isRowLoaded, loadMoreRows = loadMoreRows)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (minimumBatchSize != null) __obj.updateDynamic("minimumBatchSize")(minimumBatchSize.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteLoaderProps]
  }
}

