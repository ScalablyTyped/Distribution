package typings.reactNativeMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-native.react-native.Animated.AnimationConfig */
/* Inlined parent std.Partial<react-native-maps.react-native-maps.Region> */
@js.native
trait AnimatedRegionSpringConfig extends js.Object {
  var bounciness: js.UndefOr[Double] = js.native
  var damping: js.UndefOr[Double] = js.native
  var friction: js.UndefOr[Double] = js.native
  var isInteraction: js.UndefOr[Boolean] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var latitudeDelta: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var longitudeDelta: js.UndefOr[Double] = js.native
  var mass: js.UndefOr[Double] = js.native
  var overshootClamping: js.UndefOr[Boolean] = js.native
  var restDisplacementThreshold: js.UndefOr[Double] = js.native
  var restSpeedThreshold: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var tension: js.UndefOr[Double] = js.native
  var useNativeDriver: Boolean = js.native
  var velocity: js.UndefOr[Double | Point] = js.native
}

object AnimatedRegionSpringConfig {
  @scala.inline
  def apply(useNativeDriver: Boolean): AnimatedRegionSpringConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedRegionSpringConfig]
  }
  @scala.inline
  implicit class AnimatedRegionSpringConfigOps[Self <: AnimatedRegionSpringConfig] (val x: Self) extends AnyVal {
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
    def setBounciness(value: Double): Self = this.set("bounciness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounciness: Self = this.set("bounciness", js.undefined)
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
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
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    @scala.inline
    def setOvershootClamping(value: Boolean): Self = this.set("overshootClamping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOvershootClamping: Self = this.set("overshootClamping", js.undefined)
    @scala.inline
    def setRestDisplacementThreshold(value: Double): Self = this.set("restDisplacementThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestDisplacementThreshold: Self = this.set("restDisplacementThreshold", js.undefined)
    @scala.inline
    def setRestSpeedThreshold(value: Double): Self = this.set("restSpeedThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestSpeedThreshold: Self = this.set("restSpeedThreshold", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
    @scala.inline
    def setTension(value: Double): Self = this.set("tension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTension: Self = this.set("tension", js.undefined)
    @scala.inline
    def setVelocity(value: Double | Point): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
  
}

