package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsObject extends StObject {
  
  var options: js.Object
}
object OptionsObject {
  
  inline def apply(options: js.Object): OptionsObject = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsObject] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
