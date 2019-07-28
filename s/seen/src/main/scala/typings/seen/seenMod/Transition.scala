package typings.seen.seenMod

import typings.seen.Anon_Duration
import typings.seen.Anon_DurationNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Transition")
@js.native
class Transition () extends js.Object {
  def this(options: Anon_DurationNumber) = this()
  var defaults: Anon_Duration = js.native
  var duration: Double = js.native
  def firstFrame(): Unit = js.native
  def frame(): Unit = js.native
  def lastFrame(): Unit = js.native
  def update(): Boolean = js.native
  def update(t: Double): Boolean = js.native
}

