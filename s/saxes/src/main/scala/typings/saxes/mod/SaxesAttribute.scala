package typings.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.saxes.mod.SaxesAttributeNS
  - typings.saxes.mod.SaxesAttributePlain
*/
trait SaxesAttribute extends StObject
object SaxesAttribute {
  
  inline def SaxesAttributeNS(local: String, name: String, prefix: String, uri: String, value: String): typings.saxes.mod.SaxesAttributeNS = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.saxes.mod.SaxesAttributeNS]
  }
  
  inline def SaxesAttributePlain(name: String, value: String): typings.saxes.mod.SaxesAttributePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.saxes.mod.SaxesAttributePlain]
  }
}
