package typings.riot.riotMod

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
  def off(event: String): this.type = js.native
  def off(event: String, callback: ObservableCallback): this.type = js.native
  /**
    * Register callback for specified events.
    * Callback is executed each time event is triggered
    * @param event Event name or wildcard '*' that matches all events
    * @param callback Callback function
    */
  def on(event: String, callback: ObservableCallback): this.type = js.native
  /**
    * Register callback for specified events.
    * Callback is executed at most once.
    * @param event Event name.
    * @param callback Callback function
    */
  def one(event: String, callback: ObservableCallback): this.type = js.native
  /**
    * Execute all callback functions registered for specified list of events
    * @param event Event name
    * @param args Arguments provided to callbacks
    */
  def trigger(event: String, args: js.Any*): this.type = js.native
}

@JSImport("riot", "observable")
@js.native
object observable extends js.Object {
  def apply(): Observable = js.native
  def apply(el: js.Any): Observable = js.native
}

