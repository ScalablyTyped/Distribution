package typings
package atPulumiAwsLib.sagemakerModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelArgs extends js.Object {
  /**
    * Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
    */
  val containers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerHostnameEnvironment]
      ]
    ]
  ] = js.undefined
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  val enableNetworkIsolation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A role that SageMaker can assume to access model artifacts and docker images for deployment.
    */
  val executionRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the model (must be unique). If omitted, Terraform will assign a random, unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
    */
  val primaryContainer: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerHostnameEnvironment]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
    */
  val vpcConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetsArrayInput]
  ] = js.undefined
}

