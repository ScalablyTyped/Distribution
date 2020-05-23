package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaCapabilities[T] extends js.Object {
  var mediaCapabilities: (HasMediaConfig with T) | hasMediaConfigundefinedMe
}

object MediaCapabilities {
  @scala.inline
  def apply[T](mediaCapabilities: (HasMediaConfig with T) | hasMediaConfigundefinedMe): MediaCapabilities[T] = {
    val __obj = js.Dynamic.literal(mediaCapabilities = mediaCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCapabilities[T]]
  }
}

