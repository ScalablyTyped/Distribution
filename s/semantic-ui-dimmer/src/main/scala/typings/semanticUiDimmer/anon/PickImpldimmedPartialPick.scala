package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, 'dimmed'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl>> */
trait PickImpldimmedPartialPick
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var dimmable: js.UndefOr[String] = js.undefined
  
  var dimmed: String
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var hide: js.UndefOr[String] = js.undefined
  
  var pageDimmer: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
}
object PickImpldimmedPartialPick {
  
  inline def apply(dimmed: String): PickImpldimmedPartialPick = {
    val __obj = js.Dynamic.literal(dimmed = dimmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmedPartialPick]
  }
  
  extension [Self <: PickImpldimmedPartialPick](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
    
    inline def setDimmableUndefined: Self = StObject.set(x, "dimmable", js.undefined)
    
    inline def setDimmed(value: String): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setPageDimmer(value: String): Self = StObject.set(x, "pageDimmer", value.asInstanceOf[js.Any])
    
    inline def setPageDimmerUndefined: Self = StObject.set(x, "pageDimmer", js.undefined)
    
    inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
