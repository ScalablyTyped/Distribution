package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Transition")
@js.native
class Transition () extends js.Object {
  def this(options: seenLib.Anon_DurationNumber) = this()
  var defaults: seenLib.Anon_Duration = js.native
  var duration: scala.Double = js.native
  def firstFrame(): scala.Unit = js.native
  def frame(): scala.Unit = js.native
  def lastFrame(): scala.Unit = js.native
  def update(): scala.Boolean = js.native
  def update(t: scala.Double): scala.Boolean = js.native
}

