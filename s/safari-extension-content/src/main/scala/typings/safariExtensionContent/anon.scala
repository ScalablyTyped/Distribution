package typings.safariExtensionContent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeofsafari extends StObject {
    
    var `extension`: SafariContentExtension
    
    var self: SafariContentWebPage
  }
  object Typeofsafari {
    
    @scala.inline
    def apply(`extension`: SafariContentExtension, self: SafariContentWebPage): Typeofsafari = {
      val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofsafari]
    }
    
    @scala.inline
    implicit class TypeofsafariMutableBuilder[Self <: Typeofsafari] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: SafariContentExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelf(value: SafariContentWebPage): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    }
  }
}
