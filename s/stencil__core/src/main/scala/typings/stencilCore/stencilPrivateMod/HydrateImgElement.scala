package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrateImgElement
  extends StObject
     with HydrateElement {
  
  var src: js.UndefOr[String] = js.undefined
}
object HydrateImgElement {
  
  inline def apply(): HydrateImgElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HydrateImgElement]
  }
  
  extension [Self <: HydrateImgElement](x: Self) {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
