package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "MocapAnimator")
@js.native
class MocapAnimator protected () extends Animator {
  def this(mocap: MocapModel) = this()
  
  def renderFrame(): Unit = js.native
}
