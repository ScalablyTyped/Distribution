package typings.reactNativeElements.mod

import typings.reactNativeElements.reactNativeElementsStrings.android
import typings.reactNativeElements.reactNativeElementsStrings.default
import typings.reactNativeElements.reactNativeElementsStrings.ios
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

