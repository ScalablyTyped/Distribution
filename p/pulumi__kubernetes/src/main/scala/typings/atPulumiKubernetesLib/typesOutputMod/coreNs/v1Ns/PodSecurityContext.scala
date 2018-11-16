package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * PodSecurityContext holds pod-level security attributes and common container settings. Some
         * fields are also present in container.securityContext.  Field values of
         * container.securityContext take precedence over field values of PodSecurityContext.
         */

trait PodSecurityContext extends js.Object {
  /**
               * A special supplemental group that applies to all containers in a pod. Some volume types
               * allow the Kubelet to change the ownership of that volume to be owned by the pod:
               *
               * 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the
               * volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
               *
               * If unset, the Kubelet will not modify the ownership and permissions of any volume.
               */
  val fsGroup: scala.Double
  /**
               * Indicates that the container must run as a non-root user. If true, the Kubelet will
               * validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to
               * start the container if it does. If unset or false, no such validation will be performed.
               * May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext,
               * the value specified in SecurityContext takes precedence.
               */
  val runAsNonRoot: scala.Boolean
  /**
               * The UID to run the entrypoint of the container process. Defaults to user specified in image
               * metadata if unspecified. May also be set in SecurityContext.  If set in both
               * SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
               * precedence for that container.
               */
  val runAsUser: scala.Double
  /**
               * The SELinux context to be applied to all containers. If unspecified, the container runtime
               * will allocate a random SELinux context for each container.  May also be set in
               * SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value
               * specified in SecurityContext takes precedence for that container.
               */
  val seLinuxOptions: SELinuxOptions
  /**
               * A list of groups applied to the first process run in each container, in addition to the
               * container's primary GID.  If unspecified, no groups will be added to any container.
               */
  val supplementalGroups: js.Array[scala.Double]
}

