package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Pod Security Policy Spec defines the policy enforced.
         */

trait PodSecurityPolicySpec extends js.Object {
  /**
               * AllowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If
               * unspecified, defaults to true.
               */
  val allowPrivilegeEscalation: scala.Boolean
  /**
               * AllowedCapabilities is a list of capabilities that can be requested to add to the
               * container. Capabilities in this field may be added at the pod author's discretion. You must
               * not list a capability in both AllowedCapabilities and RequiredDropCapabilities.
               */
  val allowedCapabilities: js.Array[java.lang.String]
  /**
               * AllowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
               * Flexvolumes may be used.  This parameter is effective only when the usage of the
               * Flexvolumes is allowed in the "Volumes" field.
               */
  val allowedFlexVolumes: js.Array[AllowedFlexVolume]
  /**
               * is a white list of allowed host paths. Empty indicates that all host paths may be used.
               */
  val allowedHostPaths: js.Array[AllowedHostPath]
  /**
               * DefaultAddCapabilities is the default set of capabilities that will be added to the
               * container unless the pod spec specifically drops the capability.  You may not list a
               * capability in both DefaultAddCapabilities and RequiredDropCapabilities. Capabilities added
               * here are implicitly allowed, and need not be included in the AllowedCapabilities list.
               */
  val defaultAddCapabilities: js.Array[java.lang.String]
  /**
               * DefaultAllowPrivilegeEscalation controls the default setting for whether a process can gain
               * more privileges than its parent process.
               */
  val defaultAllowPrivilegeEscalation: scala.Boolean
  /**
               * FSGroup is the strategy that will dictate what fs group is used by the SecurityContext.
               */
  val fsGroup: FSGroupStrategyOptions
  /**
               * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
               */
  val hostIPC: scala.Boolean
  /**
               * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
               */
  val hostNetwork: scala.Boolean
  /**
               * hostPID determines if the policy allows the use of HostPID in the pod spec.
               */
  val hostPID: scala.Boolean
  /**
               * hostPorts determines which host port ranges are allowed to be exposed.
               */
  val hostPorts: js.Array[HostPortRange]
  /**
               * privileged determines if a pod can request to be run as privileged.
               */
  val privileged: scala.Boolean
  /**
               * ReadOnlyRootFilesystem when set to true will force containers to run with a read only root
               * file system.  If the container specifically requests to run with a non-read only root file
               * system the PSP should deny the pod. If set to false the container may run with a read only
               * root file system if it wishes but it will not be forced to.
               */
  val readOnlyRootFilesystem: scala.Boolean
  /**
               * RequiredDropCapabilities are the capabilities that will be dropped from the container.
               * These are required to be dropped and cannot be added.
               */
  val requiredDropCapabilities: js.Array[java.lang.String]
  /**
               * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
               */
  val runAsUser: RunAsUserStrategyOptions
  /**
               * seLinux is the strategy that will dictate the allowable labels that may be set.
               */
  val seLinux: SELinuxStrategyOptions
  /**
               * SupplementalGroups is the strategy that will dictate what supplemental groups are used by
               * the SecurityContext.
               */
  val supplementalGroups: SupplementalGroupsStrategyOptions
  /**
               * volumes is a white list of allowed volume plugins.  Empty indicates that all plugins may be
               * used.
               */
  val volumes: js.Array[java.lang.String]
}

