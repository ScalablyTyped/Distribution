package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.optionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.accelerateDecelerate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with Interpolation {
  
  var `type`: accelerateDecelerate
}
object `2` {
  
  @scala.inline
  def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("accelerateDecelerate")
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: accelerateDecelerate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
