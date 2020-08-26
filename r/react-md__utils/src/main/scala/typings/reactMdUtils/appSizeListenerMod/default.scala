package typings.reactMdUtils.appSizeListenerMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/sizing/AppSizeListener", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * This component should be mounted near the top of your app as it will keep
    * track of the current app size based on the provided breakpoint widths.
    */
  def apply(
    hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
  ): ReactElement = js.native
  @js.native
  object propTypes extends js.Object {
    var children: js.Any = js.native
    var defaultSize: js.Any = js.native
    var desktopLargeMinWidth: js.Any = js.native
    var desktopMinWidth: js.Any = js.native
    var onChange: js.Any = js.native
    var phoneMaxWidth: js.Any = js.native
    var tabletMaxWidth: js.Any = js.native
    var tabletMinWidth: js.Any = js.native
  }
  
}

