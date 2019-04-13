package typings
package simpleDashMockLib.simpleDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var Promise: js.UndefOr[stdLib.PromiseConstructorLike] = js.native
  /**
    * Returns a stub function that is also a spy.
    */
  def mock(): Stub[_] = js.native
  /**
    * If obj has already has this function, it is wrapped in a spy. The resulting spy can be turned into a stub by further configuration. Restores with all mocks.
    */
  def mock(obj: js.Any, key: java.lang.String): Stub[_] = js.native
  /**
    * Wraps fn in a spy.
    */
  def mock[T](fn: Fn[T]): Spy[T] = js.native
  /**
    * Wraps fn in a spy and sets this on the obj, restorable with all mocks.
    */
  def mock[T](obj: js.Any, key: java.lang.String, fn: Fn[T]): Stub[T] = js.native
  /**
    * Sets the value on this object. E.g. mock(config, 'title', 'test') is the same as config.title = 'test', but restorable with all mocks.
    */
  def mock[T](obj: js.Any, key: java.lang.String, mockValue: T): T = js.native
  @JSName("mock")
  def mock_T[T](): Stub[T] = js.native
  @JSName("mock")
  def mock_T[T](obj: js.Any, key: java.lang.String): Stub[T] = js.native
  /**
    * Restores all current mocks.
    */
  def restore(): scala.Unit = js.native
  /**
    * Use this if you need to restore only a single mock value or function on an object.
    */
  def restore(obj: js.Any, key: java.lang.String): scala.Unit = js.native
  /**
    * Wraps fn in a spy.
    */
  def spy[T](fn: Fn[T]): Spy[T] = js.native
  /**
    * Returns a stub function that is also a spy.
    */
  def stub(): Stub[_] = js.native
  @JSName("stub")
  def stub_T[T](): Stub[T] = js.native
}

