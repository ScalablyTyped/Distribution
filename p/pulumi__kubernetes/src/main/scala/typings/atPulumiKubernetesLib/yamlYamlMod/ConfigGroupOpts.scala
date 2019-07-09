package typings
package atPulumiKubernetesLib.yamlYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigGroupOpts extends js.Object {
  /** Set of paths or a URLs that uniquely identify files. */
  var files: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /** JavaScript objects representing Kubernetes resources. */
  var objs: js.UndefOr[js.Array[_] | js.Any] = js.undefined
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
  /** YAML text containing Kubernetes resource definitions. */
  var yaml: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
}

object ConfigGroupOpts {
  @scala.inline
  def apply(
    files: js.Array[java.lang.String] | java.lang.String = null,
    objs: js.Array[_] | js.Any = null,
    resourcePrefix: java.lang.String = null,
    transformations: js.Array[
      js.Function2[
        /* o */ _, 
        /* opts */ atPulumiPulumiLib.resourceMod.CustomResourceOptions, 
        scala.Unit
      ]
    ] = null,
    yaml: js.Array[java.lang.String] | java.lang.String = null
  ): ConfigGroupOpts = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (objs != null) __obj.updateDynamic("objs")(objs.asInstanceOf[js.Any])
    if (resourcePrefix != null) __obj.updateDynamic("resourcePrefix")(resourcePrefix)
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    if (yaml != null) __obj.updateDynamic("yaml")(yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigGroupOpts]
  }
}

