package typings.sentryUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyAttrs extends StObject {
  
  var keyAttrs: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxStringLength: js.UndefOr[Double] = js.undefined
}
object KeyAttrs {
  
  inline def apply(): KeyAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyAttrs] (val x: Self) extends AnyVal {
    
    inline def setKeyAttrs(value: js.Array[String]): Self = StObject.set(x, "keyAttrs", value.asInstanceOf[js.Any])
    
    inline def setKeyAttrsUndefined: Self = StObject.set(x, "keyAttrs", js.undefined)
    
    inline def setKeyAttrsVarargs(value: String*): Self = StObject.set(x, "keyAttrs", js.Array(value*))
    
    inline def setMaxStringLength(value: Double): Self = StObject.set(x, "maxStringLength", value.asInstanceOf[js.Any])
    
    inline def setMaxStringLengthUndefined: Self = StObject.set(x, "maxStringLength", js.undefined)
  }
}
