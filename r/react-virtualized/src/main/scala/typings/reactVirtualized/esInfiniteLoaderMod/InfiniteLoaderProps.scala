package typings.reactVirtualized.esInfiniteLoaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactVirtualized.mod.Index
import typings.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteLoaderProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Minimum number of rows to be loaded at a time.
    * This property can be used to batch requests to reduce HTTP requests.
    */
  var minimumBatchSize: js.UndefOr[Double] = js.native
  /**
    * Number of rows in list; can be arbitrary high number if actual number is unknown.
    */
  var rowCount: js.UndefOr[Double] = js.native
  /**
    * Threshold at which to pre-fetch data.
    * A threshold X means that data will start loading when a user scrolls within X rows.
    * This value defaults to 15.
    */
  var threshold: js.UndefOr[Double] = js.native
  /**
    * Function responsible for rendering a virtualized component.
    * This function should implement the following signature:
    * ({ onRowsRendered, registerChild }) => PropTypes.element
    *
    * The specified :onRowsRendered function should be passed through to the child's :onRowsRendered property.
    * The :registerChild callback should be set as the virtualized component's :ref.
    */
  def children(props: InfiniteLoaderChildProps): ReactNode = js.native
  /**
    * Function responsible for tracking the loaded state of each row.
    * It should implement the following signature: ({ index: number }): boolean
    */
  def isRowLoaded(params: Index): Boolean = js.native
  /**
    * Callback to be invoked when more rows must be loaded.
    * It should implement the following signature: ({ startIndex, stopIndex }): Promise
    * The returned Promise should be resolved once row data has finished loading.
    * It will be used to determine when to refresh the list with the newly-loaded data.
    * This callback may be called multiple times in reaction to a single scroll event.
    */
  def loadMoreRows(params: IndexRange): js.Promise[_] = js.native
}

object InfiniteLoaderProps {
  @scala.inline
  def apply(
    children: InfiniteLoaderChildProps => ReactNode,
    isRowLoaded: Index => Boolean,
    loadMoreRows: IndexRange => js.Promise[_]
  ): InfiniteLoaderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isRowLoaded = js.Any.fromFunction1(isRowLoaded), loadMoreRows = js.Any.fromFunction1(loadMoreRows))
    __obj.asInstanceOf[InfiniteLoaderProps]
  }
  @scala.inline
  implicit class InfiniteLoaderPropsOps[Self <: InfiniteLoaderProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: InfiniteLoaderChildProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setIsRowLoaded(value: Index => Boolean): Self = this.set("isRowLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadMoreRows(value: IndexRange => js.Promise[_]): Self = this.set("loadMoreRows", js.Any.fromFunction1(value))
    @scala.inline
    def setMinimumBatchSize(value: Double): Self = this.set("minimumBatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumBatchSize: Self = this.set("minimumBatchSize", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

