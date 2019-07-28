package typings.atPulumiAws.secretsmanagerMod

import typings.atPulumiAws.secretsmanagerGetSecretMod.GetSecretArgs
import typings.atPulumiAws.secretsmanagerGetSecretMod.GetSecretResult
import typings.atPulumiAws.secretsmanagerGetSecretVersionMod.GetSecretVersionArgs
import typings.atPulumiAws.secretsmanagerGetSecretVersionMod.GetSecretVersionResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/secretsmanager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getSecret(): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecretVersion(args: GetSecretVersionArgs): js.Promise[GetSecretVersionResult] with GetSecretVersionResult = js.native
  def getSecretVersion(args: GetSecretVersionArgs, opts: InvokeOptions): js.Promise[GetSecretVersionResult] with GetSecretVersionResult = js.native
}

