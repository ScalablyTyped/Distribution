package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val architecture: java.lang.String
  /**
    * Boot ID reported by the node.
    */
  val bootID: java.lang.String
  /**
    * ContainerRuntime Version reported by the node through runtime remote API (e.g.
    * docker://1.5.0).
    */
  val containerRuntimeVersion: java.lang.String
  /**
    * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
    */
  val kernelVersion: java.lang.String
  /**
    * KubeProxy Version reported by the node.
    */
  val kubeProxyVersion: java.lang.String
  /**
    * Kubelet Version reported by the node.
    */
  val kubeletVersion: java.lang.String
  /**
    * MachineID reported by the node. For unique machine identification in the cluster this field
    * is preferred. Learn more from man(5) machine-id:
    * http://man7.org/linux/man-pages/man5/machine-id.5.html
    */
  val machineID: java.lang.String
  /**
    * The Operating System reported by the node
    */
  val operatingSystem: java.lang.String
  /**
    * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
    */
  val osImage: java.lang.String
  /**
    * SystemUUID reported by the node. For unique machine identification MachineID is preferred.
    * This field is specific to Red Hat hosts
    * https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html
    */
  val systemUUID: java.lang.String
}

object NodeSystemInfo {
  @scala.inline
  def apply(
    architecture: java.lang.String,
    bootID: java.lang.String,
    containerRuntimeVersion: java.lang.String,
    kernelVersion: java.lang.String,
    kubeProxyVersion: java.lang.String,
    kubeletVersion: java.lang.String,
    machineID: java.lang.String,
    operatingSystem: java.lang.String,
    osImage: java.lang.String,
    systemUUID: java.lang.String
  ): NodeSystemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("architecture")(architecture)
    __obj.updateDynamic("bootID")(bootID)
    __obj.updateDynamic("containerRuntimeVersion")(containerRuntimeVersion)
    __obj.updateDynamic("kernelVersion")(kernelVersion)
    __obj.updateDynamic("kubeProxyVersion")(kubeProxyVersion)
    __obj.updateDynamic("kubeletVersion")(kubeletVersion)
    __obj.updateDynamic("machineID")(machineID)
    __obj.updateDynamic("operatingSystem")(operatingSystem)
    __obj.updateDynamic("osImage")(osImage)
    __obj.updateDynamic("systemUUID")(systemUUID)
    __obj.asInstanceOf[NodeSystemInfo]
  }
}

