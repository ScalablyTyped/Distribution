package typings.pulumiKubernetes.yamlYamlMod

import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigGroupOpts extends js.Object {
  /** Set of paths or a URLs that uniquely identify files. */
  var files: js.UndefOr[js.Array[String] | String] = js.undefined
  /** JavaScript objects representing Kubernetes resources. */
  var objs: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[String] = js.undefined
  /**
    * A set of transformations to apply to Kubernetes resource definitions before registering
    * with engine.
    *
    * @example
    * ```typescript
    * transformations: [
    * (obj: any, opts: pulumi.CustomResourceOptions) => {
    *        if (obj.kind === "Deployment" && obj.metadata.name == "cert-manager") {
    *            opts.aliases = [
    *                "urn:pulumi:dev::example::kubernetes:yaml:ConfigFile$kubernetes:apps/v1beta1:Deployment::default/cert-manager",
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
  /** YAML text containing Kubernetes resource definitions. */
  var yaml: js.UndefOr[js.Array[String] | String] = js.undefined
}

object ConfigGroupOpts {
  @scala.inline
  def apply(
    files: js.Array[String] | String = null,
    objs: js.Array[_] | js.Any = null,
    resourcePrefix: String = null,
    transformations: js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]] = null,
    yaml: js.Array[String] | String = null
  ): ConfigGroupOpts = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (objs != null) __obj.updateDynamic("objs")(objs.asInstanceOf[js.Any])
    if (resourcePrefix != null) __obj.updateDynamic("resourcePrefix")(resourcePrefix.asInstanceOf[js.Any])
    if (transformations != null) __obj.updateDynamic("transformations")(transformations.asInstanceOf[js.Any])
    if (yaml != null) __obj.updateDynamic("yaml")(yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigGroupOpts]
  }
}

