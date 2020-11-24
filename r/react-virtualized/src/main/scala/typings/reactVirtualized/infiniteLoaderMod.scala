package typings.reactVirtualized

import typings.reactVirtualized.anon.IsRowLoaded
import typings.reactVirtualized.anon.MinimumBatchSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/commonjs/InfiniteLoader", JSImport.Namespace)
@js.native
object infiniteLoaderMod extends js.Object {
  
  @js.native
  class InfiniteLoader ()
    extends typings.reactVirtualized.esInfiniteLoaderMod.InfiniteLoader
  /* static members */
  @js.native
  object InfiniteLoader extends js.Object {
    
    var defaultProps: MinimumBatchSize = js.native
    
    var propTypes: IsRowLoaded = js.native
  }
}
