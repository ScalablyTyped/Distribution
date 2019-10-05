package typings.atPulumiAws.sagemakerEndpointConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.sagemaker.EndpointConfigurationProductionVariant
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointConfigurationArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the endpoint configuration. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Fields are documented below.
    */
  val productionVariants: Input[js.Array[Input[EndpointConfigurationProductionVariant]]]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object EndpointConfigurationArgs {
  @scala.inline
  def apply(
    productionVariants: Input[js.Array[Input[EndpointConfigurationProductionVariant]]],
    kmsKeyArn: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): EndpointConfigurationArgs = {
    val __obj = js.Dynamic.literal(productionVariants = productionVariants.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationArgs]
  }
}

