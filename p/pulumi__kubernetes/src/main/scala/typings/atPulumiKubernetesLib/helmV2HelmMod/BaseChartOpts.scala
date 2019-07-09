package typings
package atPulumiKubernetesLib.helmV2HelmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseChartOpts extends js.Object {
  /**
    * The optional namespace to install chart resources into.
    */
  var namespace: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional array of transformations to apply to resources that will be created by this chart prior to
    * creation. Allows customization of the chart behaviour without directly modifying the chart itself.
    */
  var transformations: js.UndefOr[
    js.Array[
      js.Function2[
        /* o */ _, 
        /* opts */ atPulumiPulumiLib.resourceMod.CustomResourceOptions, 
        scala.Unit
      ]
    ]
  ] = js.undefined
  /**
    * Overrides for chart values.
    */
  var values: js.UndefOr[atPulumiPulumiLib.outputMod.Inputs] = js.undefined
}

object BaseChartOpts {
  @scala.inline
  def apply(
    namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourcePrefix: java.lang.String = null,
    transformations: js.Array[
      js.Function2[
        /* o */ _, 
        /* opts */ atPulumiPulumiLib.resourceMod.CustomResourceOptions, 
        scala.Unit
      ]
    ] = null,
    values: atPulumiPulumiLib.outputMod.Inputs = null
  ): BaseChartOpts = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (resourcePrefix != null) __obj.updateDynamic("resourcePrefix")(resourcePrefix)
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[BaseChartOpts]
  }
}

