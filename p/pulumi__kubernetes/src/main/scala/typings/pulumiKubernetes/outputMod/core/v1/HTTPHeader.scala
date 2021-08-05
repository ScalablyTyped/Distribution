package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPHeader describes a custom header to be used in HTTP probes
  */
trait HTTPHeader extends StObject {
  
  /**
    * The header field name
    */
  var name: String
  
  /**
    * The header field value
    */
  var value: String
}
object HTTPHeader {
  
  inline def apply(name: String, value: String): HTTPHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPHeader]
  }
  
  extension [Self <: HTTPHeader](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
