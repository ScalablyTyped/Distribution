package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The URL interface represents an object providing static methods used for creating object URLs. */
trait URL extends StObject {
  
  var hash: java.lang.String
  
  var host: java.lang.String
  
  var hostname: java.lang.String
  
  var href: java.lang.String
  
  val origin: java.lang.String
  
  var password: java.lang.String
  
  var pathname: java.lang.String
  
  var port: java.lang.String
  
  var protocol: java.lang.String
  
  var search: java.lang.String
  
  val searchParams: URLSearchParams
  
  def toJSON(): java.lang.String
  
  var username: java.lang.String
}
object URL {
  
  @scala.inline
  def apply(
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
    searchParams: URLSearchParams,
    toJSON: () => java.lang.String,
    username: java.lang.String
  ): URL = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[URL]
  }
  
  @scala.inline
  implicit class URLMutableBuilder[Self <: URL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: java.lang.String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: java.lang.String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: java.lang.String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathname(value: java.lang.String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: java.lang.String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: java.lang.String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchParams(value: URLSearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => java.lang.String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUsername(value: java.lang.String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
