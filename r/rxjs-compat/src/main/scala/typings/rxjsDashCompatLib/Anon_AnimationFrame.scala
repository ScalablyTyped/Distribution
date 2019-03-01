package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationFrame extends js.Object {
  var animationFrame: rxjsLib.internalTypesMod.SchedulerLike
  var asap: rxjsLib.internalTypesMod.SchedulerLike
  var async: rxjsLib.internalTypesMod.SchedulerLike
  var queue: rxjsLib.internalTypesMod.SchedulerLike
}

object Anon_AnimationFrame {
  @scala.inline
  def apply(
    animationFrame: rxjsLib.internalTypesMod.SchedulerLike,
    asap: rxjsLib.internalTypesMod.SchedulerLike,
    async: rxjsLib.internalTypesMod.SchedulerLike,
    queue: rxjsLib.internalTypesMod.SchedulerLike
  ): Anon_AnimationFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationFrame")(animationFrame)
    __obj.updateDynamic("asap")(asap)
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("queue")(queue)
    __obj.asInstanceOf[Anon_AnimationFrame]
  }
}

