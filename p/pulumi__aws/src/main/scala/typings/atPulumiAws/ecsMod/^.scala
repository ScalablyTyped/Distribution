package typings.atPulumiAws.ecsMod

import typings.atPulumiAws.ecsGetClusterMod.GetClusterArgs
import typings.atPulumiAws.ecsGetClusterMod.GetClusterResult
import typings.atPulumiAws.ecsGetContainerDefinitionMod.GetContainerDefinitionArgs
import typings.atPulumiAws.ecsGetContainerDefinitionMod.GetContainerDefinitionResult
import typings.atPulumiAws.ecsGetServiceMod.GetServiceArgs
import typings.atPulumiAws.ecsGetServiceMod.GetServiceResult
import typings.atPulumiAws.ecsGetTaskDefinitionMod.GetTaskDefinitionArgs
import typings.atPulumiAws.ecsGetTaskDefinitionMod.GetTaskDefinitionResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs): js.Promise[GetContainerDefinitionResult] with GetContainerDefinitionResult = js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs, opts: InvokeOptions): js.Promise[GetContainerDefinitionResult] with GetContainerDefinitionResult = js.native
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getTaskDefinition(args: GetTaskDefinitionArgs): js.Promise[GetTaskDefinitionResult] with GetTaskDefinitionResult = js.native
  def getTaskDefinition(args: GetTaskDefinitionArgs, opts: InvokeOptions): js.Promise[GetTaskDefinitionResult] with GetTaskDefinitionResult = js.native
}

