package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrateAnchorElement
  extends StObject
     with HydrateElement {
  
  var href: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object HydrateAnchorElement {
  
  inline def apply(): HydrateAnchorElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HydrateAnchorElement]
  }
  
  extension [Self <: HydrateAnchorElement](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
