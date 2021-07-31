package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.
  */
trait HostAlias extends StObject {
  
  /**
    * Hostnames for the above IP address.
    */
  var hostnames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * IP address of the host file entry.
    */
  var ip: js.UndefOr[Input[String]] = js.undefined
}
object HostAlias {
  
  @scala.inline
  def apply(): HostAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostAlias]
  }
  
  @scala.inline
  implicit class HostAliasMutableBuilder[Self <: HostAlias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostnames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "hostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnamesUndefined: Self = StObject.set(x, "hostnames", js.undefined)
    
    @scala.inline
    def setHostnamesVarargs(value: Input[String]*): Self = StObject.set(x, "hostnames", js.Array(value :_*))
    
    @scala.inline
    def setIp(value: Input[String]): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
  }
}
