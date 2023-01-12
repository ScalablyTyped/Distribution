package typings.ssri.anon

import typings.ssri.ssriBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleStrict extends StObject {
  
  var single: js.UndefOr[`false`] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object SingleStrict {
  
  inline def apply(): SingleStrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleStrict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleStrict] (val x: Self) extends AnyVal {
    
    inline def setSingle(value: `false`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
