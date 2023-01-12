package typings.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowedComponent extends StObject {
  
  var shadow: js.UndefOr[Double] = js.undefined
}
object ShadowedComponent {
  
  inline def apply(): ShadowedComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowedComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowedComponent] (val x: Self) extends AnyVal {
    
    inline def setShadow(value: Double): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
  }
}
