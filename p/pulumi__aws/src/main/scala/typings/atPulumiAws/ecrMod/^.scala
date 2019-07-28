package typings.atPulumiAws.ecrMod

import typings.atPulumiAws.ecrGetCredentialsMod.GetCredentialsArgs
import typings.atPulumiAws.ecrGetCredentialsMod.GetCredentialsResult
import typings.atPulumiAws.ecrGetImageMod.GetImageArgs
import typings.atPulumiAws.ecrGetImageMod.GetImageResult
import typings.atPulumiAws.ecrGetRepositoryMod.GetRepositoryArgs
import typings.atPulumiAws.ecrGetRepositoryMod.GetRepositoryResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCredentials(args: GetCredentialsArgs): js.Promise[GetCredentialsResult] with GetCredentialsResult = js.native
  def getCredentials(args: GetCredentialsArgs, opts: InvokeOptions): js.Promise[GetCredentialsResult] with GetCredentialsResult = js.native
  def getImage(args: GetImageArgs): js.Promise[GetImageResult] with GetImageResult = js.native
  def getImage(args: GetImageArgs, opts: InvokeOptions): js.Promise[GetImageResult] with GetImageResult = js.native
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
}

