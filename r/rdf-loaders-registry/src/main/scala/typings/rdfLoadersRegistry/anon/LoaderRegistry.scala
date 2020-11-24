package typings.rdfLoadersRegistry.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderRegistry extends js.Object {
  
  var loaderRegistry: typings.rdfLoadersRegistry.mod.LoaderRegistry = js.native
}
object LoaderRegistry {
  
  @scala.inline
  def apply(loaderRegistry: typings.rdfLoadersRegistry.mod.LoaderRegistry): LoaderRegistry = {
    val __obj = js.Dynamic.literal(loaderRegistry = loaderRegistry.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderRegistry]
  }
  
  @scala.inline
  implicit class LoaderRegistryOps[Self <: LoaderRegistry] (val x: Self) extends AnyVal {
    
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
    def setLoaderRegistry(value: typings.rdfLoadersRegistry.mod.LoaderRegistry): Self = this.set("loaderRegistry", value.asInstanceOf[js.Any])
  }
}
