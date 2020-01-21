package typings.pulumiAws.logGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogGroupArgs extends js.Object {
  /**
    * The ARN of the KMS Key to use when encrypting log data. Please note, after the AWS KMS CMK is disassociated from the log group,
    * AWS CloudWatch Logs stops encrypting newly ingested data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
    * permissions for the CMK whenever the encrypted data is requested.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the log group. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the number of days
    * you want to retain log events in the specified log group.
    */
  val retentionInDays: js.UndefOr[Input[Double]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LogGroupArgs {
  @scala.inline
  def apply(
    kmsKeyId: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    retentionInDays: Input[Double] = null,
    tags: Input[StringDictionary[_]] = null
  ): LogGroupArgs = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (retentionInDays != null) __obj.updateDynamic("retentionInDays")(retentionInDays.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogGroupArgs]
  }
}

