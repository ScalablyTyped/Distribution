package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonEventEmitter extends StObject {
  
  def addListener(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
  
  def emit(event: EventType): Boolean = js.native
  def emit(event: EventType, eventData: Any): Boolean = js.native
  
  def listenerCount(event: String): Double = js.native
  
  def off(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
  
  def on(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
  
  def once(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
  
  def removeAllListeners(): CommonEventEmitter = js.native
  def removeAllListeners(event: EventType): CommonEventEmitter = js.native
  
  def removeListener(event: EventType, handler: Handler[Any]): CommonEventEmitter = js.native
}
