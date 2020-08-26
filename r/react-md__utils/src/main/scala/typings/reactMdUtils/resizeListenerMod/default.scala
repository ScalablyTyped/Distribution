package typings.reactMdUtils.resizeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/sizing/ResizeListener", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * This is a simple component that will attach a throttled resize event listener
    * when mounted, and detach when it unmounts.
    *
    * This component only works for entire app resize events. If you are looking
    * for specific element resize events, check out the `ResizeObserver` component
    * instead.
    */
  def apply(hasOnResizeOptionsImmediate: ResizeListenerProps): Null = js.native
  @js.native
  object propTypes extends js.Object {
    var immediate: js.Any = js.native
    var onResize: js.Any = js.native
    var options: js.Any = js.native
  }
  
}

