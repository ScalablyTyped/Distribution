package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullscreenOptions extends StObject {
  
  /* standard dom */
  var navigationUI: js.UndefOr[FullscreenNavigationUI] = js.undefined
}
object FullscreenOptions {
  
  inline def apply(): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullscreenOptions] (val x: Self) extends AnyVal {
    
    inline def setNavigationUI(value: FullscreenNavigationUI): Self = StObject.set(x, "navigationUI", value.asInstanceOf[js.Any])
    
    inline def setNavigationUIUndefined: Self = StObject.set(x, "navigationUI", js.undefined)
  }
}
