package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.optionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.overshoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tension extends Interpolation {
  
  var tension: js.UndefOr[Double] = js.native
  
  var `type`: overshoot = js.native
}
object Tension {
  
  @scala.inline
  def apply(`type`: overshoot): Tension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tension]
  }
  
  @scala.inline
  implicit class TensionMutableBuilder[Self <: Tension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    @scala.inline
    def setType(value: overshoot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
