package typings.storybookApi

import typings.history.mod.Hash
import typings.history.mod.LocationKey
import typings.history.mod.LocationState
import typings.history.mod.Pathname
import typings.history.mod.Search
import typings.std.DOMStringList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @reach/router.@reach/router.WindowLocation */
@js.native
trait WindowLocation extends js.Object {
  /**
    * Returns a DOMStringList object listing the origins of the ancestor browsing contexts, from the parent browsing context to the top-level browsing context.
    */
  val ancestorOrigins: DOMStringList = js.native
  /**
    * Returns the Location object's URL's fragment (includes leading "#" if non-empty).
    * 
    * Can be set, to navigate to the same URL with a changed fragment (ignores leading "#").
    */
  var hash: String with Hash = js.native
  /**
    * Returns the Location object's URL's host and port (if different from the default port for the scheme).
    * 
    * Can be set, to navigate to the same URL with a changed host and port.
    */
  var host: String = js.native
  /**
    * Returns the Location object's URL's host.
    * 
    * Can be set, to navigate to the same URL with a changed host.
    */
  var hostname: String = js.native
  /**
    * Returns the Location object's URL.
    * 
    * Can be set, to navigate to the given URL.
    */
  var href: String = js.native
  var key: js.UndefOr[LocationKey] = js.native
  /**
    * Returns the Location object's URL's origin.
    */
  val origin: String = js.native
  /**
    * Returns the Location object's URL's path.
    * 
    * Can be set, to navigate to the same URL with a changed path.
    */
  var pathname: String with Pathname = js.native
  /**
    * Returns the Location object's URL's port.
    * 
    * Can be set, to navigate to the same URL with a changed port.
    */
  var port: String = js.native
  /**
    * Returns the Location object's URL's scheme.
    * 
    * Can be set, to navigate to the same URL with a changed scheme.
    */
  var protocol: String = js.native
  /**
    * Returns the Location object's URL's query (includes leading "?" if non-empty).
    * 
    * Can be set, to navigate to the same URL with a changed query (ignores leading "?").
    */
  var search: String with Search = js.native
  var state: LocationState = js.native
  /**
    * Navigates to the given URL.
    */
  def assign(url: String): Unit = js.native
  /**
    * Reloads the current page.
    */
  def reload(): Unit = js.native
  /** @deprecated */
  def reload(forcedReload: Boolean): Unit = js.native
  /**
    * Removes the current page from the session history and navigates to the given URL.
    */
  def replace(url: String): Unit = js.native
}

