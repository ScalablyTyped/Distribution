package typings.prosemirrorInputrules

import typings.prosemirrorInputrules.mod.InputRule
import typings.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    var from: Double
    
    var text: String
    
    var to: Double
    
    var transform: Transaction
  }
  object From {
    
    inline def apply(from: Double, text: String, to: Double, transform: Transaction): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Transaction): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rules extends StObject {
    
    var rules: js.Array[InputRule]
  }
  object Rules {
    
    inline def apply(rules: js.Array[InputRule]): Rules = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rules]
    }
    
    extension [Self <: Rules](x: Self) {
      
      inline def setRules(value: js.Array[InputRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: InputRule*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
}
