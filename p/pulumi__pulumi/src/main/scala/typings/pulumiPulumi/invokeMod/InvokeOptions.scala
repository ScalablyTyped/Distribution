package typings.pulumiPulumi.invokeMod

import typings.pulumiPulumi.resourceMod.ProviderResource
import typings.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeOptions extends js.Object {
  
  /**
    * Invoke this data source function asynchronously.  Defaults to `true` if unspecified.
    *
    * When `true`, only the `Promise<>` side of the invoke result is present.  Explicitly pass in
    * `false` to get the non-Promise side of the result.  Invoking data source functions
    * synchronously is deprecated.  The ability to do this will be removed at a later point in
    * time.
    */
  var async: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional parent to use for default options for this invoke (e.g. the default provider to use).
    */
  var parent: js.UndefOr[Resource] = js.native
  
  /**
    * An optional provider to use for this invocation. If no provider is supplied, the default provider for the
    * invoked function's package will be used.
    */
  var provider: js.UndefOr[ProviderResource] = js.native
  
  /**
    * An optional version, corresponding to the version of the provider plugin that should be used when performing this
    * invoke.
    */
  var version: js.UndefOr[String] = js.native
}
object InvokeOptions {
  
  @scala.inline
  def apply(): InvokeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeOptions]
  }
  
  @scala.inline
  implicit class InvokeOptionsOps[Self <: InvokeOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setParent(value: Resource): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setProvider(value: ProviderResource): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
