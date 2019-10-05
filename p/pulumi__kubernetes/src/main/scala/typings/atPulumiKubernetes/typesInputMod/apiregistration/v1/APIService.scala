package typings.atPulumiKubernetes.typesInputMod.apiregistration.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apiregistrationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[`apiregistrationDOTk8sDOTio/v1`]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.APIService]] = js.undefined
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Spec contains information for locating and communicating with a server
    */
  var spec: js.UndefOr[Input[APIServiceSpec]] = js.undefined
}

object APIService {
  @scala.inline
  def apply(
    apiVersion: Input[`apiregistrationDOTk8sDOTio/v1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.APIService] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[APIServiceSpec] = null
  ): APIService = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIService]
  }
}

