package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapCalloutProps
  extends StObject
     with ViewProps {
  
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[`0`], Unit]] = js.undefined
  
  var tooltip: js.UndefOr[Boolean] = js.undefined
}
object MapCalloutProps {
  
  inline def apply(): MapCalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCalloutProps]
  }
  
  extension [Self <: MapCalloutProps](x: Self) {
    
    inline def setOnPress(value: /* event */ MapEvent[`0`] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
