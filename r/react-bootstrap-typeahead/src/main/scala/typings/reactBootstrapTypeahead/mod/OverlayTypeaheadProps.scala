package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<any>, 'align' | 'dropup' | 'flip' | 'onMenuToggle'> */
trait OverlayTypeaheadProps extends StObject {
  
  var align: js.UndefOr[TypeaheadAlign] = js.undefined
  
  var dropup: js.UndefOr[Boolean] = js.undefined
  
  var flip: js.UndefOr[Boolean] = js.undefined
  
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.undefined
}
object OverlayTypeaheadProps {
  
  inline def apply(): OverlayTypeaheadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayTypeaheadProps]
  }
  
  extension [Self <: OverlayTypeaheadProps](x: Self) {
    
    inline def setAlign(value: TypeaheadAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setDropup(value: Boolean): Self = StObject.set(x, "dropup", value.asInstanceOf[js.Any])
    
    inline def setDropupUndefined: Self = StObject.set(x, "dropup", js.undefined)
    
    inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    inline def setOnMenuToggle(value: /* show */ Boolean => Unit): Self = StObject.set(x, "onMenuToggle", js.Any.fromFunction1(value))
    
    inline def setOnMenuToggleUndefined: Self = StObject.set(x, "onMenuToggle", js.undefined)
  }
}
