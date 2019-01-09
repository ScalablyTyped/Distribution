package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /**
    * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
    * passed in JavaScript callback.
    */
  var code: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Options to control which paths/packages should be included or excluded in the zip file containing
    * the code for the AWS lambda.
    */
  var codePathOptions: js.UndefOr[atPulumiPulumiLib.runtimeClosureCodePathsMod.CodePathOptions] = js.undefined
  /**
    * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
    * passed in JavaScript callback.
    */
  var handler: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * A list of IAM policy ARNs to attach to the Function.  Will be used if [role] is not provide.
    * If neither [role] nor [policies] is provided, a default policy of [iam.AWSLambdaFullAccess]
    * will be used instead.
    */
  var policies: js.UndefOr[js.Array[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * A pre-created role to use for the Function. If not provided, [policies] will be used.
    */
  var role: js.UndefOr[atPulumiAwsLib.iamMod.Role] = js.undefined
  /**
    * The Lambda runtime to use.  If not provided, will default to [NodeJS8d10Runtime]
    */
  var runtime: js.UndefOr[atPulumiAwsLib.lambdaRuntimesMod.Runtime] = js.undefined
}

