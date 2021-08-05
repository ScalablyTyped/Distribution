package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLElementDeprecatedTagNameMap extends StObject {
  
  var listing: HTMLPreElement
  
  var xmp: HTMLPreElement
}
object HTMLElementDeprecatedTagNameMap {
  
  inline def apply(listing: HTMLPreElement, xmp: HTMLPreElement): HTMLElementDeprecatedTagNameMap = {
    val __obj = js.Dynamic.literal(listing = listing.asInstanceOf[js.Any], xmp = xmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElementDeprecatedTagNameMap]
  }
  
  extension [Self <: HTMLElementDeprecatedTagNameMap](x: Self) {
    
    inline def setListing(value: HTMLPreElement): Self = StObject.set(x, "listing", value.asInstanceOf[js.Any])
    
    inline def setXmp(value: HTMLPreElement): Self = StObject.set(x, "xmp", value.asInstanceOf[js.Any])
  }
}
