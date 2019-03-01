package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceAccountList is a list of ServiceAccount objects
  */
trait ServiceAccountList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1
  /**
    * List of ServiceAccounts. More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
    */
  val items: js.Array[ServiceAccount]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceAccountList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

object ServiceAccountList {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1,
    items: js.Array[ServiceAccount],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ServiceAccountList,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
  ): ServiceAccountList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ServiceAccountList]
  }
}

