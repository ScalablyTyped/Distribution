package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.IsRowLoaded
import typings.reactVirtualized.anon.MinimumBatchSize
import typings.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "InfiniteLoader")
@js.native
class InfiniteLoader protected ()
  extends typings.reactVirtualized.esInfiniteLoaderMod.InfiniteLoader {
  def this(props: InfiniteLoaderProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: InfiniteLoaderProps, context: js.Any) = this()
}
/* static members */
object InfiniteLoader {
  
  @JSImport("react-virtualized", "InfiniteLoader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "InfiniteLoader.defaultProps")
  @js.native
  def defaultProps: MinimumBatchSize = js.native
  @scala.inline
  def defaultProps_=(x: MinimumBatchSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-virtualized", "InfiniteLoader.propTypes")
  @js.native
  def propTypes: IsRowLoaded = js.native
  @scala.inline
  def propTypes_=(x: IsRowLoaded): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
