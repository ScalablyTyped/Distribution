package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.optionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.decelerate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with Interpolation {
  
  var factor: js.UndefOr[Double] = js.undefined
  
  var `type`: decelerate
}
object Type {
  
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("decelerate")
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    @scala.inline
    def setType(value: decelerate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
