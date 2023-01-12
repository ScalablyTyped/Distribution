package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegateOptions extends StObject {
  
  /** whether or not to negate any alpha channel. (optional, default true) */
  var alpha: js.UndefOr[Boolean] = js.undefined
}
object NegateOptions {
  
  inline def apply(): NegateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NegateOptions] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
  }
}
