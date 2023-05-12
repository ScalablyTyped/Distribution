package typings.rdfjsTraverser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<@rdfjs/traverser.@rdfjs/traverser/Traverser.Options, 'factory'> */
  trait OmitOptionsfactory extends StObject {
    
    var backward: Boolean
    
    var forward: Boolean
  }
  object OmitOptionsfactory {
    
    inline def apply(backward: Boolean, forward: Boolean): OmitOptionsfactory = {
      val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitOptionsfactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitOptionsfactory] (val x: Self) extends AnyVal {
      
      inline def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
      
      inline def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    }
  }
}
