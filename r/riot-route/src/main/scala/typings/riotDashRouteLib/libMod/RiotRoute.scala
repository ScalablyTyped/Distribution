package typings
package riotDashRouteLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiotRoute extends js.Object {
  /**
    * Execute the given callback when the URL changes.
    */
  def apply(callback: js.Function1[/* repeated */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Execute the given callback when the URL changes and it match the filter.
    * @since v2.3
    */
  def apply(filter: java.lang.String, callback: js.Function1[/* repeated */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Changes the browser URL and notifies all the listeners assigned with `route(callback)`.
    */
  def apply(to: java.lang.String): scala.Unit = js.native
  def apply(to: java.lang.String, title: java.lang.String): scala.Unit = js.native
  def apply(to: java.lang.String, title: java.lang.String, shouldReplace: scala.Boolean): scala.Unit = js.native
  /**
    * Change the base path.
    *
    * @param arg - a new base or '#' or '#!'
    */
  def base(): scala.Unit = js.native
  def base(arg: java.lang.String): scala.Unit = js.native
  def base(arg: stdLib.RegExp): scala.Unit = js.native
  /**
    * Returns a new routing context.
    * @since v2.3
    */
  def create(): RiotSubRoute = js.native
  /**
    * Study the current browser path "in place" and emit routing without waiting for it to change.
    */
  def exec(): scala.Unit = js.native
  /**
    * Changes the default parser to a custom one.
    * @param parser
    * @param secondParser
    */
  def parser(parser: js.Function1[/* path */ java.lang.String, js.Array[_]]): scala.Unit = js.native
  def parser(
    parser: js.Function1[/* path */ java.lang.String, js.Array[_]],
    secondParser: js.Function2[
      /* path */ java.lang.String, 
      /* filter */ java.lang.String, 
      js.UndefOr[js.Array[java.lang.String]]
    ]
  ): scala.Unit = js.native
  /**
    * This is an utility function to extract the query from the url.
    * @since v2.3
    */
  def query(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
    * Start listening the url changes
    * and also exec routing on the current url.
    */
  def start(): scala.Unit = js.native
  def start(autoStart: scala.Boolean): scala.Unit = js.native
  /**
    * Stop all the routings. It'll removes the listeners and clear also the callbacks.
    */
  def stop(): scala.Unit = js.native
}

