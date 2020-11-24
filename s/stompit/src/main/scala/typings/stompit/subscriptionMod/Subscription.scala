package typings.stompit.subscriptionMod

import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  def getId(): Double = js.native
  
  def processMessageFrame(error: Null, frame: Writable): Unit = js.native
  def processMessageFrame(error: Error, frame: Writable): Unit = js.native
  
  def unsubscribe(): Unit = js.native
  def unsubscribe(headers: js.Any): Unit = js.native
}
