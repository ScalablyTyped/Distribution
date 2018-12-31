package typings
package atProtobufjsEventemitterLib.eventemitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructs a new event emitter instance.
  * @classdesc A minimal event emitter.
  * @memberof util
  * @constructor
  */
@js.native
trait EventEmitter extends js.Object {
  /**
    * Emits an event by calling its listeners with the specified arguments.
    * @param {string} evt Event name
    * @param {...*} args Arguments
    * @returns {util.EventEmitter} `this`
    */
  def emit(evt: java.lang.String, args: js.Any*): EventEmitter = js.native
  /**
    * Removes an event listener or any matching listeners if arguments are omitted.
    * @param {string} [evt] Event name. Removes all listeners if omitted.
    * @param {function} [fn] Listener to remove. Removes all listeners of `evt` if omitted.
    * @returns {util.EventEmitter} `this`
    */
  def off(): EventEmitter = js.native
  def off(evt: java.lang.String): EventEmitter = js.native
  def off(evt: java.lang.String, fn: js.Function0[_]): EventEmitter = js.native
  /**
    * Registers an event listener.
    * @param {string} evt Event name
    * @param {function} fn Listener
    * @param {*} [ctx] Listener context
    * @returns {util.EventEmitter} `this`
    */
  def on(evt: java.lang.String, fn: js.Function0[_]): EventEmitter = js.native
  def on(evt: java.lang.String, fn: js.Function0[_], ctx: js.Any): EventEmitter = js.native
}

