package typings.remarkable

import typings.remarkable.libMod.BlockParsingRule
import typings.remarkable.libMod.CoreParsingRule
import typings.remarkable.libMod.InlineParsingRule
import typings.remarkable.libRulerMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var ruler: ^[BlockParsingRule]
  }
  object `0` {
    
    inline def apply(ruler: ^[BlockParsingRule]): `0` = {
      val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setRuler(value: ^[BlockParsingRule]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var ruler: ^[CoreParsingRule]
  }
  object `1` {
    
    inline def apply(ruler: ^[CoreParsingRule]): `1` = {
      val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setRuler(value: ^[CoreParsingRule]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ruler extends StObject {
    
    var ruler: ^[InlineParsingRule]
  }
  object Ruler {
    
    inline def apply(ruler: ^[InlineParsingRule]): Ruler = {
      val __obj = js.Dynamic.literal(ruler = ruler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ruler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ruler] (val x: Self) extends AnyVal {
      
      inline def setRuler(value: ^[InlineParsingRule]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rules extends StObject {
    
    var rules: typings.remarkable.libMod.Rules
  }
  object Rules {
    
    inline def apply(rules: typings.remarkable.libMod.Rules): Rules = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rules]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
      
      inline def setRules(value: typings.remarkable.libMod.Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
}
