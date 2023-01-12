package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISupports extends StObject {
  
  /** [Property] (Object) */
  var AudioTag: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Object) */
  var GeoLocation: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Object) */
  var SVG: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Object) */
  var Transitions: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Object) */
  var VML: js.UndefOr[Any] = js.undefined
}
object ISupports {
  
  inline def apply(): ISupports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupports]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISupports] (val x: Self) extends AnyVal {
    
    inline def setAudioTag(value: Any): Self = StObject.set(x, "AudioTag", value.asInstanceOf[js.Any])
    
    inline def setAudioTagUndefined: Self = StObject.set(x, "AudioTag", js.undefined)
    
    inline def setGeoLocation(value: Any): Self = StObject.set(x, "GeoLocation", value.asInstanceOf[js.Any])
    
    inline def setGeoLocationUndefined: Self = StObject.set(x, "GeoLocation", js.undefined)
    
    inline def setSVG(value: Any): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    inline def setSVGUndefined: Self = StObject.set(x, "SVG", js.undefined)
    
    inline def setTransitions(value: Any): Self = StObject.set(x, "Transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "Transitions", js.undefined)
    
    inline def setVML(value: Any): Self = StObject.set(x, "VML", value.asInstanceOf[js.Any])
    
    inline def setVMLUndefined: Self = StObject.set(x, "VML", js.undefined)
  }
}
