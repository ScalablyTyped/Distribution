package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StringDictionary
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
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: String
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: String
  /**
    * Required: This must match the Name of a deployment.
    */
  val name: String
  /**
    * The config of this deployment rollback.
    */
  val rollbackTo: RollbackConfig
  /**
    * The annotations to be updated to a deployment
    */
  val updatedAnnotations: StringDictionary[String]
}

object DeploymentRollback {
  @scala.inline
  def apply(
    apiVersion: String,
    kind: String,
    name: String,
    rollbackTo: RollbackConfig,
    updatedAnnotations: StringDictionary[String]
  ): DeploymentRollback = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rollbackTo = rollbackTo.asInstanceOf[js.Any], updatedAnnotations = updatedAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentRollback]
  }
}

