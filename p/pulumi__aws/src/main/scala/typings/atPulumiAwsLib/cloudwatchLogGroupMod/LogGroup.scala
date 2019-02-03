package typings
package atPulumiAwsLib.cloudwatchLogGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup")
@js.native
class LogGroup protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LogGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: LogGroupArgs) = this()
  def this(name: java.lang.String, args: LogGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) specifying the log group.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ARN of the KMS Key to use when encrypting log data. Please note, after the AWS KMS CMK is disassociated from the log group,
    * AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
    * permissions for the CMK whenever the encrypted data is requested.
    */
  val kmsKeyId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the log group. If omitted, Terraform will assign a random, unique name.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specifies the number of days
    * you want to retain log events in the specified log group.
    */
  val retentionInDays: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Creates a new subscription to events fired from this LogGroup to the callback provided,
    * along with options to control the behavior of the subscription.
    *
    * The events will be provided in their decoded form.  Because this event hookup needs to
    * execute code to convert the raw messages, it can only be passed an [EntryPoint] callback,
    * not a [lambda.Function] instance.
    */
  def onDecodedEvent(
    name: java.lang.String,
    callback: atPulumiAwsLib.lambdaLambdaMixinsMod.Callback[atPulumiAwsLib.cloudwatchLogGroupMixinsMod.DecodedLogGroupEvent, scala.Unit]
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  def onDecodedEvent(
    name: java.lang.String,
    callback: atPulumiAwsLib.lambdaLambdaMixinsMod.Callback[atPulumiAwsLib.cloudwatchLogGroupMixinsMod.DecodedLogGroupEvent, scala.Unit],
    args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  def onDecodedEvent(
    name: java.lang.String,
    callback: atPulumiAwsLib.lambdaLambdaMixinsMod.Callback[atPulumiAwsLib.cloudwatchLogGroupMixinsMod.DecodedLogGroupEvent, scala.Unit],
    args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  /**
    * Creates a new subscription to events fired from this LogGroup to the handler provided,
    * along with options to control the behavior of the subscription.
    *
    * The events will be produced in raw (gzipped + base64 encoded) form.
    */
  def onEvent(name: java.lang.String, handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler,
    args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler,
    args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch/logGroup", "LogGroup")
@js.native
object LogGroup extends js.Object {
  /**
    * Get an existing LogGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogGroupMod.LogGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchLogGroupMod.LogGroupState
  ): atPulumiAwsLib.cloudwatchLogGroupMod.LogGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchLogGroupMod.LogGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudwatchLogGroupMod.LogGroup = js.native
}

