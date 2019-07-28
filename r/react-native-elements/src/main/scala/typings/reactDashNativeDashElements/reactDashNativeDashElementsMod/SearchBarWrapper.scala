package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.android
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.default
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.ios
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarWrapper extends js.Object {
  /**
    * What style of search bar to display
    *
    * @default is 'default
    */
  var platform: js.UndefOr[default | ios | android] = js.undefined
}

object SearchBarWrapper {
  @scala.inline
  def apply(platform: default | ios | android = null): SearchBarWrapper = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarWrapper]
  }
}

