package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadLinkOpts extends StObject {
  
  /** Whether or not to follow through any upstream links when resolving the source. */
  var canonical: js.UndefOr[Boolean] = js.undefined
}
object ReadLinkOpts {
  
  inline def apply(): ReadLinkOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadLinkOpts]
  }
  
  extension [Self <: ReadLinkOpts](x: Self) {
    
    inline def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
  }
}
