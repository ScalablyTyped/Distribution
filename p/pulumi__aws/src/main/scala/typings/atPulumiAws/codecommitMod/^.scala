package typings.atPulumiAws.codecommitMod

import typings.atPulumiAws.codecommitGetRepositoryMod.GetRepositoryArgs
import typings.atPulumiAws.codecommitGetRepositoryMod.GetRepositoryResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codecommit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getRepository(args: GetRepositoryArgs): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
  def getRepository(args: GetRepositoryArgs, opts: InvokeOptions): js.Promise[GetRepositoryResult] with GetRepositoryResult = js.native
}

