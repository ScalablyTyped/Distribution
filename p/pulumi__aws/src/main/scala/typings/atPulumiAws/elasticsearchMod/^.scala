package typings.atPulumiAws.elasticsearchMod

import typings.atPulumiAws.elasticsearchGetDomainMod.GetDomainArgs
import typings.atPulumiAws.elasticsearchGetDomainMod.GetDomainResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticsearch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDomain(args: GetDomainArgs): js.Promise[GetDomainResult] with GetDomainResult = js.native
  def getDomain(args: GetDomainArgs, opts: InvokeOptions): js.Promise[GetDomainResult] with GetDomainResult = js.native
}

