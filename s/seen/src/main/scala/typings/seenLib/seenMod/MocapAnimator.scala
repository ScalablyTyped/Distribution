package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "MocapAnimator")
@js.native
class MocapAnimator protected () extends Animator {
  def this(mocap: MocapModel) = this()
  def renderFrame(): scala.Unit = js.native
}

