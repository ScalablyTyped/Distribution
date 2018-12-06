package typings
package atPulumiKubernetesLib.typesOutputMod.storageNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * VolumeError captures an error encountered during a volume operation.
         */

trait VolumeError extends js.Object {
  /**
               * String detailing the error encountered during Attach or Detach operation. This string maybe
               * logged, so it should not contain sensitive information.
               */
  val message: java.lang.String
  /**
               * Time the error was encountered.
               */
  val time: java.lang.String
}

