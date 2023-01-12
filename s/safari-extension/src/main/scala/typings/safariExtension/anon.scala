package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeofsafari extends StObject {
    
    var application: SafariApplication
    
    var `extension`: SafariExtension
    
    var self: SafariExtensionGlobalPage | SafariExtensionBar
  }
  object Typeofsafari {
    
    inline def apply(
      application: SafariApplication,
      `extension`: SafariExtension,
      self: SafariExtensionGlobalPage | SafariExtensionBar
    ): Typeofsafari = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofsafari]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeofsafari] (val x: Self) extends AnyVal {
      
      inline def setApplication(value: SafariApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: SafariExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setSelf(value: SafariExtensionGlobalPage | SafariExtensionBar): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    }
  }
}
