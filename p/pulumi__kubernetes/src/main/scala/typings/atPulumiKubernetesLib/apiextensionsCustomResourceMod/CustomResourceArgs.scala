package typings
package atPulumiKubernetesLib.apiextensionsCustomResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomResourceArgs
  extends /* othersFields */ org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[_]] {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  var apiVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  var kind: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
    */
  var metadata: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
  ] = js.undefined
}

object CustomResourceArgs {
  @scala.inline
  def apply(
    apiVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    kind: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    StringDictionary: /* othersFields */ org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[_]] = null,
    metadata: atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta] = null
  ): CustomResourceArgs = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceArgs]
  }
}

