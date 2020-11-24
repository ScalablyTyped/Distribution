package typings.pulumiPulumi.rpcMod

import typings.pulumiPulumi.anon.Urn
import typings.pulumiPulumi.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceModule extends js.Object {
  
  def construct(name: String, `type`: String, args: js.Any, opts: Urn): Resource = js.native
}
object ResourceModule {
  
  @scala.inline
  def apply(construct: (String, String, js.Any, Urn) => Resource): ResourceModule = {
    val __obj = js.Dynamic.literal(construct = js.Any.fromFunction4(construct))
    __obj.asInstanceOf[ResourceModule]
  }
  
  @scala.inline
  implicit class ResourceModuleOps[Self <: ResourceModule] (val x: Self) extends AnyVal {
    
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
    def setConstruct(value: (String, String, js.Any, Urn) => Resource): Self = this.set("construct", js.Any.fromFunction4(value))
  }
}
