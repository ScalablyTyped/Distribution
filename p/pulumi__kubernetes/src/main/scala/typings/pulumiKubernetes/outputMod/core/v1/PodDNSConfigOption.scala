package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodDNSConfigOption defines DNS resolver options of a pod.
  */
@js.native
trait PodDNSConfigOption extends StObject {
  
  /**
    * Required.
    */
  var name: String = js.native
  
  var value: String = js.native
}
object PodDNSConfigOption {
  
  @scala.inline
  def apply(name: String, value: String): PodDNSConfigOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDNSConfigOption]
  }
  
  @scala.inline
  implicit class PodDNSConfigOptionMutableBuilder[Self <: PodDNSConfigOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
