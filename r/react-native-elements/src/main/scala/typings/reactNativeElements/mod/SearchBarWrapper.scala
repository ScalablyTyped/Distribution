package typings.reactNativeElements.mod

import typings.reactNativeElements.reactNativeElementsStrings.android
import typings.reactNativeElements.reactNativeElementsStrings.default
import typings.reactNativeElements.reactNativeElementsStrings.ios
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarWrapper extends js.Object {
  /**
    * What style of search bar to display
    *
    * @default is 'default
    */
  var platform: js.UndefOr[default | ios | android] = js.native
}

object SearchBarWrapper {
  @scala.inline
  def apply(): SearchBarWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarWrapper]
  }
  @scala.inline
  implicit class SearchBarWrapperOps[Self <: SearchBarWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlatform(value: default | ios | android): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
  }
  
}

