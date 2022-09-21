package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrateStyleElement
  extends StObject
     with HydrateElement {
  
  var href: js.UndefOr[String] = js.undefined
}
object HydrateStyleElement {
  
  inline def apply(): HydrateStyleElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HydrateStyleElement]
  }
  
  extension [Self <: HydrateStyleElement](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
  }
}
