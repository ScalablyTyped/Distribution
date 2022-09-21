package typings.reactNativeSvg.typesMod

import typings.reactNative.mod.LayoutChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeProps extends StObject {
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
}
object NativeProps {
  
  inline def apply(): NativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeProps]
  }
  
  extension [Self <: NativeProps](x: Self) {
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
  }
}
