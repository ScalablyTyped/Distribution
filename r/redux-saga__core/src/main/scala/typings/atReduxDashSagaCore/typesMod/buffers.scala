package typings.atReduxDashSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types", "buffers")
@js.native
object buffers extends js.Object {
  /**
    * Same as `fixed` but Overflow will silently drop the messages.
    */
  def dropping[T](): typings.node.Buffer = js.native
  def dropping[T](limit: Double): typings.node.Buffer = js.native
  /**
    * Like `fixed` but Overflow will cause the buffer to expand dynamically.
    */
  def expanding[T](): typings.node.Buffer = js.native
  def expanding[T](limit: Double): typings.node.Buffer = js.native
  /**
    * New messages will be buffered up to `limit`. Overflow will raise an Error.
    * Omitting a `limit` value will result in a limit of 10.
    */
  def fixed[T](): typings.node.Buffer = js.native
  def fixed[T](limit: Double): typings.node.Buffer = js.native
  /**
    * No buffering, new messages will be lost if there are no pending takers
    */
  def none[T](): typings.node.Buffer = js.native
  /**
    * Same as `fixed` but Overflow will insert the new message at the end and
    * drop the oldest message in the buffer.
    */
  def sliding[T](): typings.node.Buffer = js.native
  def sliding[T](limit: Double): typings.node.Buffer = js.native
}

