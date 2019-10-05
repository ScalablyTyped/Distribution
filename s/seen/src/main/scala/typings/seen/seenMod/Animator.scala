package typings.seen.seenMod

import typings.seen.seenMod.Events.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Animator")
@js.native
class Animator () extends js.Object {
  var dispatch: Dispatcher = js.native
  var frameDelay: Double | Null = js.native
  var timestamp: Double = js.native
  def animateFrame(): this.type = js.native
  def frame(): this.type = js.native
  def frame(t: Boolean): this.type = js.native
  def onAfter(handler: FrameHandler): this.type = js.native
  def onBefore(handler: FrameHandler): this.type = js.native
  def onFrame(handler: FrameHandler): this.type = js.native
  def start(): this.type = js.native
  def stop(): this.type = js.native
}

