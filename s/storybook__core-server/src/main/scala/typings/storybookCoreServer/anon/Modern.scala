package typings.storybookCoreServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modern extends StObject {
  
  var modern: js.UndefOr[Boolean] = js.undefined
}
object Modern {
  
  inline def apply(): Modern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Modern] (val x: Self) extends AnyVal {
    
    inline def setModern(value: Boolean): Self = StObject.set(x, "modern", value.asInstanceOf[js.Any])
    
    inline def setModernUndefined: Self = StObject.set(x, "modern", js.undefined)
  }
}
