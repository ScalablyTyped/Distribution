package typings.atPulumiKubernetes.yamlYamlMod

import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOpts extends js.Object {
  /** JavaScript objects representing Kubernetes resources. */
  var objs: js.Array[_]
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[String] = js.undefined
  /**
    * A set of transformations to apply to Kubernetes resource definitions before registering
    * with engine.
    */
  var transformations: js.UndefOr[js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]]] = js.undefined
}

object ConfigOpts {
  @scala.inline
  def apply(
    objs: js.Array[_],
    resourcePrefix: String = null,
    transformations: js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]] = null
  ): ConfigOpts = {
    val __obj = js.Dynamic.literal(objs = objs)
    if (resourcePrefix != null) __obj.updateDynamic("resourcePrefix")(resourcePrefix)
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    __obj.asInstanceOf[ConfigOpts]
  }
}

