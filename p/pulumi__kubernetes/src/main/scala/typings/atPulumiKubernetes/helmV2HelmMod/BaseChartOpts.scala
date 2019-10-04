package typings.atPulumiKubernetes.helmV2HelmMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Inputs
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseChartOpts extends js.Object {
  /**
    * The optional namespace to install chart resources into.
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[String] = js.undefined
  /**
    * Optional array of transformations to apply to resources that will be created by this chart prior to
    * creation. Allows customization of the chart behaviour without directly modifying the chart itself.
    *
    * @example
    * ```typescript
    * transformations: [
    * (obj: any, opts: pulumi.CustomResourceOptions) => {
    *        if (obj.kind === "Deployment" && obj.metadata.name == "cert-manager") {
    *            opts.aliases = [
    *                "urn:pulumi:dev::example::kubernetes:helm.sh/v2:Chart$kubernetes:apps/v1beta1:Deployment::default/cert-manager",
    *            ];
    *        }
    *
    *        if (obj.metadata) {
    *            obj.metadata.namespace = namespaceName;
    *        } else {
    *            obj.metadata = {namespace: namespaceName};
    *        }
    *    },
    * ]
    * ```
    */
  var transformations: js.UndefOr[js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]]] = js.undefined
  /**
    * Overrides for chart values.
    */
  var values: js.UndefOr[Inputs] = js.undefined
}

object BaseChartOpts {
  @scala.inline
  def apply(
    namespace: Input[String] = null,
    resourcePrefix: String = null,
    transformations: js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]] = null,
    values: Inputs = null
  ): BaseChartOpts = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (resourcePrefix != null) __obj.updateDynamic("resourcePrefix")(resourcePrefix)
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[BaseChartOpts]
  }
}

