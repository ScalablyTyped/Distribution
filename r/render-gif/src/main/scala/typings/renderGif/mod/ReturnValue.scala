package typings.renderGif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnValue extends js.Object {
  /** Whether the animation should be rendered and provided to the callback. */
  var isPlaying: Boolean = js.native
}

object ReturnValue {
  @scala.inline
  def apply(isPlaying: Boolean): ReturnValue = {
    val __obj = js.Dynamic.literal(isPlaying = isPlaying.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue] (val x: Self) extends AnyVal {
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
    def setIsPlaying(value: Boolean): Self = this.set("isPlaying", value.asInstanceOf[js.Any])
  }
  
}

