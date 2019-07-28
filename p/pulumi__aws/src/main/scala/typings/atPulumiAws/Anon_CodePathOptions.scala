package typings.atPulumiAws

import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iamMod.Role
import typings.atPulumiAws.lambdaRuntimesMod.Runtime
import typings.atPulumiPulumi.runtimeClosureCodePathsMod.CodePathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodePathOptions extends js.Object {
  /**
    * Options to control which paths/packages should be included or excluded in the zip file containing
    * the code for the AWS lambda.
    */
  var codePathOptions: js.UndefOr[CodePathOptions] = js.undefined
  /**
    * A list of IAM policy ARNs to attach to the Function.  Will be used if [role] is not provide.
    * If neither [role] nor [policies] is provided, a default policy of [iam.AWSLambdaFullAccess]
    * will be used instead.
    */
  var policies: js.UndefOr[js.Array[ARN]] = js.undefined
  /**
    * A pre-created role to use for the Function. If not provided, [policies] will be used.
    */
  var role: js.UndefOr[Role] = js.undefined
  /**
    * The Lambda runtime to use.  If not provided, will default to [NodeJS8d10Runtime]
    */
  var runtime: js.UndefOr[Runtime] = js.undefined
}

object Anon_CodePathOptions {
  @scala.inline
  def apply(
    codePathOptions: CodePathOptions = null,
    policies: js.Array[ARN] = null,
    role: Role = null,
    runtime: Runtime = null
  ): Anon_CodePathOptions = {
    val __obj = js.Dynamic.literal()
    if (codePathOptions != null) __obj.updateDynamic("codePathOptions")(codePathOptions)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    if (role != null) __obj.updateDynamic("role")(role)
    if (runtime != null) __obj.updateDynamic("runtime")(runtime)
    __obj.asInstanceOf[Anon_CodePathOptions]
  }
}

