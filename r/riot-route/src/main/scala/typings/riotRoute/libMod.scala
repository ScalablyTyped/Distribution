package typings.riotRoute

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot-route/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  trait RiotRoute extends js.Object {
    /**
      * Execute the given callback when the URL changes.
      */
    def apply(callback: js.Function1[/* repeated */ String, Unit]): Unit = js.native
    /**
      * Execute the given callback when the URL changes and it match the filter.
      * @since v2.3
      */
    def apply(filter: String, callback: js.Function1[/* repeated */ String, Unit]): Unit = js.native
    /**
      * Changes the browser URL and notifies all the listeners assigned with `route(callback)`.
      */
    def apply(to: String): Unit = js.native
    def apply(to: String, title: String): Unit = js.native
    def apply(to: String, title: String, shouldReplace: Boolean): Unit = js.native
    /**
      * Change the base path.
      *
      * @param arg - a new base or '#' or '#!'
      */
    def base(): Unit = js.native
    def base(arg: String): Unit = js.native
    def base(arg: RegExp): Unit = js.native
    /**
      * Returns a new routing context.
      * @since v2.3
      */
    def create(): RiotSubRoute = js.native
    /**
      * Study the current browser path "in place" and emit routing without waiting for it to change.
      */
    def exec(): Unit = js.native
    /**
      * Changes the default parser to a custom one.
      * @param parser
      * @param secondParser
      */
    def parser(parser: js.Function1[/* path */ String, js.Array[_]]): Unit = js.native
    def parser(
      parser: js.Function1[/* path */ String, js.Array[_]],
      secondParser: js.Function2[/* path */ String, /* filter */ String, js.UndefOr[js.Array[String]]]
    ): Unit = js.native
    /**
      * This is an utility function to extract the query from the url.
      * @since v2.3
      */
    def query(): StringDictionary[String] = js.native
    /**
      * Start listening the url changes
      * and also exec routing on the current url.
      */
    def start(): Unit = js.native
    def start(autoStart: Boolean): Unit = js.native
    /**
      * Stop all the routings. It'll removes the listeners and clear also the callbacks.
      */
    def stop(): Unit = js.native
  }
  
  @js.native
  trait RiotSubRoute extends RiotRoute
  
  val default: RiotRoute = js.native
}

