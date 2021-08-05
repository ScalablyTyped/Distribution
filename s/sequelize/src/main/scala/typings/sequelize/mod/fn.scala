package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Utils
// ~~~~~~~
trait fn extends StObject {
  
  @JSName("clone")
  var clone_Ffn: fnStatic
}
object fn {
  
  inline def apply(clone_ : fnStatic): fn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.asInstanceOf[fn]
  }
  
  extension [Self <: fn](x: Self) {
    
    inline def setClone_(value: fnStatic): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
  }
}
