package typings.reactVirtualized.esInfiniteLoaderMod

import typings.react.mod.Component
import typings.reactVirtualized.AnonIsRowLoaded
import typings.reactVirtualized.AnonMinimumBatchSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/InfiniteLoader", "InfiniteLoader")
@js.native
class InfiniteLoader ()
  extends Component[InfiniteLoaderProps, js.Object, js.Any] {
  def resetLoadMoreRowsCache(): Unit = js.native
  def resetLoadMoreRowsCache(autoReload: Boolean): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/InfiniteLoader", "InfiniteLoader")
@js.native
object InfiniteLoader extends js.Object {
  var defaultProps: AnonMinimumBatchSize = js.native
  var propTypes: AnonIsRowLoaded = js.native
}

