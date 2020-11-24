package typings.pulumiKubernetes.v2HelmMod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseChartOpts extends js.Object {
  
  /**
    * The optional kubernetes api versions used for Capabilities.APIVersions.
    */
  var apiVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The optional namespace to install chart resources into.
    */
  var namespace: js.UndefOr[Input[String]] = js.native
  
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[String] = js.native
  
  /**
    * A set of transformations to apply to Kubernetes resource definitions before registering
    * with engine.
    */
  var transformations: js.UndefOr[js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]]] = js.native
  
  /**
    * Overrides for chart values.
    */
  var values: js.UndefOr[Inputs] = js.native
}
object BaseChartOpts {
  
  @scala.inline
  def apply(): BaseChartOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartOpts]
  }
  
  @scala.inline
  implicit class BaseChartOptsOps[Self <: BaseChartOpts] (val x: Self) extends AnyVal {
    
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
    def setApiVersionsVarargs(value: Input[String]*): Self = this.set("apiVersions", js.Array(value :_*))
    
    @scala.inline
    def setApiVersions(value: Input[js.Array[Input[String]]]): Self = this.set("apiVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersions: Self = this.set("apiVersions", js.undefined)
    
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
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
    def setValues(value: Inputs): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
