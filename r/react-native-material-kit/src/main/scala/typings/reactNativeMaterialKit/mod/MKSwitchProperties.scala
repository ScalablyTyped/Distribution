package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNativeMaterialKit.anon.Checked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MKSwitchProperties extends TouchableWithoutFeedbackProps {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var offColor: js.UndefOr[String] = js.native
  
  var onCheckedChange: js.UndefOr[js.Function1[/* opts */ Checked, Unit]] = js.native
  
  var onColor: js.UndefOr[String] = js.native
  
  var rippleAniDuration: js.UndefOr[Double] = js.native
  
  var rippleColor: js.UndefOr[String] = js.native
  
  var thumbAniDuration: js.UndefOr[Double] = js.native
  
  var thumbOffColor: js.UndefOr[String] = js.native
  
  var thumbOnColor: js.UndefOr[String] = js.native
  
  var thumbRadius: js.UndefOr[Double] = js.native
  
  var trackLength: js.UndefOr[Double] = js.native
  
  var trackSize: js.UndefOr[Double] = js.native
}
object MKSwitchProperties {
  
  @scala.inline
  def apply(): MKSwitchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSwitchProperties]
  }
  
  @scala.inline
  implicit class MKSwitchPropertiesMutableBuilder[Self <: MKSwitchProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setOffColor(value: String): Self = StObject.set(x, "offColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffColorUndefined: Self = StObject.set(x, "offColor", js.undefined)
    
    @scala.inline
    def setOnCheckedChange(value: /* opts */ Checked => Unit): Self = StObject.set(x, "onCheckedChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCheckedChangeUndefined: Self = StObject.set(x, "onCheckedChange", js.undefined)
    
    @scala.inline
    def setOnColor(value: String): Self = StObject.set(x, "onColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColorUndefined: Self = StObject.set(x, "onColor", js.undefined)
    
    @scala.inline
    def setRippleAniDuration(value: Double): Self = StObject.set(x, "rippleAniDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleAniDurationUndefined: Self = StObject.set(x, "rippleAniDuration", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    @scala.inline
    def setThumbAniDuration(value: Double): Self = StObject.set(x, "thumbAniDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbAniDurationUndefined: Self = StObject.set(x, "thumbAniDuration", js.undefined)
    
    @scala.inline
    def setThumbOffColor(value: String): Self = StObject.set(x, "thumbOffColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbOffColorUndefined: Self = StObject.set(x, "thumbOffColor", js.undefined)
    
    @scala.inline
    def setThumbOnColor(value: String): Self = StObject.set(x, "thumbOnColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbOnColorUndefined: Self = StObject.set(x, "thumbOnColor", js.undefined)
    
    @scala.inline
    def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
    
    @scala.inline
    def setTrackLength(value: Double): Self = StObject.set(x, "trackLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackLengthUndefined: Self = StObject.set(x, "trackLength", js.undefined)
    
    @scala.inline
    def setTrackSize(value: Double): Self = StObject.set(x, "trackSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackSizeUndefined: Self = StObject.set(x, "trackSize", js.undefined)
  }
}
