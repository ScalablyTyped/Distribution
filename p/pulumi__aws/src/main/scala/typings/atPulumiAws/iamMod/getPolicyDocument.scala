package typings.atPulumiAws.iamMod

import typings.atPulumiAws.iamGetPolicyDocumentMod.GetPolicyDocumentArgs
import typings.atPulumiAws.iamGetPolicyDocumentMod.GetPolicyDocumentResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "getPolicyDocument")
@js.native
object getPolicyDocument extends js.Object {
  def apply(): js.Promise[GetPolicyDocumentResult] with GetPolicyDocumentResult = js.native
  def apply(args: GetPolicyDocumentArgs): js.Promise[GetPolicyDocumentResult] with GetPolicyDocumentResult = js.native
  def apply(args: GetPolicyDocumentArgs, opts: InvokeOptions): js.Promise[GetPolicyDocumentResult] with GetPolicyDocumentResult = js.native
}

