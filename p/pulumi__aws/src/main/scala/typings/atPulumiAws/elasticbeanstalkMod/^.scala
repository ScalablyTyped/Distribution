package typings.atPulumiAws.elasticbeanstalkMod

import typings.atPulumiAws.elasticbeanstalkGetApplicationMod.GetApplicationArgs
import typings.atPulumiAws.elasticbeanstalkGetApplicationMod.GetApplicationResult
import typings.atPulumiAws.elasticbeanstalkGetHostedZoneMod.GetHostedZoneArgs
import typings.atPulumiAws.elasticbeanstalkGetHostedZoneMod.GetHostedZoneResult
import typings.atPulumiAws.elasticbeanstalkGetSolutionStackMod.GetSolutionStackArgs
import typings.atPulumiAws.elasticbeanstalkGetSolutionStackMod.GetSolutionStackResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getApplication(args: GetApplicationArgs): js.Promise[GetApplicationResult] with GetApplicationResult = js.native
  def getApplication(args: GetApplicationArgs, opts: InvokeOptions): js.Promise[GetApplicationResult] with GetApplicationResult = js.native
  def getHostedZone(): js.Promise[GetHostedZoneResult] with GetHostedZoneResult = js.native
  def getHostedZone(args: GetHostedZoneArgs): js.Promise[GetHostedZoneResult] with GetHostedZoneResult = js.native
  def getHostedZone(args: GetHostedZoneArgs, opts: InvokeOptions): js.Promise[GetHostedZoneResult] with GetHostedZoneResult = js.native
  def getSolutionStack(args: GetSolutionStackArgs): js.Promise[GetSolutionStackResult] with GetSolutionStackResult = js.native
  def getSolutionStack(args: GetSolutionStackArgs, opts: InvokeOptions): js.Promise[GetSolutionStackResult] with GetSolutionStackResult = js.native
}

