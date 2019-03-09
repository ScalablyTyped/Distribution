package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Animator")
@js.native
class Animator () extends js.Object {
  var dispatch: seenLib.seenMod.EventsNs.Dispatcher = js.native
  var frameDelay: scala.Double | scala.Null = js.native
  var timestamp: scala.Double = js.native
  def animateFrame(): this.type = js.native
  def frame(): this.type = js.native
  def frame(t: scala.Boolean): this.type = js.native
  def onAfter(handler: FrameHandler): this.type = js.native
  def onBefore(handler: FrameHandler): this.type = js.native
  def onFrame(handler: FrameHandler): this.type = js.native
  def start(): this.type = js.native
  def stop(): this.type = js.native
}

