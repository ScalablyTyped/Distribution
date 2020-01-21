package typings.pulumiAws.outputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentStatement extends js.Object {
  /**
    * A list of actions that this statement either allows
    * or denies. For example, ``["ec2:RunInstances", "s3:*"]``.
    */
  var actions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A nested configuration block (described below)
    * that defines a further, possibly-service-specific condition that constrains
    * whether this statement applies.
    */
  var conditions: js.UndefOr[js.Array[GetPolicyDocumentStatementCondition]] = js.native
  /**
    * Either "Allow" or "Deny", to specify whether this
    * statement allows or denies the given actions. The default is "Allow".
    */
  var effect: js.UndefOr[String] = js.native
  /**
    * A list of actions that this statement does *not*
    * apply to. Used to apply a policy statement to all actions *except* those
    * listed.
    */
  var notActions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Like `principals` except gives resources that
    * the statement does *not* apply to.
    */
  var notPrincipals: js.UndefOr[js.Array[GetPolicyDocumentStatementNotPrincipal]] = js.native
  /**
    * A list of resource ARNs that this statement
    * does *not* apply to. Used to apply a policy statement to all resources
    * *except* those listed.
    */
  var notResources: js.UndefOr[js.Array[String]] = js.native
  /**
    * A nested configuration block (described below)
    * specifying a resource (or resource pattern) to which this statement applies.
    */
  var principals: js.UndefOr[js.Array[GetPolicyDocumentStatementPrincipal]] = js.native
  /**
    * A list of resource ARNs that this statement applies
    * to. This is required by AWS if used for an IAM policy.
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  /**
    * An ID for the policy statement.
    */
  var sid: js.UndefOr[String] = js.native
}

object GetPolicyDocumentStatement {
  @scala.inline
  def apply(
    actions: js.Array[String] = null,
    conditions: js.Array[GetPolicyDocumentStatementCondition] = null,
    effect: String = null,
    notActions: js.Array[String] = null,
    notPrincipals: js.Array[GetPolicyDocumentStatementNotPrincipal] = null,
    notResources: js.Array[String] = null,
    principals: js.Array[GetPolicyDocumentStatementPrincipal] = null,
    resources: js.Array[String] = null,
    sid: String = null
  ): GetPolicyDocumentStatement = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (notActions != null) __obj.updateDynamic("notActions")(notActions.asInstanceOf[js.Any])
    if (notPrincipals != null) __obj.updateDynamic("notPrincipals")(notPrincipals.asInstanceOf[js.Any])
    if (notResources != null) __obj.updateDynamic("notResources")(notResources.asInstanceOf[js.Any])
    if (principals != null) __obj.updateDynamic("principals")(principals.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (sid != null) __obj.updateDynamic("sid")(sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyDocumentStatement]
  }
}

