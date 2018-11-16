package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable extends js.Object {
  /**
       * For specified event remove specified callback or all registered callbacks if callback is not passed in
       * @param event Event name or wildcard '*' that matches all events
       * @param callback Callback function to remove
       */
  def off(event: java.lang.String): this.type = js.native
  /**
       * For specified event remove specified callback or all registered callbacks if callback is not passed in
       * @param event Event name or wildcard '*' that matches all events
       * @param callback Callback function to remove
       */
  def off(event: java.lang.String, callback: ObservableCallback): this.type = js.native
  /**
       * Register callback for specified events.
       * Callback is executed each time event is triggered
       * @param event Event name or wildcard '*' that matches all events
       * @param callback Callback function
       */
  def on(event: java.lang.String, callback: ObservableCallback): this.type = js.native
  /**
       * Register callback for specified events.
       * Callback is executed at most once.
       * @param event Event name.
       * @param callback Callback function
       */
  def one(event: java.lang.String, callback: ObservableCallback): this.type = js.native
  /**
       * Execute all callback functions registered for specified list of events
       * @param event Event name
       * @param args Arguments provided to callbacks
       */
  def trigger(event: java.lang.String, args: js.Any*): this.type = js.native
}

