package typings.pulumiAws.getPolicyDocumentMod

import typings.pulumiAws.inputMod.iam.GetPolicyDocumentStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentArgs extends js.Object {
  /**
    * An IAM policy document to import and override the
    * current policy document.  Statements with non-blank `sid`s in the override
    * document will overwrite statements with the same `sid` in the current document.
    * Statements without an `sid` cannot be overwritten.
    */
  val overrideJson: js.UndefOr[String] = js.native
  /**
    * An ID for the policy document.
    */
  val policyId: js.UndefOr[String] = js.native
  /**
    * An IAM policy document to import as a base for the
    * current policy document.  Statements with non-blank `sid`s in the current
    * policy document will overwrite statements with the same `sid` in the source
    * json.  Statements without an `sid` cannot be overwritten.
    */
  val sourceJson: js.UndefOr[String] = js.native
  /**
    * A nested configuration block (described below)
    * configuring one *statement* to be included in the policy document.
    */
  val statements: js.UndefOr[js.Array[GetPolicyDocumentStatement]] = js.native
  /**
    * IAM policy document version. Valid values: `2008-10-17`, `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
    */
  val version: js.UndefOr[String] = js.native
}

object GetPolicyDocumentArgs {
  @scala.inline
  def apply(
    overrideJson: String = null,
    policyId: String = null,
    sourceJson: String = null,
    statements: js.Array[GetPolicyDocumentStatement] = null,
    version: String = null
  ): GetPolicyDocumentArgs = {
    val __obj = js.Dynamic.literal()
    if (overrideJson != null) __obj.updateDynamic("overrideJson")(overrideJson.asInstanceOf[js.Any])
    if (policyId != null) __obj.updateDynamic("policyId")(policyId.asInstanceOf[js.Any])
    if (sourceJson != null) __obj.updateDynamic("sourceJson")(sourceJson.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyDocumentArgs]
  }
}

