package typings.puppeteerBrowsers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Revision extends StObject {
    
    var revision: String
    
    var version: String
  }
  object Revision {
    
    inline def apply(revision: String, version: String): Revision = {
      val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Revision]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Revision] (val x: Self) extends AnyVal {
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
