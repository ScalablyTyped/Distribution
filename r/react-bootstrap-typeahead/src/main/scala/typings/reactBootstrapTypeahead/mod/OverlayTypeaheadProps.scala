package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<any>, 'align' | 'dropup' | 'flip' | 'onMenuHide' | 'onMenuShow' | 'onMenuToggle'> */
trait OverlayTypeaheadProps extends StObject {
  
  var align: js.UndefOr[TypeaheadAlign] = js.undefined
  
  var dropup: js.UndefOr[Boolean] = js.undefined
  
  var flip: js.UndefOr[Boolean] = js.undefined
  
  var onMenuHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMenuShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.undefined
}
object OverlayTypeaheadProps {
  
  @scala.inline
  def apply(): OverlayTypeaheadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayTypeaheadProps]
  }
  
  @scala.inline
  implicit class OverlayTypeaheadPropsMutableBuilder[Self <: OverlayTypeaheadProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: TypeaheadAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setDropup(value: Boolean): Self = StObject.set(x, "dropup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropupUndefined: Self = StObject.set(x, "dropup", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    @scala.inline
    def setOnMenuHide(value: () => Unit): Self = StObject.set(x, "onMenuHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMenuHideUndefined: Self = StObject.set(x, "onMenuHide", js.undefined)
    
    @scala.inline
    def setOnMenuShow(value: () => Unit): Self = StObject.set(x, "onMenuShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMenuShowUndefined: Self = StObject.set(x, "onMenuShow", js.undefined)
    
    @scala.inline
    def setOnMenuToggle(value: /* show */ Boolean => Unit): Self = StObject.set(x, "onMenuToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMenuToggleUndefined: Self = StObject.set(x, "onMenuToggle", js.undefined)
  }
}
