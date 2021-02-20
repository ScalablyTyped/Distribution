package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPHeader describes a custom header to be used in HTTP probes
  */
@js.native
trait HTTPHeader extends StObject {
  
  /**
    * The header field name
    */
  var name: Input[String] = js.native
  
  /**
    * The header field value
    */
  var value: Input[String] = js.native
}
object HTTPHeader {
  
  @scala.inline
  def apply(name: Input[String], value: Input[String]): HTTPHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPHeader]
  }
  
  @scala.inline
  implicit class HTTPHeaderMutableBuilder[Self <: HTTPHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
