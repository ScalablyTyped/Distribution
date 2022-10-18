package typings.reactNativeSvg.libTypescriptLibExtractTypesMod

import typings.reactNative.mod.GestureResponderHandlers
import typings.reactNativeSvg.reactNativeSvgStrings.`box-none`
import typings.reactNativeSvg.reactNativeSvgStrings.`box-only`
import typings.reactNativeSvg.reactNativeSvgStrings.auto
import typings.reactNativeSvg.reactNativeSvgStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponderProps
  extends StObject
     with GestureResponderHandlers {
  
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
}
object ResponderProps {
  
  inline def apply(): ResponderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponderProps]
  }
  
  extension [Self <: ResponderProps](x: Self) {
    
    inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
  }
}
