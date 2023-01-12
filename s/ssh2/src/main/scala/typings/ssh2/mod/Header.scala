package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  /**
    * Any text that comes after the software name/version.
    */
  var comments: String
  
  /**
    * Any greeting sent by the server
    */
  var greeting: js.UndefOr[String] = js.undefined
  
  /**
    * The raw identification string sent by the remote party.
    */
  var identRaw: String
  
  /**
    * Contains various version information parsed from identRaw.
    */
  var versions: Versions
}
object Header {
  
  inline def apply(comments: String, identRaw: String, versions: Versions): Header = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], identRaw = identRaw.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setGreeting(value: String): Self = StObject.set(x, "greeting", value.asInstanceOf[js.Any])
    
    inline def setGreetingUndefined: Self = StObject.set(x, "greeting", js.undefined)
    
    inline def setIdentRaw(value: String): Self = StObject.set(x, "identRaw", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: Versions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
  }
}
