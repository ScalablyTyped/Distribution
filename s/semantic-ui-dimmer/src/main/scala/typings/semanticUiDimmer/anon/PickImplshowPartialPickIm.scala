package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.DurationSettings._Impl, 'show'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.DurationSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.DurationSettings._Impl>> */
trait PickImplshowPartialPickIm
  extends StObject
     with Param {
  
  var hide: js.UndefOr[Double] = js.undefined
  
  var show: Double
}
object PickImplshowPartialPickIm {
  
  inline def apply(show: Double): PickImplshowPartialPickIm = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowPartialPickIm]
  }
  
  extension [Self <: PickImplshowPartialPickIm](x: Self) {
    
    inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
