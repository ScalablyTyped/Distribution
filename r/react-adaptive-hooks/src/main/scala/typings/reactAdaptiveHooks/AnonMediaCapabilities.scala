package typings.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaCapabilities[T] extends js.Object {
  var mediaCapabilities: (AnonHasMediaConfig with T) | hasMediaConfigundefinedMe
}

object AnonMediaCapabilities {
  @scala.inline
  def apply[T](mediaCapabilities: (AnonHasMediaConfig with T) | hasMediaConfigundefinedMe): AnonMediaCapabilities[T] = {
    val __obj = js.Dynamic.literal(mediaCapabilities = mediaCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaCapabilities[T]]
  }
}

