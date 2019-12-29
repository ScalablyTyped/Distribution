package typings.scrollDashIntoDashViewDashIfDashNeeded.scrollDashIntoDashViewDashIfDashNeededMod

import typings.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.CustomScrollAction
import typings.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.CustomScrollBehaviorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomBehaviorOptions[T]
  extends typings.scrollDashIntoDashViewDashIfDashNeeded.typingsTypesMod.Options {
  @JSName("behavior")
  var behavior_Original: CustomScrollBehaviorCallback[T] = js.native
  def behavior(actions: js.Array[CustomScrollAction]): T = js.native
}

