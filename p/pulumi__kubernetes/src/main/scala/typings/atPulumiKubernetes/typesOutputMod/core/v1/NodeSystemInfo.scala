package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
  */
trait NodeSystemInfo extends js.Object {
  /**
    * The Architecture reported by the node
    */
  val architecture: String
  /**
    * Boot ID reported by the node.
    */
  val bootID: String
  /**
    * ContainerRuntime Version reported by the node through runtime remote API (e.g.
    * docker://1.5.0).
    */
  val containerRuntimeVersion: String
  /**
    * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
    */
  val kernelVersion: String
  /**
    * KubeProxy Version reported by the node.
    */
  val kubeProxyVersion: String
  /**
    * Kubelet Version reported by the node.
    */
  val kubeletVersion: String
  /**
    * MachineID reported by the node. For unique machine identification in the cluster this field
    * is preferred. Learn more from man(5) machine-id:
    * http://man7.org/linux/man-pages/man5/machine-id.5.html
    */
  val machineID: String
  /**
    * The Operating System reported by the node
    */
  val operatingSystem: String
  /**
    * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
    */
  val osImage: String
  /**
    * SystemUUID reported by the node. For unique machine identification MachineID is preferred.
    * This field is specific to Red Hat hosts
    * https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html
    */
  val systemUUID: String
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
}

