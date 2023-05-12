package typings.storybookReactDomShim.anon

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disable] (val x: Self) extends AnyVal {
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
  }
}
