package typings
package atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIService represents a server for a particular GroupVersion. Name must be "version.group".
  */
trait APIService extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Spec contains information for locating and communicating with a server
    */
  val spec: APIServiceSpec
  /**
    * Status contains derived information about an API server
    */
  val status: APIServiceStatus
}

object APIService {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiregistrationDOTk8sDOTio/v1`,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.APIService,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    spec: APIServiceSpec,
    status: APIServiceStatus
  ): APIService = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[APIService]
  }
}

