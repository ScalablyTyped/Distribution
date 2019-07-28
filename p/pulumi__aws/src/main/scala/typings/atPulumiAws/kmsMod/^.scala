package typings.atPulumiAws.kmsMod

import typings.atPulumiAws.kmsGetAliasMod.GetAliasArgs
import typings.atPulumiAws.kmsGetAliasMod.GetAliasResult
import typings.atPulumiAws.kmsGetCipherTextMod.GetCipherTextArgs
import typings.atPulumiAws.kmsGetCipherTextMod.GetCipherTextResult
import typings.atPulumiAws.kmsGetKeyMod.GetKeyArgs
import typings.atPulumiAws.kmsGetKeyMod.GetKeyResult
import typings.atPulumiAws.kmsGetSecretMod.GetSecretArgs
import typings.atPulumiAws.kmsGetSecretMod.GetSecretResult
import typings.atPulumiAws.kmsGetSecretsMod.GetSecretsArgs
import typings.atPulumiAws.kmsGetSecretsMod.GetSecretsResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] with GetAliasResult = js.native
  def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] with GetAliasResult = js.native
  def getCipherText(args: GetCipherTextArgs): js.Promise[GetCipherTextResult] with GetCipherTextResult = js.native
  def getCipherText(args: GetCipherTextArgs, opts: InvokeOptions): js.Promise[GetCipherTextResult] with GetCipherTextResult = js.native
  def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecrets(args: GetSecretsArgs): js.Promise[GetSecretsResult] with GetSecretsResult = js.native
  def getSecrets(args: GetSecretsArgs, opts: InvokeOptions): js.Promise[GetSecretsResult] with GetSecretsResult = js.native
}

