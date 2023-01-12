package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSetOpts
  extends StObject
     with SetOpts {
  
  /** Whether or not to apply the new styles immediately. Defaults to updating the Ractive-managed style tag (true) */
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
}
object StyleSetOpts {
  
  inline def apply(): StyleSetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSetOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleSetOpts] (val x: Self) extends AnyVal {
    
    inline def setApply(value: Boolean): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
  }
}
