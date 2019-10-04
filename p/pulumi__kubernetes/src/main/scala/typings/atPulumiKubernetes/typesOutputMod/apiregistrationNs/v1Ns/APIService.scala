package typings.atPulumiKubernetes.typesOutputMod.apiregistrationNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apiregistrationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
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
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `apiregistrationDOTk8sDOTio/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.APIService
  val metadata: ObjectMeta
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
    apiVersion: `apiregistrationDOTk8sDOTio/v1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.APIService,
    metadata: ObjectMeta,
    spec: APIServiceSpec,
    status: APIServiceStatus
  ): APIService = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[APIService]
  }
}

