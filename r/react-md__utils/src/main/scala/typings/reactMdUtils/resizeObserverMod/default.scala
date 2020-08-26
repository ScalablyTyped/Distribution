package typings.reactMdUtils.resizeObserverMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/sizing/ResizeObserver", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * The resize observer is used to track the size changes for a single element in
    * a page.  This is a bit different than a normal `ResizeListener` since it does
    * not rely on entire page size changes.
    */
  def apply(hasDisableHeightDisableWidthClassNameComponentTargetOnResize: ResizeObserverProps): ReactElement | Null = js.native
  @js.native
  object propTypes extends js.Object {
    var className: js.Any = js.native
    var component: js.Any = js.native
    var disableHeight: js.Any = js.native
    var disableWidth: js.Any = js.native
    var target: js.Any = js.native
  }
  
}

