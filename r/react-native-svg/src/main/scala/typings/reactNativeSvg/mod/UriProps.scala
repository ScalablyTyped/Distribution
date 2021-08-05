package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriProps
  extends StObject
     with SvgProps {
  
  var `override`: js.UndefOr[SvgProps] = js.undefined
  
  var uri: String | Null
}
object UriProps {
  
  inline def apply(): UriProps = {
    val __obj = js.Dynamic.literal(uri = null)
    __obj.asInstanceOf[UriProps]
  }
  
  extension [Self <: UriProps](x: Self) {
    
    inline def setOverride(value: SvgProps): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
  }
}
