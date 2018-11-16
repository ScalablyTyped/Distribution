package typings
package rxjsLib.internalObservableFromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeCompatibleEventEmitter extends js.Object {
  def addListener(eventName: java.lang.String, handler: NodeEventHandler): scala.Unit | js.Object
  def removeListener(eventName: java.lang.String, handler: NodeEventHandler): scala.Unit | js.Object
}

