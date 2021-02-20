package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISupports extends StObject {
  
  /** [Property] (Object) */
  var AudioTag: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var GeoLocation: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var SVG: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var Transitions: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var VML: js.UndefOr[js.Any] = js.native
}
object ISupports {
  
  @scala.inline
  def apply(): ISupports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupports]
  }
  
  @scala.inline
  implicit class ISupportsMutableBuilder[Self <: ISupports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioTag(value: js.Any): Self = StObject.set(x, "AudioTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTagUndefined: Self = StObject.set(x, "AudioTag", js.undefined)
    
    @scala.inline
    def setGeoLocation(value: js.Any): Self = StObject.set(x, "GeoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoLocationUndefined: Self = StObject.set(x, "GeoLocation", js.undefined)
    
    @scala.inline
    def setSVG(value: js.Any): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVGUndefined: Self = StObject.set(x, "SVG", js.undefined)
    
    @scala.inline
    def setTransitions(value: js.Any): Self = StObject.set(x, "Transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsUndefined: Self = StObject.set(x, "Transitions", js.undefined)
    
    @scala.inline
    def setVML(value: js.Any): Self = StObject.set(x, "VML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVMLUndefined: Self = StObject.set(x, "VML", js.undefined)
  }
}
