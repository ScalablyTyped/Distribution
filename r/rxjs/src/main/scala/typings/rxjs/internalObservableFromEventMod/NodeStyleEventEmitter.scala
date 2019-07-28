package typings.rxjs.internalObservableFromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeStyleEventEmitter
  extends EventTargetLike[js.Any] {
  def addListener(eventName: String, handler: NodeEventHandler): this.type = js.native
  def addListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
  def removeListener(eventName: String, handler: NodeEventHandler): this.type = js.native
  def removeListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
}

