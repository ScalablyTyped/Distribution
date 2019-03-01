package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarWrapper extends js.Object {
  /**
    * What style of search bar to display
    *
    * @default is 'default
    */
  var platform: js.UndefOr[
    reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.default | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.ios | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.android
  ] = js.undefined
}

object SearchBarWrapper {
  @scala.inline
  def apply(
    platform: reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.default | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.ios | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.android = null
  ): SearchBarWrapper = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarWrapper]
  }
}

