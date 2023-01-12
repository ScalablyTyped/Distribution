package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLHyperlinkElementUtils extends StObject {
  
  /**
    * Returns the hyperlink's URL's fragment (includes leading "#" if non-empty).
    *
    * Can be set, to change the URL's fragment (ignores leading "#").
    */
  /* standard dom */
  var hash: java.lang.String
  
  /**
    * Returns the hyperlink's URL's host and port (if different from the default port for the scheme).
    *
    * Can be set, to change the URL's host and port.
    */
  /* standard dom */
  var host: java.lang.String
  
  /**
    * Returns the hyperlink's URL's host.
    *
    * Can be set, to change the URL's host.
    */
  /* standard dom */
  var hostname: java.lang.String
  
  /**
    * Returns the hyperlink's URL.
    *
    * Can be set, to change the URL.
    */
  /* standard dom */
  var href: java.lang.String
  
  /** Returns the hyperlink's URL's origin. */
  /* standard dom */
  val origin: java.lang.String
  
  /**
    * Returns the hyperlink's URL's password.
    *
    * Can be set, to change the URL's password.
    */
  /* standard dom */
  var password: java.lang.String
  
  /**
    * Returns the hyperlink's URL's path.
    *
    * Can be set, to change the URL's path.
    */
  /* standard dom */
  var pathname: java.lang.String
  
  /**
    * Returns the hyperlink's URL's port.
    *
    * Can be set, to change the URL's port.
    */
  /* standard dom */
  var port: java.lang.String
  
  /**
    * Returns the hyperlink's URL's scheme.
    *
    * Can be set, to change the URL's scheme.
    */
  /* standard dom */
  var protocol: java.lang.String
  
  /**
    * Returns the hyperlink's URL's query (includes leading "?" if non-empty).
    *
    * Can be set, to change the URL's query (ignores leading "?").
    */
  /* standard dom */
  var search: java.lang.String
  
  /**
    * Returns the hyperlink's URL's username.
    *
    * Can be set, to change the URL's username.
    */
  /* standard dom */
  var username: java.lang.String
}
object HTMLHyperlinkElementUtils {
  
  inline def apply(
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    href: java.lang.String,
    origin: java.lang.String,
    password: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    search: java.lang.String,
    username: java.lang.String
  ): HTMLHyperlinkElementUtils = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLHyperlinkElementUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLHyperlinkElementUtils] (val x: Self) extends AnyVal {
    
    inline def setHash(value: java.lang.String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: java.lang.String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: java.lang.String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: java.lang.String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPort(value: java.lang.String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: java.lang.String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: java.lang.String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
