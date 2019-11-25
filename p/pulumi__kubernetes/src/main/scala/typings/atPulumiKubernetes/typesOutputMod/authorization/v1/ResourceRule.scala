package typings.atPulumiKubernetes.typesOutputMod.authorization.v1

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
  val apiGroups: js.Array[String]
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set
    * means that everything is allowed.  "*" means all.
    */
  val resourceNames: js.Array[String]
  /**
    * Resources is a list of resources this rule applies to.  "*" means all in the specified
    * apiGroups.
    *  "*&#8205;/foo" represents the subresource 'foo' for all resources in the specified
    * apiGroups.
    */
  val resources: js.Array[String]
  /**
    * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update,
    * delete, proxy.  "*" means all.
    */
  val verbs: js.Array[String]
}

object ResourceRule {
  @scala.inline
  def apply(
    apiGroups: js.Array[String],
    resourceNames: js.Array[String],
    resources: js.Array[String],
    verbs: js.Array[String]
  ): ResourceRule = {
    val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], resourceNames = resourceNames.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceRule]
  }
}

