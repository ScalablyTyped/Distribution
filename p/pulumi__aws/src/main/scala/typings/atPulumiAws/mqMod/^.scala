package typings.atPulumiAws.mqMod

import typings.atPulumiAws.mqGetBrokerMod.GetBrokerArgs
import typings.atPulumiAws.mqGetBrokerMod.GetBrokerResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/mq", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getBroker(): js.Promise[GetBrokerResult] with GetBrokerResult = js.native
  def getBroker(args: GetBrokerArgs): js.Promise[GetBrokerResult] with GetBrokerResult = js.native
  def getBroker(args: GetBrokerArgs, opts: InvokeOptions): js.Promise[GetBrokerResult] with GetBrokerResult = js.native
}

