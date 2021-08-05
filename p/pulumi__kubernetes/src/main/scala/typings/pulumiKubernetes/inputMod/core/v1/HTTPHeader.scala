package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var name: Input[String]
  
  /**
    * The header field value
    */
  var value: Input[String]
}
object HTTPHeader {
  
  inline def apply(name: Input[String], value: Input[String]): HTTPHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPHeader]
  }
  
  extension [Self <: HTTPHeader](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
