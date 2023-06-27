package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The location (URL) of the object it is linked to. Changes done on it are reflected on the object it relates to. Both the Document and Window interface have such a linked Location, accessible via Document.location and Window.location respectively.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location)
  */
@js.native
trait Location extends StObject {
  
  /**
    * Returns a DOMStringList object listing the origins of the ancestor browsing contexts, from the parent browsing context to the top-level browsing context.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/ancestorOrigins)
    */
  /* standard dom */
  val ancestorOrigins: DOMStringList = js.native
  
  /**
    * Navigates to the given URL.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/assign)
    */
  /* standard dom */
  def assign(url: java.lang.String): Unit = js.native
  def assign(url: URL): Unit = js.native
  
  /**
    * Returns the Location object's URL's fragment (includes leading "#" if non-empty).
    *
    * Can be set, to navigate to the same URL with a changed fragment (ignores leading "#").
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/hash)
    */
  /* standard dom */
  var hash: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's host and port (if different from the default port for the scheme).
    *
    * Can be set, to navigate to the same URL with a changed host and port.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/host)
    */
  /* standard dom */
  var host: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's host.
    *
    * Can be set, to navigate to the same URL with a changed host.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/hostname)
    */
  /* standard dom */
  var hostname: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL.
    *
    * Can be set, to navigate to the given URL.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/href)
    */
  /* standard dom */
  var href: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's origin.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/origin)
    */
  /* standard dom */
  val origin: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's path.
    *
    * Can be set, to navigate to the same URL with a changed path.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/pathname)
    */
  /* standard dom */
  var pathname: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's port.
    *
    * Can be set, to navigate to the same URL with a changed port.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/port)
    */
  /* standard dom */
  var port: java.lang.String = js.native
  
  /**
    * Returns the Location object's URL's scheme.
    *
    * Can be set, to navigate to the same URL with a changed scheme.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/protocol)
    */
  /* standard dom */
  var protocol: java.lang.String = js.native
  
  /**
    * Reloads the current page.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/reload)
    */
  /* standard dom */
  def reload(): Unit = js.native
  
  /**
    * Removes the current page from the session history and navigates to the given URL.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/replace)
    */
  /* standard dom */
  def replace(url: java.lang.String): Unit = js.native
  def replace(url: URL): Unit = js.native
  
  /**
    * Returns the Location object's URL's query (includes leading "?" if non-empty).
    *
    * Can be set, to navigate to the same URL with a changed query (ignores leading "?").
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/search)
    */
  /* standard dom */
  var search: java.lang.String = js.native
}
