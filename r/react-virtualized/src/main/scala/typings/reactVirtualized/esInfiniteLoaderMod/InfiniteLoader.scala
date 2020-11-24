package typings.reactVirtualized.esInfiniteLoaderMod

import typings.react.mod.Component
import typings.reactVirtualized.anon.IsRowLoaded
import typings.reactVirtualized.anon.MinimumBatchSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var defaultProps: MinimumBatchSize = js.native
  
  var propTypes: IsRowLoaded = js.native
}
