package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NSOptions extends StObject {
  
  /**
    * A plain object whose key, value pairs define namespaces known before
    * parsing the XML file. It is not legal to pass bindings for the namespaces
    * ``"xml"`` or ``"xmlns"``.
    */
  var additionalNamespaces: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * A function that will be used if the parser cannot resolve a namespace
    * prefix on its own.
    */
  var resolvePrefix: js.UndefOr[ResolvePrefix] = js.undefined
  
  /** Whether to track namespaces. Unset means ``false``. */
  var xmlns: js.UndefOr[Boolean] = js.undefined
}
object NSOptions {
  
  inline def apply(): NSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NSOptions]
  }
  
  extension [Self <: NSOptions](x: Self) {
    
    inline def setAdditionalNamespaces(value: Record[String, String]): Self = StObject.set(x, "additionalNamespaces", value.asInstanceOf[js.Any])
    
    inline def setAdditionalNamespacesUndefined: Self = StObject.set(x, "additionalNamespaces", js.undefined)
    
    inline def setResolvePrefix(value: /* prefix */ String => js.UndefOr[String]): Self = StObject.set(x, "resolvePrefix", js.Any.fromFunction1(value))
    
    inline def setResolvePrefixUndefined: Self = StObject.set(x, "resolvePrefix", js.undefined)
    
    inline def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
  }
}
