package typings
package atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1alpha1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rule is a tuple of APIGroups, APIVersion, and Resources.It is recommended to make sure that
  * all the tuple expansions are valid.
  */
trait Rule extends js.Object {
  /**
    * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present,
    * the length of the slice must be one. Required.
    */
  val apiGroups: js.Array[java.lang.String]
  /**
    * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is
    * present, the length of the slice must be one. Required.
    */
  val apiVersions: js.Array[java.lang.String]
  /**
    * Resources is a list of resources this rule applies to.
    *
    * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all
    * resources, but not subresources. 'pods/ *' means all subresources of pods. '*&#8205;/scale'
    * means all scale subresources. '*&#8205;/ *' means all resources and their subresources.
    *
    * If wildcard is present, the validation rule will ensure resources do not overlap with each
    * other.
    *
    * Depending on the enclosing object, subresources might not be allowed. Required.
    */
  val resources: js.Array[java.lang.String]
}

object Rule {
  @scala.inline
  def apply(
    apiGroups: js.Array[java.lang.String],
    apiVersions: js.Array[java.lang.String],
    resources: js.Array[java.lang.String]
  ): Rule = {
    val __obj = js.Dynamic.literal(apiGroups = apiGroups, apiVersions = apiVersions, resources = resources)
  
    __obj.asInstanceOf[Rule]
  }
}

