package typings.atPulumiAws.sagemakerModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ContainerHostnameEnvironment
import typings.atPulumiAws.Anon_SecurityGroupIdsSubnetsArrayInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelArgs extends js.Object {
  /**
    * Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
    */
  val containers: js.UndefOr[Input[js.Array[Input[Anon_ContainerHostnameEnvironment]]]] = js.undefined
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  val enableNetworkIsolation: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A role that SageMaker can assume to access model artifacts and docker images for deployment.
    */
  val executionRoleArn: Input[String]
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
    */
  val primaryContainer: js.UndefOr[Input[Anon_ContainerHostnameEnvironment]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
    */
  val vpcConfig: js.UndefOr[Input[Anon_SecurityGroupIdsSubnetsArrayInput]] = js.undefined
}

object ModelArgs {
  @scala.inline
  def apply(
    executionRoleArn: Input[String],
    containers: Input[js.Array[Input[Anon_ContainerHostnameEnvironment]]] = null,
    enableNetworkIsolation: Input[Boolean] = null,
    name: Input[String] = null,
    primaryContainer: Input[Anon_ContainerHostnameEnvironment] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcConfig: Input[Anon_SecurityGroupIdsSubnetsArrayInput] = null
  ): ModelArgs = {
    val __obj = js.Dynamic.literal(executionRoleArn = executionRoleArn.asInstanceOf[js.Any])
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    if (enableNetworkIsolation != null) __obj.updateDynamic("enableNetworkIsolation")(enableNetworkIsolation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (primaryContainer != null) __obj.updateDynamic("primaryContainer")(primaryContainer.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArgs]
  }
}

