package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
       * Returns a DOMStringList object listing the origins of the ancestor browsing contexts, from the parent browsing
       * context to the top-level browsing context.
       */
  val ancestorOrigins: DOMStringList = js.native
  /**
       * Returns the Location object's URL's fragment (includes leading "#" if non-empty).
       * Can be set, to navigate to the same URL with a changed fragment (ignores leading "#").
       */
  var hash: java.lang.String = js.native
  /**
       * Returns the Location object's URL's host and port (if different from the default
       * port for the scheme).
       * Can be set, to navigate to the same URL with a changed host and port.
       */
  var host: java.lang.String = js.native
  /**
       * Returns the Location object's URL's host.
       * Can be set, to navigate to the same URL with a changed host.
       */
  var hostname: java.lang.String = js.native
  /**
       * Returns the Location object's URL.
       * Can be set, to navigate to the given URL.
       */
  var href: java.lang.String = js.native
  /**
       * Returns the Location object's URL's origin.
       */
  val origin: java.lang.String = js.native
  /**
       * Returns the Location object's URL's path.
       * Can be set, to navigate to the same URL with a changed path.
       */
  var pathname: java.lang.String = js.native
  /**
       * Returns the Location object's URL's port.
       * Can be set, to navigate to the same URL with a changed port.
       */
  var port: java.lang.String = js.native
  /**
       * Returns the Location object's URL's scheme.
       * Can be set, to navigate to the same URL with a changed scheme.
       */
  var protocol: java.lang.String = js.native
  /**
       * Returns the Location object's URL's query (includes leading "?" if non-empty).
       * Can be set, to navigate to the same URL with a changed query (ignores leading "?").
       */
  var search: java.lang.String = js.native
  /**
       * Navigates to the given URL.
       */
  def assign(url: java.lang.String): scala.Unit = js.native
  /**
       * Reloads the current page.
       */
  def reload(): scala.Unit = js.native
  /** @deprecated */
  def reload(forcedReload: scala.Boolean): scala.Unit = js.native
  /**
       * Removes the current page from the session history and navigates to the given URL.
       */
  def replace(url: java.lang.String): scala.Unit = js.native
}

@JSGlobal("Location")
@js.native
object Location
  extends ScalablyTyped.runtime.Instantiable0[Location]

