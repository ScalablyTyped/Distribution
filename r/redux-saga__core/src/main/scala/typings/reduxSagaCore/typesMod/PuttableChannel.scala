package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PuttableChannel[T] extends js.Object {
  
  def put(message: T): Unit = js.native
  def put(message: END): Unit = js.native
}
