package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.optionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowsOverdamping extends Interpolation {
  
  var allowsOverdamping: js.UndefOr[Boolean] = js.native
  
  var damping: js.UndefOr[Double] = js.native
  
  var initialVelocity: js.UndefOr[Double] = js.native
  
  var mass: js.UndefOr[Double] = js.native
  
  var stiffness: js.UndefOr[Double] = js.native
  
  var `type`: spring = js.native
}
object AllowsOverdamping {
  
  @scala.inline
  def apply(`type`: spring): AllowsOverdamping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowsOverdamping]
  }
  
  @scala.inline
  implicit class AllowsOverdampingOps[Self <: AllowsOverdamping] (val x: Self) extends AnyVal {
    
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
    def setType(value: spring): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsOverdamping(value: Boolean): Self = this.set("allowsOverdamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowsOverdamping: Self = this.set("allowsOverdamping", js.undefined)
    
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    
    @scala.inline
    def setInitialVelocity(value: Double): Self = this.set("initialVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialVelocity: Self = this.set("initialVelocity", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
  }
}
