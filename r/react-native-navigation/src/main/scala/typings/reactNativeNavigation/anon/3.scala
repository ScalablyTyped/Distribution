package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.optionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with Interpolation {
  
  var `type`: linear
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linear")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: linear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
