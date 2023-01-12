package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardItemOptions extends StObject {
  
  /* standard dom */
  var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
}
object ClipboardItemOptions {
  
  inline def apply(): ClipboardItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipboardItemOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClipboardItemOptions] (val x: Self) extends AnyVal {
    
    inline def setPresentationStyle(value: PresentationStyle): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
    
    inline def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
  }
}
