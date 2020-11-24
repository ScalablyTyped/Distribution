package typings.pulumiPulumi.resourceMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentResourceOptions extends ResourceOptions {
  
  /**
    * An optional set of providers to use for child resources. Either keyed by package name (e.g.
    * "aws"), or just provided as an array.  In the latter case, the package name will be retrieved
    * from the provider itself.
    *
    * In the case of a single provider, the options can be simplified to just pass along `provider: theProvider`
    *
    * Note: do not provide both [provider] and [providers];
    */
  var providers: js.UndefOr[(Record[String, ProviderResource]) | js.Array[ProviderResource]] = js.native
}
object ComponentResourceOptions {
  
  @scala.inline
  def apply(): ComponentResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentResourceOptions]
  }
  
  @scala.inline
  implicit class ComponentResourceOptionsOps[Self <: ComponentResourceOptions] (val x: Self) extends AnyVal {
    
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
    def setProvidersVarargs(value: ProviderResource*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: (Record[String, ProviderResource]) | js.Array[ProviderResource]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
  }
}
