package typings.seen.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "MocapAnimator")
@js.native
class MocapAnimator protected () extends Animator {
  def this(mocap: MocapModel) = this()
  def renderFrame(): Unit = js.native
}

