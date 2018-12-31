package typings
package atPulumiAwsLib.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sqs", "QueueEventSubscription")
@js.native
class QueueEventSubscription protected ()
  extends atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscription {
  def this(name: java.lang.String, queue: atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue, handler: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventHandler, args: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscriptionArgs) = this()
  def this(name: java.lang.String, queue: atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod.Queue, handler: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventHandler, args: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
}

