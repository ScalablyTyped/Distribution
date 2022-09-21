package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, 'transition'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl>> */
trait PickImpltransitionPartialActive
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var dimmable: js.UndefOr[String] = js.undefined
  
  var dimmed: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var hide: js.UndefOr[String] = js.undefined
  
  var pageDimmer: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[String] = js.undefined
  
  var transition: String & js.UndefOr[String]
}
object PickImpltransitionPartialActive {
  
  inline def apply(transition: String & js.UndefOr[String]): PickImpltransitionPartialActive = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransitionPartialActive]
  }
  
  extension [Self <: PickImpltransitionPartialActive](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
    
    inline def setDimmableUndefined: Self = StObject.set(x, "dimmable", js.undefined)
    
    inline def setDimmed(value: String): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
    
    inline def setDimmedUndefined: Self = StObject.set(x, "dimmed", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setPageDimmer(value: String): Self = StObject.set(x, "pageDimmer", value.asInstanceOf[js.Any])
    
    inline def setPageDimmerUndefined: Self = StObject.set(x, "pageDimmer", js.undefined)
    
    inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTransition(value: String & js.UndefOr[String]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
