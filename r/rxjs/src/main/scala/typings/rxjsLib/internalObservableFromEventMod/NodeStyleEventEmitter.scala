package typings
package rxjsLib.internalObservableFromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeStyleEventEmitter extends js.Object {
  def addListener(eventName: java.lang.String, handler: NodeEventHandler): this.type = js.native
  def addListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
  def removeListener(eventName: java.lang.String, handler: NodeEventHandler): this.type = js.native
  def removeListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
}

