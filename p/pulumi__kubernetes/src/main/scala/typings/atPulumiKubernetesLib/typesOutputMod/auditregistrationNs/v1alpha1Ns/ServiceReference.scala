package typings
package atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ServiceReference holds a reference to Service.legacy.k8s.io
         */

trait ServiceReference extends js.Object {
  /**
               * `name` is the name of the service. Required
               */
  val name: java.lang.String
  /**
               * `namespace` is the namespace of the service. Required
               */
  val namespace: java.lang.String
  /**
               * `path` is an optional URL path which will be sent in any request to this service.
               */
  val path: java.lang.String
}

