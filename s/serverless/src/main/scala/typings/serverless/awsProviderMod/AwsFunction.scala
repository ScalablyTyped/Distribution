package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsFunction extends js.Object {
  @JSName("package")
  var _package: js.UndefOr[Package] = js.undefined
  var awsKmsKeyArn: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[String] = js.undefined
  var dependsOn: js.UndefOr[js.Array[String]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var destinations: js.UndefOr[Destinations] = js.undefined
  var environment: js.UndefOr[Environment] = js.undefined
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  var handler: String
  var layers: js.UndefOr[js.Array[String]] = js.undefined
  var memorySize: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[String] = js.undefined
  var provisionedConcurrency: js.UndefOr[Double | String] = js.undefined
  var reservedConcurrency: js.UndefOr[Double | String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var runtime: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[Tags] = js.undefined
  var timeout: js.UndefOr[Double | String] = js.undefined
  var tracing: js.UndefOr[String] = js.undefined
  var vpc: js.UndefOr[Vpc] = js.undefined
}

object AwsFunction {
  @scala.inline
  def apply(
    handler: String,
    _package: Package = null,
    awsKmsKeyArn: String = null,
    condition: String = null,
    dependsOn: js.Array[String] = null,
    description: String = null,
    destinations: Destinations = null,
    environment: Environment = null,
    events: js.Array[Event] = null,
    layers: js.Array[String] = null,
    memorySize: Double | String = null,
    name: String = null,
    onError: String = null,
    provisionedConcurrency: Double | String = null,
    reservedConcurrency: Double | String = null,
    role: String = null,
    runtime: String = null,
    tags: Tags = null,
    timeout: Double | String = null,
    tracing: String = null,
    vpc: Vpc = null
  ): AwsFunction = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (awsKmsKeyArn != null) __obj.updateDynamic("awsKmsKeyArn")(awsKmsKeyArn.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (memorySize != null) __obj.updateDynamic("memorySize")(memorySize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (provisionedConcurrency != null) __obj.updateDynamic("provisionedConcurrency")(provisionedConcurrency.asInstanceOf[js.Any])
    if (reservedConcurrency != null) __obj.updateDynamic("reservedConcurrency")(reservedConcurrency.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tracing != null) __obj.updateDynamic("tracing")(tracing.asInstanceOf[js.Any])
    if (vpc != null) __obj.updateDynamic("vpc")(vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsFunction]
  }
}

