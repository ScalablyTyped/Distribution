package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofsafari extends StObject {
    
    var application: SafariApplication = js.native
    
    var extension: SafariExtension = js.native
    
    var self: SafariExtensionGlobalPage | SafariExtensionBar = js.native
  }
  object Typeofsafari {
    
    @scala.inline
    def apply(
      application: SafariApplication,
      extension: SafariExtension,
      self: SafariExtensionGlobalPage | SafariExtensionBar
    ): Typeofsafari = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofsafari]
    }
    
    @scala.inline
    implicit class TypeofsafariMutableBuilder[Self <: Typeofsafari] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: SafariApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtension(value: SafariExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelf(value: SafariExtensionGlobalPage | SafariExtensionBar): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    }
  }
}
