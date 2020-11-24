package typings.pulumiKubernetes.yamlYamlMod

import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigGroupOpts extends js.Object {
  
  /** Set of paths or a URLs that uniquely identify files. */
  var files: js.UndefOr[js.Array[String] | String] = js.native
  
  /** JavaScript objects representing Kubernetes resources. */
  var objs: js.UndefOr[js.Array[_] | js.Any] = js.native
  
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[String] = js.native
  
  /** A set of transformations to apply to Kubernetes resource definitions before registering with engine. */
  var transformations: js.UndefOr[js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]]] = js.native
  
  /** YAML text containing Kubernetes resource definitions. */
  var yaml: js.UndefOr[js.Array[String] | String] = js.native
}
object ConfigGroupOpts {
  
  @scala.inline
  def apply(): ConfigGroupOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigGroupOpts]
  }
  
  @scala.inline
  implicit class ConfigGroupOptsOps[Self <: ConfigGroupOpts] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String] | String): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setObjsVarargs(value: js.Any*): Self = this.set("objs", js.Array(value :_*))
    
    @scala.inline
    def setObjs(value: js.Array[_] | js.Any): Self = this.set("objs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjs: Self = this.set("objs", js.undefined)
    
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
    
    @scala.inline
    def setYamlVarargs(value: String*): Self = this.set("yaml", js.Array(value :_*))
    
    @scala.inline
    def setYaml(value: js.Array[String] | String): Self = this.set("yaml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYaml: Self = this.set("yaml", js.undefined)
  }
}
