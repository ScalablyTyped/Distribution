package typings.rdflib.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flags extends StObject {
  
  /**
    * A string of letters, each of which set an options
    * e.g. `deinprstux`
    */
  var flags: js.UndefOr[String] = js.undefined
  
  /**
    * A set of [prefix, uri] pairs that define namespace prefixes
    */
  var namespaces: js.UndefOr[Record[String, String]] = js.undefined
}
object Flags {
  
  inline def apply(): Flags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flags]
  }
  
  extension [Self <: Flags](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setNamespaces(value: Record[String, String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
  }
}
