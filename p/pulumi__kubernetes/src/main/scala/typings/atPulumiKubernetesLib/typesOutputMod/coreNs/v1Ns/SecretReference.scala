package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * SecretReference represents a Secret Reference. It has enough information to retrieve secret
         * in any namespace
         */

trait SecretReference extends js.Object {
  /**
               * Name is unique within a namespace to reference a secret resource.
               */
  val name: java.lang.String
  /**
               * Namespace defines the space within which the secret name must be unique.
               */
  val namespace: java.lang.String
}

