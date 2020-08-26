package typings.pulumiKubernetes.yamlYamlMod

import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOpts extends js.Object {
  /** JavaScript objects representing Kubernetes resources. */
  var objs: js.Promise[js.Array[_]] = js.native
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[String] = js.native
  /** A set of transformations to apply to Kubernetes resource definitions before registering with engine. */
  var transformations: js.UndefOr[js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]]] = js.native
}

object ConfigOpts {
  @scala.inline
  def apply(objs: js.Promise[js.Array[_]]): ConfigOpts = {
    val __obj = js.Dynamic.literal(objs = objs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOpts]
  }
  @scala.inline
  implicit class ConfigOptsOps[Self <: ConfigOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjs(value: js.Promise[js.Array[_]]): Self = this.set("objs", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcePrefix(value: String): Self = this.set("resourcePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcePrefix: Self = this.set("resourcePrefix", js.undefined)
    @scala.inline
    def setTransformationsVarargs(value: (js.Function2[js.Any, /* opts */ CustomResourceOptions, Unit])*): Self = this.set("transformations", js.Array(value :_*))
    @scala.inline
    def setTransformations(value: js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]]): Self = this.set("transformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformations: Self = this.set("transformations", js.undefined)
  }
  
}

