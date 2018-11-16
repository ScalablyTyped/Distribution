package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
         */

trait DeploymentRollback extends js.Object {
  /**
               * APIVersion defines the versioned schema of this representation of an object. Servers should
               * convert recognized schemas to the latest internal value, and may reject unrecognized
               * values. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * Kind is a string value representing the REST resource this object represents. Servers may
               * infer this from the endpoint the client submits requests to. Cannot be updated. In
               * CamelCase. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
               */
  val kind: java.lang.String
  /**
               * Required: This must match the Name of a deployment.
               */
  val name: java.lang.String
  /**
               * The config of this deployment rollback.
               */
  val rollbackTo: RollbackConfig
  /**
               * The annotations to be updated to a deployment
               */
  val updatedAnnotations: ScalablyTyped.runtime.StringDictionary[java.lang.String]
}

