package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNativeMaterialKit.anon.Checked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MKSwitchProperties
  extends StObject
     with TouchableWithoutFeedbackProps {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var offColor: js.UndefOr[String] = js.undefined
  
  var onCheckedChange: js.UndefOr[js.Function1[/* opts */ Checked, Unit]] = js.undefined
  
  var onColor: js.UndefOr[String] = js.undefined
  
  var rippleAniDuration: js.UndefOr[Double] = js.undefined
  
  var rippleColor: js.UndefOr[String] = js.undefined
  
  var thumbAniDuration: js.UndefOr[Double] = js.undefined
  
  var thumbOffColor: js.UndefOr[String] = js.undefined
  
  var thumbOnColor: js.UndefOr[String] = js.undefined
  
  var thumbRadius: js.UndefOr[Double] = js.undefined
  
  var trackLength: js.UndefOr[Double] = js.undefined
  
  var trackSize: js.UndefOr[Double] = js.undefined
}
object MKSwitchProperties {
  
  inline def apply(): MKSwitchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSwitchProperties]
  }
  
  extension [Self <: MKSwitchProperties](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setOffColor(value: String): Self = StObject.set(x, "offColor", value.asInstanceOf[js.Any])
    
    inline def setOffColorUndefined: Self = StObject.set(x, "offColor", js.undefined)
    
    inline def setOnCheckedChange(value: /* opts */ Checked => Unit): Self = StObject.set(x, "onCheckedChange", js.Any.fromFunction1(value))
    
    inline def setOnCheckedChangeUndefined: Self = StObject.set(x, "onCheckedChange", js.undefined)
    
    inline def setOnColor(value: String): Self = StObject.set(x, "onColor", value.asInstanceOf[js.Any])
    
    inline def setOnColorUndefined: Self = StObject.set(x, "onColor", js.undefined)
    
    inline def setRippleAniDuration(value: Double): Self = StObject.set(x, "rippleAniDuration", value.asInstanceOf[js.Any])
    
    inline def setRippleAniDurationUndefined: Self = StObject.set(x, "rippleAniDuration", js.undefined)
    
    inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    inline def setThumbAniDuration(value: Double): Self = StObject.set(x, "thumbAniDuration", value.asInstanceOf[js.Any])
    
    inline def setThumbAniDurationUndefined: Self = StObject.set(x, "thumbAniDuration", js.undefined)
    
    inline def setThumbOffColor(value: String): Self = StObject.set(x, "thumbOffColor", value.asInstanceOf[js.Any])
    
    inline def setThumbOffColorUndefined: Self = StObject.set(x, "thumbOffColor", js.undefined)
    
    inline def setThumbOnColor(value: String): Self = StObject.set(x, "thumbOnColor", value.asInstanceOf[js.Any])
    
    inline def setThumbOnColorUndefined: Self = StObject.set(x, "thumbOnColor", js.undefined)
    
    inline def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    inline def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
    
    inline def setTrackLength(value: Double): Self = StObject.set(x, "trackLength", value.asInstanceOf[js.Any])
    
    inline def setTrackLengthUndefined: Self = StObject.set(x, "trackLength", js.undefined)
    
    inline def setTrackSize(value: Double): Self = StObject.set(x, "trackSize", value.asInstanceOf[js.Any])
    
    inline def setTrackSizeUndefined: Self = StObject.set(x, "trackSize", js.undefined)
  }
}
