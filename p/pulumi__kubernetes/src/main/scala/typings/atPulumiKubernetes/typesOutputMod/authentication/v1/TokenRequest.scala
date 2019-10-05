package typings.atPulumiKubernetes.typesOutputMod.authentication.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authenticationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenRequest requests a token for a given service account.
  */
trait TokenRequest extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `authenticationDOTk8sDOTio/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.TokenRequest
  val metadata: ObjectMeta
  val spec: TokenRequestSpec
  val status: TokenRequestStatus
}

object TokenRequest {
  @scala.inline
  def apply(
    apiVersion: `authenticationDOTk8sDOTio/v1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.TokenRequest,
    metadata: ObjectMeta,
    spec: TokenRequestSpec,
    status: TokenRequestStatus
  ): TokenRequest = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[TokenRequest]
  }
}

