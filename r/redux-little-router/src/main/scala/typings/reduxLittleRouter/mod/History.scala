package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait History extends StObject {
  
  var action: HistoryAction = js.native
  
  def block(callback: BlockCallback): Unsubscribe = js.native
  def block(message: String): Unit = js.native
  
  def go(n: Double): Unit = js.native
  
  def goBack(): Unit = js.native
  
  def goForward(): Unit = js.native
  
  var length: Double = js.native
  
  def listen(callback: ListenCallback): Unsubscribe = js.native
  
  var location: Location = js.native
  
  def push(location: Location): Unit = js.native
  def push(path: String): Unit = js.native
  def push(path: String, state: ObjectLiteral[Any]): Unit = js.native
  
  def replace(location: Location): Unit = js.native
  def replace(path: String): Unit = js.native
  def replace(path: String, state: ObjectLiteral[Any]): Unit = js.native
}
