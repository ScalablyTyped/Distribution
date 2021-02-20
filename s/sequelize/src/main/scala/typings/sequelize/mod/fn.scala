package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Utils
// ~~~~~~~
@js.native
trait fn extends StObject {
  
  @JSName("clone")
  var clone_Ffn: fnStatic = js.native
}
object fn {
  
  @scala.inline
  def apply(clone_ : fnStatic): fn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.asInstanceOf[fn]
  }
  
  @scala.inline
  implicit class fnMutableBuilder[Self <: fn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone_(value: fnStatic): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
  }
}
