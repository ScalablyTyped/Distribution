package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEventMap extends js.Object {
  var cancel: AnimationPlaybackEvent
  var finish: AnimationPlaybackEvent
}

object AnimationEventMap {
  @scala.inline
  def apply(cancel: AnimationPlaybackEvent, finish: AnimationPlaybackEvent): AnimationEventMap = {
    val __obj = js.Dynamic.literal(cancel = cancel, finish = finish)
  
    __obj.asInstanceOf[AnimationEventMap]
  }
}

