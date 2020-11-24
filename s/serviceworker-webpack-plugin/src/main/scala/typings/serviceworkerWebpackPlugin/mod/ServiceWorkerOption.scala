package typings.serviceworkerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerOption extends js.Object {
  
  var assets: js.Array[String] = js.native
  
  var jsonStats: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats.ToJsonOutput */ js.Any
  ] = js.native
}
object ServiceWorkerOption {
  
  @scala.inline
  def apply(assets: js.Array[String]): ServiceWorkerOption = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerOption]
  }
  
  @scala.inline
  implicit class ServiceWorkerOptionOps[Self <: ServiceWorkerOption] (val x: Self) extends AnyVal {
    
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
    def setAssetsVarargs(value: String*): Self = this.set("assets", js.Array(value :_*))
    
    @scala.inline
    def setAssets(value: js.Array[String]): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonStats(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stats.ToJsonOutput */ js.Any
    ): Self = this.set("jsonStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonStats: Self = this.set("jsonStats", js.undefined)
  }
}
