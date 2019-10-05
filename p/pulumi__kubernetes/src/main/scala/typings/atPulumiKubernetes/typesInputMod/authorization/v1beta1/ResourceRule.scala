package typings.atPulumiKubernetes.typesInputMod.authorization.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceRule is the list of actions the subject is allowed to perform on resources. The list
  * ordering isn't significant, may contain duplicates, and possibly be incomplete.
  */
trait ResourceRule extends js.Object {
  /**
    * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups
    * are specified, any action requested against one of the enumerated resources in any API
    * group will be allowed.  "*" means all.
    */
  var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set
    * means that everything is allowed.  "*" means all.
    */
  var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Resources is a list of resources this rule applies to.  "*" means all in the specified
    * apiGroups.
    *  "*&#8205;/foo" represents the subresource 'foo' for all resources in the specified
    * apiGroups.
    */
  var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update,
    * delete, proxy.  "*" means all.
    */
  var verbs: Input[js.Array[Input[String]]]
}

object ResourceRule {
  @scala.inline
  def apply(
    verbs: Input[js.Array[Input[String]]],
    apiGroups: Input[js.Array[Input[String]]] = null,
    resourceNames: Input[js.Array[Input[String]]] = null,
    resources: Input[js.Array[Input[String]]] = null
  ): ResourceRule = {
    val __obj = js.Dynamic.literal(verbs = verbs.asInstanceOf[js.Any])
    if (apiGroups != null) __obj.updateDynamic("apiGroups")(apiGroups.asInstanceOf[js.Any])
    if (resourceNames != null) __obj.updateDynamic("resourceNames")(resourceNames.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRule]
  }
}

