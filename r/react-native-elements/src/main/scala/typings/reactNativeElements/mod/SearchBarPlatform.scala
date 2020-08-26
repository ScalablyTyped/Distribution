package typings.reactNativeElements.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarPlatform extends SearchBarBase {
  /**
    * Callback fired when the cancel button is pressed
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
}

object SearchBarPlatform {
  @scala.inline
  def apply(): SearchBarPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarPlatform]
  }
  @scala.inline
  implicit class SearchBarPlatformOps[Self <: SearchBarPlatform] (val x: Self) extends AnyVal {
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
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
  }
  
}

