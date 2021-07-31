package typings.rnAppUpgrade

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: Double
    
    var msg: String
    
    var version: Unit
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, msg: String, version: Unit): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Unit): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
