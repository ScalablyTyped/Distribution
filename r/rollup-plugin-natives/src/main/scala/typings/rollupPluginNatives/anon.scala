package typings.rollupPluginNatives

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CopyTo extends StObject {
    
    var copyTo: String
    
    var name: String
  }
  object CopyTo {
    
    inline def apply(copyTo: String, name: String): CopyTo = {
      val __obj = js.Dynamic.literal(copyTo = copyTo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyTo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyTo] (val x: Self) extends AnyVal {
      
      inline def setCopyTo(value: String): Self = StObject.set(x, "copyTo", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
