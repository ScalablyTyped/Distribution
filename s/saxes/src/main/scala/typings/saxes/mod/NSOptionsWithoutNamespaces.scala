package typings.saxes.mod

import typings.saxes.saxesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NSOptionsWithoutNamespaces
  extends StObject
     with NSOptions {
  
  @JSName("additionalNamespaces")
  var additionalNamespaces_NSOptionsWithoutNamespaces: Unit
  
  @JSName("resolvePrefix")
  var resolvePrefix_NSOptionsWithoutNamespaces: Unit
  
  @JSName("xmlns")
  var xmlns_NSOptionsWithoutNamespaces: js.UndefOr[`false`] = js.undefined
}
object NSOptionsWithoutNamespaces {
  
  inline def apply(additionalNamespaces: Unit, resolvePrefix: Unit): NSOptionsWithoutNamespaces = {
    val __obj = js.Dynamic.literal(additionalNamespaces = additionalNamespaces.asInstanceOf[js.Any], resolvePrefix = resolvePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NSOptionsWithoutNamespaces]
  }
  
  extension [Self <: NSOptionsWithoutNamespaces](x: Self) {
    
    inline def setAdditionalNamespaces(value: Unit): Self = StObject.set(x, "additionalNamespaces", value.asInstanceOf[js.Any])
    
    inline def setResolvePrefix(value: Unit): Self = StObject.set(x, "resolvePrefix", value.asInstanceOf[js.Any])
    
    inline def setXmlns(value: `false`): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
  }
}
