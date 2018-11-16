package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * defines the host volume conditions that will be enabled by a policy for pods to use. It
         * requires the path prefix to be defined.
         */

trait AllowedHostPath extends js.Object {
  /**
               * is the path prefix that the host volume must match. It does not support `*`. Trailing
               * slashes are trimmed when validating the path prefix with a host path.
               *
               * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food`
               * or `/etc/foo`
               */
  val pathPrefix: java.lang.String
}

