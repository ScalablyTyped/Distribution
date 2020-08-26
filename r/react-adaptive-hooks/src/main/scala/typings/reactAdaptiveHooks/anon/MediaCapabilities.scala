package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaCapabilities[T] extends js.Object {
  var mediaCapabilities: (HasMediaConfig with T) | hasMediaConfigundefinedMe = js.native
}

object MediaCapabilities {
  @scala.inline
  def apply[T](mediaCapabilities: (HasMediaConfig with T) | hasMediaConfigundefinedMe): MediaCapabilities[T] = {
    val __obj = js.Dynamic.literal(mediaCapabilities = mediaCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCapabilities[T]]
  }
  @scala.inline
  implicit class MediaCapabilitiesOps[Self <: MediaCapabilities[_], T] (val x: Self with MediaCapabilities[T]) extends AnyVal {
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
    def setMediaCapabilities(value: (HasMediaConfig with T) | hasMediaConfigundefinedMe): Self = this.set("mediaCapabilities", value.asInstanceOf[js.Any])
  }
  
}

