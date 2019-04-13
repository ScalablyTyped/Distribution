package typings
package simpleDashMockLib.simpleDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stub[T] extends Spy[T] {
  /**
    * An array of behaviours.
    * Note: modifying this array directly is not supported, rather use stub.withActions(actions) if you need to add actions.
    */
  var actions: js.Array[Action[T]] = js.native
  /**
    * setting whether the queue of actions for this stub should repeat.
    * @default true
    */
  var loop: scala.Boolean = js.native
  /**
    * Configures this stub to call this function, returning its return value.
    * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
    */
  def callFn[R](fn: Fn[R]): Stub[R] = js.native
  /**
    * Configures this stub to call the original, unstubbed function, returning its return value.
    * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
    */
  def callOriginal(): Stub[T] = js.native
  /**
    * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
    * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
    */
  def callback(args: js.Any*): Stub[T] = js.native
  /**
    * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
    * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
    */
  def callbackArgWith(cbArgumentIndex: scala.Double, args: js.Any*): Stub[T] = js.native
  /**
    * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
    * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
    */
  def callbackAtIndex(cbArgumentIndex: scala.Double, args: js.Any*): Stub[T] = js.native
  /**
    * Configures this stub to call back with the arguments passed. It will use either the last argument as callback, or the argument at cbArgumentIndex.
    * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
    */
  def callbackWith(args: js.Any*): Stub[T] = js.native
  /**
    * Configures the last configured function or callback to be called in this context, i.e. this will be obj.
    */
  def inThisContext(obj: js.Any): Stub[T] = js.native
  /**
    * Configures the stub to disable looping.
    */
  def noLoop(): Stub[T] = js.native
  /**
    * Configures the stub to return a Promise (where available) rejecting with this error. Same as stub.returnWith(Promise.reject(val)).
    * You can use a custom Promise-conforming library, i.e. simple.Promise = require('bluebird') or simple.Promise = $q.
    */
  def rejectWith[V](`val`: V): Stub[js.Thenable[V]] = js.native
  /**
    * Configures the stub to return a Promise (where available] resolving to this value. Same as stub.returnWith(Promise.resolve(val)).
    * You can use a custom Promise-conforming library, i.e. simple.Promise = require('bluebird') or simple.Promise = $q.
    */
  def resolveWith[V](`val`: V): Stub[js.Thenable[V]] = js.native
  /**
    * Configures this stub to return with this value.
    * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
    */
  def returnWith[R](`val`: R): Stub[R] = js.native
  /**
    * Configures this stub to throw this error.
    * Subsequent calls of this on the same stub (chainable) will queue up different behaviours for each subsequent call of the stub.
    */
  def throwWith(err: stdLib.Error): Stub[T] = js.native
  /**
    * Configures this stub to use the specified array of actions.
    */
  def withActions(): Stub[T] = js.native
  def withActions(actions: js.Array[Action[T]]): Stub[T] = js.native
  /**
    * Configures the stub to enable looping.
    */
  def withLoop(): Stub[T] = js.native
}

