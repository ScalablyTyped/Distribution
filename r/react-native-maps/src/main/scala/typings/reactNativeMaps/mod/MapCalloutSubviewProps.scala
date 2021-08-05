package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapCalloutSubviewProps
  extends StObject
     with ViewProps {
  
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[`1`], Unit]] = js.undefined
}
object MapCalloutSubviewProps {
  
  inline def apply(): MapCalloutSubviewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapCalloutSubviewProps]
  }
  
  extension [Self <: MapCalloutSubviewProps](x: Self) {
    
    inline def setOnPress(value: /* event */ MapEvent[`1`] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
  }
}
