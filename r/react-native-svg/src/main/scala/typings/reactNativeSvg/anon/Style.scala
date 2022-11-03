package typings.reactNativeSvg.anon

import typings.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style[P /* <: BaseProps */] extends StObject {
  
  var style: P
}
object Style {
  
  inline def apply[P /* <: BaseProps */](style: P): Style[P] = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style[P]]
  }
  
  extension [Self <: Style[?], P /* <: BaseProps */](x: Self & Style[P]) {
    
    inline def setStyle(value: P): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
