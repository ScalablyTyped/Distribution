package typings.reactNativeMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// =======================================================================
//  AnimatedRegion
// =======================================================================
/* Inlined parent react-native.react-native.Animated.AnimationConfig */
/* Inlined parent std.Partial<react-native-maps.react-native-maps.Region> */
@js.native
trait AnimatedRegionTimingConfig extends js.Object {
  
  var delay: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  
  var isInteraction: js.UndefOr[Boolean] = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var latitudeDelta: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  var longitudeDelta: js.UndefOr[Double] = js.native
  
  var useNativeDriver: Boolean = js.native
}
object AnimatedRegionTimingConfig {
  
  @scala.inline
  def apply(useNativeDriver: Boolean): AnimatedRegionTimingConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedRegionTimingConfig]
  }
  
  @scala.inline
  implicit class AnimatedRegionTimingConfigOps[Self <: AnimatedRegionTimingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: /* value */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setIsInteraction(value: Boolean): Self = this.set("isInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInteraction: Self = this.set("isInteraction", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLatitudeDelta(value: Double): Self = this.set("latitudeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitudeDelta: Self = this.set("latitudeDelta", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setLongitudeDelta(value: Double): Self = this.set("longitudeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitudeDelta: Self = this.set("longitudeDelta", js.undefined)
  }
}
