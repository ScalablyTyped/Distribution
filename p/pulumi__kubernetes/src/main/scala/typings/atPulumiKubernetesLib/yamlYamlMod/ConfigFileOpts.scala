package typings
package atPulumiKubernetesLib.yamlYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFileOpts extends js.Object {
  /** Path or a URL that uniquely identifies a file. */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A set of transformations to apply to Kubernetes resource definitions before registering
    * with engine.
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
}

object ConfigFileOpts {
  @scala.inline
  def apply(
    file: java.lang.String = null,
    resourcePrefix: java.lang.String = null,
    transformations: js.Array[
      js.Function2[
        /* o */ _, 
        /* opts */ atPulumiPulumiLib.resourceMod.CustomResourceOptions, 
        scala.Unit
      ]
    ] = null
  ): ConfigFileOpts = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (resourcePrefix != null) __obj.updateDynamic("resourcePrefix")(resourcePrefix)
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    __obj.asInstanceOf[ConfigFileOpts]
  }
}

