package typings
package atPulumiAwsLib.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/secretsmanager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getSecret(): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretResult] = js.native
  def getSecret(args: atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretArgs): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretResult] = js.native
  def getSecret(
    args: atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretMod.GetSecretResult] = js.native
  def getSecretVersion(args: atPulumiAwsLib.secretsmanagerGetSecretVersionMod.GetSecretVersionArgs): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretVersionMod.GetSecretVersionResult] = js.native
  def getSecretVersion(
    args: atPulumiAwsLib.secretsmanagerGetSecretVersionMod.GetSecretVersionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.secretsmanagerGetSecretVersionMod.GetSecretVersionResult] = js.native
}

