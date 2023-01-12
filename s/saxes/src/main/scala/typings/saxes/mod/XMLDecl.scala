package typings.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLDecl extends StObject {
  
  /** The encoding specified by the XML declaration. */
  var encoding: js.UndefOr[String] = js.undefined
  
  /** The value of the standalone parameter */
  var standalone: js.UndefOr[String] = js.undefined
  
  /** The version specified by the XML declaration. */
  var version: js.UndefOr[String] = js.undefined
}
object XMLDecl {
  
  inline def apply(): XMLDecl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLDecl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMLDecl] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setStandalone(value: String): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
