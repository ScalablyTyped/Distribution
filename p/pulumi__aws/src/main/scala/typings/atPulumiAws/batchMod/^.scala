package typings.atPulumiAws.batchMod

import typings.atPulumiAws.batchGetComputeEnvironmentMod.GetComputeEnvironmentArgs
import typings.atPulumiAws.batchGetComputeEnvironmentMod.GetComputeEnvironmentResult
import typings.atPulumiAws.batchGetJobQueueMod.GetJobQueueArgs
import typings.atPulumiAws.batchGetJobQueueMod.GetJobQueueResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getComputeEnvironment(args: GetComputeEnvironmentArgs): js.Promise[GetComputeEnvironmentResult] with GetComputeEnvironmentResult = js.native
  def getComputeEnvironment(args: GetComputeEnvironmentArgs, opts: InvokeOptions): js.Promise[GetComputeEnvironmentResult] with GetComputeEnvironmentResult = js.native
  def getJobQueue(args: GetJobQueueArgs): js.Promise[GetJobQueueResult] with GetJobQueueResult = js.native
  def getJobQueue(args: GetJobQueueArgs, opts: InvokeOptions): js.Promise[GetJobQueueResult] with GetJobQueueResult = js.native
}

