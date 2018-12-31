package typings
package atPulumiAwsLib.kinesisKinesisMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis/kinesisMixins", "StreamEventSubscription")
@js.native
class StreamEventSubscription protected ()
  extends atPulumiAwsLib.lambdaMod.EventSubscription {
  def this(name: java.lang.String, stream: atPulumiAwsLib.kinesisKinesisMixinsMod.kinesisStreamMod.Stream, handler: StreamEventHandler, args: StreamEventSubscriptionArgs) = this()
  def this(name: java.lang.String, stream: atPulumiAwsLib.kinesisKinesisMixinsMod.kinesisStreamMod.Stream, handler: StreamEventHandler, args: StreamEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  val eventSourceMapping: atPulumiAwsLib.lambdaMod.EventSourceMapping = js.native
  val stream: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.kinesisKinesisMixinsMod.kinesisStreamMod.Stream] = js.native
}

