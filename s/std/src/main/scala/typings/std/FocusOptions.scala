package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusOptions extends StObject {
  
  /* standard dom */
  var preventScroll: js.UndefOr[scala.Boolean] = js.undefined
}
object FocusOptions {
  
  inline def apply(): FocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusOptions] (val x: Self) extends AnyVal {
    
    inline def setPreventScroll(value: scala.Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
  }
}
