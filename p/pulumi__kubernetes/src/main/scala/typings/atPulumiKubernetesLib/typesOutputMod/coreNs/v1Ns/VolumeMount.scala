package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * VolumeMount describes a mounting of a Volume within a container.
         */

trait VolumeMount extends js.Object {
  /**
               * Path within the container at which the volume should be mounted.  Must not contain ':'.
               */
  val mountPath: java.lang.String
  /**
               * mountPropagation determines how mounts are propagated from the host to container and the
               * other way around. When not set, MountPropagationHostToContainer is used. This field is
               * alpha in 1.8 and can be reworked or removed in a future release.
               */
  val mountPropagation: java.lang.String
  /**
               * This must match the Name of a Volume.
               */
  val name: java.lang.String
  /**
               * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
               */
  val readOnly: scala.Boolean
  /**
               * Path within the volume from which the container's volume should be mounted. Defaults to ""
               * (volume's root).
               */
  val subPath: java.lang.String
}

