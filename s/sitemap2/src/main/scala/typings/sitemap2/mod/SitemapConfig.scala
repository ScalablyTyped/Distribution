package typings.sitemap2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitemapConfig extends js.Object {
  
  var cacheTime: js.UndefOr[Double] = js.native
  
  var childrens: js.UndefOr[js.Array[Sitemap]] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var hostName: js.UndefOr[String] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var urls: js.UndefOr[js.Array[String]] = js.native
  
  var xslUrl: js.UndefOr[String] = js.native
}
object SitemapConfig {
  
  @scala.inline
  def apply(): SitemapConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitemapConfig]
  }
  
  @scala.inline
  implicit class SitemapConfigOps[Self <: SitemapConfig] (val x: Self) extends AnyVal {
    
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
    def setCacheTime(value: Double): Self = this.set("cacheTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheTime: Self = this.set("cacheTime", js.undefined)
    
    @scala.inline
    def setChildrensVarargs(value: Sitemap*): Self = this.set("childrens", js.Array(value :_*))
    
    @scala.inline
    def setChildrens(value: js.Array[Sitemap]): Self = this.set("childrens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrens: Self = this.set("childrens", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setHostName(value: String): Self = this.set("hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostName: Self = this.set("hostName", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    
    @scala.inline
    def setXslUrl(value: String): Self = this.set("xslUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXslUrl: Self = this.set("xslUrl", js.undefined)
  }
}
