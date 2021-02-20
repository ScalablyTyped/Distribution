package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var name: js.UndefOr[Input[String]] = js.native
  
  var value: js.UndefOr[Input[String]] = js.native
}
object PodDNSConfigOption {
  
  @scala.inline
  def apply(): PodDNSConfigOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodDNSConfigOption]
  }
  
  @scala.inline
  implicit class PodDNSConfigOptionMutableBuilder[Self <: PodDNSConfigOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
