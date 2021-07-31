package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.optionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.accelerate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Factor
  extends StObject
     with Interpolation {
  
  var factor: js.UndefOr[Double] = js.undefined
  
  var `type`: accelerate
}
object Factor {
  
  @scala.inline
  def apply(): Factor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("accelerate")
    __obj.asInstanceOf[Factor]
  }
  
  @scala.inline
  implicit class FactorMutableBuilder[Self <: Factor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    @scala.inline
    def setType(value: accelerate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
