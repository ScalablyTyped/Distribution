package typings
package stompitLib.libClientSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  def getId(): scala.Double = js.native
  def processMessageFrame(error: nodeLib.Error, frame: nodeLib.streamMod.Writable): scala.Unit = js.native
  def processMessageFrame(error: scala.Null, frame: nodeLib.streamMod.Writable): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
  def unsubscribe(headers: js.Any): scala.Unit = js.native
}

