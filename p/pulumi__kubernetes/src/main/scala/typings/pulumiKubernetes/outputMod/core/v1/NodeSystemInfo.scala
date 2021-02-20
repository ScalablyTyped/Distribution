package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
  */
@js.native
trait NodeSystemInfo extends StObject {
  
  /**
    * The Architecture reported by the node
    */
  var architecture: String = js.native
  
  /**
    * Boot ID reported by the node.
    */
  var bootID: String = js.native
  
  /**
    * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
    */
  var containerRuntimeVersion: String = js.native
  
  /**
    * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
    */
  var kernelVersion: String = js.native
  
  /**
    * KubeProxy Version reported by the node.
    */
  var kubeProxyVersion: String = js.native
  
  /**
    * Kubelet Version reported by the node.
    */
  var kubeletVersion: String = js.native
  
  /**
    * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
    */
  var machineID: String = js.native
  
  /**
    * The Operating System reported by the node
    */
  var operatingSystem: String = js.native
  
  /**
    * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
    */
  var osImage: String = js.native
  
  /**
    * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
    */
  var systemUUID: String = js.native
}
object NodeSystemInfo {
  
  @scala.inline
  def apply(
    architecture: String,
    bootID: String,
    containerRuntimeVersion: String,
    kernelVersion: String,
    kubeProxyVersion: String,
    kubeletVersion: String,
    machineID: String,
    operatingSystem: String,
    osImage: String,
    systemUUID: String
  ): NodeSystemInfo = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], bootID = bootID.asInstanceOf[js.Any], containerRuntimeVersion = containerRuntimeVersion.asInstanceOf[js.Any], kernelVersion = kernelVersion.asInstanceOf[js.Any], kubeProxyVersion = kubeProxyVersion.asInstanceOf[js.Any], kubeletVersion = kubeletVersion.asInstanceOf[js.Any], machineID = machineID.asInstanceOf[js.Any], operatingSystem = operatingSystem.asInstanceOf[js.Any], osImage = osImage.asInstanceOf[js.Any], systemUUID = systemUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSystemInfo]
  }
  
  @scala.inline
  implicit class NodeSystemInfoMutableBuilder[Self <: NodeSystemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootID(value: String): Self = StObject.set(x, "bootID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerRuntimeVersion(value: String): Self = StObject.set(x, "containerRuntimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelVersion(value: String): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubeProxyVersion(value: String): Self = StObject.set(x, "kubeProxyVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubeletVersion(value: String): Self = StObject.set(x, "kubeletVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineID(value: String): Self = StObject.set(x, "machineID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsImage(value: String): Self = StObject.set(x, "osImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUUID(value: String): Self = StObject.set(x, "systemUUID", value.asInstanceOf[js.Any])
  }
}
