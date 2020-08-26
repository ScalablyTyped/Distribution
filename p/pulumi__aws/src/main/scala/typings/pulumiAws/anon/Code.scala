package typings.pulumiAws.anon

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.Role
import typings.pulumiAws.runtimesMod.Runtime
import typings.pulumiPulumi.codePathsMod.CodePathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  /**
    * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
    * passed in JavaScript callback.
    */
  var code: js.UndefOr[scala.Nothing] = js.native
  /**
    * Options to control which paths/packages should be included or excluded in the zip file containing
    * the code for the AWS lambda.
    */
  var codePathOptions: js.UndefOr[CodePathOptions] = js.native
  /**
    * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
    * passed in JavaScript callback.
    */
  var handler: js.UndefOr[scala.Nothing] = js.native
  /**
    * A list of IAM policy ARNs to attach to the Function.  Will be used if [role] is not provide.
    * If neither [role] nor [policies] is provided, a default policy of [iam.AWSLambdaFullAccess]
    * will be used instead.
    */
  var policies: js.UndefOr[js.Array[ARN]] = js.native
  /**
    * A pre-created role to use for the Function. If not provided, [policies] will be used.
    */
  var role: js.UndefOr[Role] = js.native
  /**
    * The Lambda runtime to use.  If not provided, will default to [NodeJS8d10Runtime]
    */
  var runtime: js.UndefOr[Runtime] = js.native
}

object Code {
  @scala.inline
  def apply(): Code = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodePathOptions(value: CodePathOptions): Self = this.set("codePathOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodePathOptions: Self = this.set("codePathOptions", js.undefined)
    @scala.inline
    def setPoliciesVarargs(value: ARN*): Self = this.set("policies", js.Array(value :_*))
    @scala.inline
    def setPolicies(value: js.Array[ARN]): Self = this.set("policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
    @scala.inline
    def setRole(value: Role): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRuntime(value: Runtime): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
  }
  
}

