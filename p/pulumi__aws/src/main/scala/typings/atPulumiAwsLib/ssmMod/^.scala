package typings
package atPulumiAwsLib.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDocument(args: atPulumiAwsLib.ssmGetDocumentMod.GetDocumentArgs): js.Promise[atPulumiAwsLib.ssmGetDocumentMod.GetDocumentResult] = js.native
  def getDocument(
    args: atPulumiAwsLib.ssmGetDocumentMod.GetDocumentArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ssmGetDocumentMod.GetDocumentResult] = js.native
  def getParameter(args: atPulumiAwsLib.ssmGetParameterMod.GetParameterArgs): js.Promise[atPulumiAwsLib.ssmGetParameterMod.GetParameterResult] = js.native
  def getParameter(
    args: atPulumiAwsLib.ssmGetParameterMod.GetParameterArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ssmGetParameterMod.GetParameterResult] = js.native
}

