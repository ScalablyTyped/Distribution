package typings
package atReduxDashSagaCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Dropping extends js.Object {
  /**
    * Same as `fixed` but Overflow will silently drop the messages.
    */
  def dropping[T](): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T] = js.native
  def dropping[T](limit: scala.Double): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T] = js.native
  /**
    * Like `fixed` but Overflow will cause the buffer to expand dynamically.
    */
  def expanding[T](): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T] = js.native
  def expanding[T](limit: scala.Double): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T] = js.native
  /**
    * New messages will be buffered up to `limit`. Overflow will raise an Error.
    * Omitting a `limit` value will result in a limit of 10.
    */
  def fixed[T](): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T] = js.native
  def fixed[T](limit: scala.Double): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T] = js.native
  /**
    * No buffering, new messages will be lost if there are no pending takers
    */
  def none[T](): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T] = js.native
  /**
    * Same as `fixed` but Overflow will insert the new message at the end and
    * drop the oldest message in the buffer.
    */
  def sliding[T](): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T] = js.native
  def sliding[T](limit: scala.Double): atReduxDashSagaTypesLib.atReduxDashSagaTypesMod.Buffer[T] = js.native
}

