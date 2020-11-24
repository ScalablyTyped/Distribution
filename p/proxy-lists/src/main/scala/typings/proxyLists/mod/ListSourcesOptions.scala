package typings.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSourcesOptions extends js.Object {
  
  var sourcesBlackList: js.UndefOr[js.Array[String]] = js.native
  
  var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.native
}
object ListSourcesOptions {
  
  @scala.inline
  def apply(): ListSourcesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourcesOptions]
  }
  
  @scala.inline
  implicit class ListSourcesOptionsOps[Self <: ListSourcesOptions] (val x: Self) extends AnyVal {
    
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
    def setSourcesBlackListVarargs(value: String*): Self = this.set("sourcesBlackList", js.Array(value :_*))
    
    @scala.inline
    def setSourcesBlackList(value: js.Array[String]): Self = this.set("sourcesBlackList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcesBlackList: Self = this.set("sourcesBlackList", js.undefined)
    
    @scala.inline
    def setSourcesWhiteListVarargs(value: String*): Self = this.set("sourcesWhiteList", js.Array(value :_*))
    
    @scala.inline
    def setSourcesWhiteList(value: js.Array[String]): Self = this.set("sourcesWhiteList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcesWhiteList: Self = this.set("sourcesWhiteList", js.undefined)
  }
}
