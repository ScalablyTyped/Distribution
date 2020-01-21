package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * Required: This must match the Name of a deployment.
    */
  var name: Input[String]
  /**
    * The config of this deployment rollback.
    */
  var rollbackTo: Input[RollbackConfig]
  /**
    * The annotations to be updated to a deployment
    */
  var updatedAnnotations: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object DeploymentRollback {
  @scala.inline
  def apply(
    name: Input[String],
    rollbackTo: Input[RollbackConfig],
    apiVersion: Input[String] = null,
    kind: Input[String] = null,
    updatedAnnotations: Input[StringDictionary[Input[String]]] = null
  ): DeploymentRollback = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rollbackTo = rollbackTo.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updatedAnnotations != null) __obj.updateDynamic("updatedAnnotations")(updatedAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentRollback]
  }
}

