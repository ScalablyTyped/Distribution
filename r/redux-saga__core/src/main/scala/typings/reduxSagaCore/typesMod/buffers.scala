package typings.reduxSagaCore.typesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@redux-saga/core/types", "buffers")
@js.native
object buffers extends js.Object {
  
  /**
    * Same as `fixed` but Overflow will silently drop the messages.
    */
  def dropping[T](): Buffer = js.native
  def dropping[T](limit: Double): Buffer = js.native
  
  /**
    * Like `fixed` but Overflow will cause the buffer to expand dynamically.
    */
  def expanding[T](): Buffer = js.native
  def expanding[T](limit: Double): Buffer = js.native
  
  /**
    * New messages will be buffered up to `limit`. Overflow will raise an Error.
    * Omitting a `limit` value will result in a limit of 10.
    */
  def fixed[T](): Buffer = js.native
  def fixed[T](limit: Double): Buffer = js.native
  
  /**
    * No buffering, new messages will be lost if there are no pending takers
    */
  def none[T](): Buffer = js.native
  
  /**
    * Same as `fixed` but Overflow will insert the new message at the end and
    * drop the oldest message in the buffer.
    */
  def sliding[T](): Buffer = js.native
  def sliding[T](limit: Double): Buffer = js.native
}
