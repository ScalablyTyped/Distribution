package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disable extends StObject {
  
  var disable: Boolean
}
object Disable {
  
  inline def apply(disable: Boolean): Disable = {
    val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disable]
  }
  
  extension [Self <: Disable](x: Self) {
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
  }
}
