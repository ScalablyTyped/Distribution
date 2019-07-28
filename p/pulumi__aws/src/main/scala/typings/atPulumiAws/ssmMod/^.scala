package typings.atPulumiAws.ssmMod

import typings.atPulumiAws.ssmGetDocumentMod.GetDocumentArgs
import typings.atPulumiAws.ssmGetDocumentMod.GetDocumentResult
import typings.atPulumiAws.ssmGetParameterMod.GetParameterArgs
import typings.atPulumiAws.ssmGetParameterMod.GetParameterResult
import typings.atPulumiAws.ssmParameterTypeMod.ParameterType
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var SecureStringParameter: ParameterType = js.native
  var StringListParameter: ParameterType = js.native
  var StringParameter: ParameterType = js.native
  def getDocument(args: GetDocumentArgs): js.Promise[GetDocumentResult] with GetDocumentResult = js.native
  def getDocument(args: GetDocumentArgs, opts: InvokeOptions): js.Promise[GetDocumentResult] with GetDocumentResult = js.native
  def getParameter(args: GetParameterArgs): js.Promise[GetParameterResult] with GetParameterResult = js.native
  def getParameter(args: GetParameterArgs, opts: InvokeOptions): js.Promise[GetParameterResult] with GetParameterResult = js.native
}

