package typings.reactCoinhive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Authedmine extends StObject {
    
    var authedmine: String
    
    var coinhive: String
  }
  object Authedmine {
    
    @scala.inline
    def apply(authedmine: String, coinhive: String): Authedmine = {
      val __obj = js.Dynamic.literal(authedmine = authedmine.asInstanceOf[js.Any], coinhive = coinhive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authedmine]
    }
    
    @scala.inline
    implicit class AuthedmineMutableBuilder[Self <: Authedmine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthedmine(value: String): Self = StObject.set(x, "authedmine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoinhive(value: String): Self = StObject.set(x, "coinhive", value.asInstanceOf[js.Any])
    }
  }
}
