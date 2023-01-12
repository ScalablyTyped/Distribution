package typings.storybookPreviewWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Immediate extends StObject {
  
  var immediate: js.UndefOr[Boolean] = js.undefined
}
object Immediate {
  
  inline def apply(): Immediate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Immediate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Immediate] (val x: Self) extends AnyVal {
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
  }
}
