package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter extends js.Object {
  
  def addListener(event: EventType, handler: Handler[_]): EventEmitter = js.native
  
  def emit(event: EventType): Boolean = js.native
  def emit(event: EventType, eventData: js.Any): Boolean = js.native
  
  def listenerCount(event: String): Double = js.native
  
  def off(event: EventType, handler: Handler[_]): EventEmitter = js.native
  
  def on(event: EventType, handler: Handler[_]): EventEmitter = js.native
  
  def once(event: EventType, handler: Handler[_]): EventEmitter = js.native
  
  def removeAllListeners(): EventEmitter = js.native
  def removeAllListeners(event: EventType): EventEmitter = js.native
  
  def removeListener(event: EventType, handler: Handler[_]): EventEmitter = js.native
}
