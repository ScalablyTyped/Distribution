package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateOptions
  extends StObject
     with NavigateOptions1 {
  
  var plain: js.UndefOr[Boolean] = js.undefined
}
object NavigateOptions {
  
  inline def apply(): NavigateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigateOptions] (val x: Self) extends AnyVal {
    
    inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
  }
}
