package typings.pulumiPulumi.rpcMod

import typings.pulumiPulumi.anon.Urn
import typings.pulumiPulumi.resourceMod.ProviderResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcePackage extends js.Object {
  
  def constructProvider(name: String, `type`: String, args: js.Any, opts: Urn): ProviderResource = js.native
}
object ResourcePackage {
  
  @scala.inline
  def apply(constructProvider: (String, String, js.Any, Urn) => ProviderResource): ResourcePackage = {
    val __obj = js.Dynamic.literal(constructProvider = js.Any.fromFunction4(constructProvider))
    __obj.asInstanceOf[ResourcePackage]
  }
  
  @scala.inline
  implicit class ResourcePackageOps[Self <: ResourcePackage] (val x: Self) extends AnyVal {
    
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
    def setConstructProvider(value: (String, String, js.Any, Urn) => ProviderResource): Self = this.set("constructProvider", js.Any.fromFunction4(value))
  }
}
