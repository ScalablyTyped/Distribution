package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
  */
trait NodeDaemonEndpoints extends StObject {
  
  /**
    * Endpoint on which Kubelet is listening.
    */
  var kubeletEndpoint: DaemonEndpoint
}
object NodeDaemonEndpoints {
  
  inline def apply(kubeletEndpoint: DaemonEndpoint): NodeDaemonEndpoints = {
    val __obj = js.Dynamic.literal(kubeletEndpoint = kubeletEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDaemonEndpoints]
  }
  
  extension [Self <: NodeDaemonEndpoints](x: Self) {
    
    inline def setKubeletEndpoint(value: DaemonEndpoint): Self = StObject.set(x, "kubeletEndpoint", value.asInstanceOf[js.Any])
  }
}
