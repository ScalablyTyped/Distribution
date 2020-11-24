package typings.rss.mod.NodeRSS

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedOptions extends js.Object {
  
  /**
    * One or more categories this feed belongs to.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Copyright information for this feed.
    */
  var copyright: js.UndefOr[String] = js.native
  
  /**
    * Put additional elements in the feed (node-xml syntax).
    */
  var custom_elements: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Put additional namespaces in element
    * (without 'xmlns:' prefix).
    */
  var custom_namespaces: js.UndefOr[js.Object] = js.native
  
  /**
    * A short description of the feed.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * URL to documentation on this feed.
    */
  var docs: js.UndefOr[String] = js.native
  
  /**
    * URL to the rss feed.
    */
  var feed_url: String = js.native
  
  /**
    * Feed generator.
    */
  var generator: js.UndefOr[String] = js.native
  
  /**
    * Where is the PubSubHub hub located.
    */
  var hub: js.UndefOr[String] = js.native
  
  /**
    * Small image for feed readers to use.
    */
  var image_url: js.UndefOr[String] = js.native
  
  /**
    * The language of the content of this feed.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Who manages content in this feed.
    */
  var managingEditor: js.UndefOr[String] = js.native
  
  /**
    * The publication date for content in the feed.
    * Accepts Date object or string with any format
    * JS Date can parse.
    */
  var pubDate: js.UndefOr[Date | String] = js.native
  
  /**
    * URL to the site that the feed is for.
    */
  var site_url: String = js.native
  
  /**
    * Title of your site or feed.
    */
  var title: String = js.native
  
  /**
    * Number of minutes feed can be cached before refreshing
    * from source.
    */
  var ttl: js.UndefOr[Double] = js.native
  
  /**
    * Who manages feed availability and technical support.
    */
  var webMaster: js.UndefOr[String] = js.native
}
object FeedOptions {
  
  @scala.inline
  def apply(feed_url: String, site_url: String, title: String): FeedOptions = {
    val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any], site_url = site_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedOptions]
  }
  
  @scala.inline
  implicit class FeedOptionsOps[Self <: FeedOptions] (val x: Self) extends AnyVal {
    
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
    def setFeed_url(value: String): Self = this.set("feed_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSite_url(value: String): Self = this.set("site_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setCustom_elementsVarargs(value: js.Any*): Self = this.set("custom_elements", js.Array(value :_*))
    
    @scala.inline
    def setCustom_elements(value: js.Array[_]): Self = this.set("custom_elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_elements: Self = this.set("custom_elements", js.undefined)
    
    @scala.inline
    def setCustom_namespaces(value: js.Object): Self = this.set("custom_namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_namespaces: Self = this.set("custom_namespaces", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDocs(value: String): Self = this.set("docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocs: Self = this.set("docs", js.undefined)
    
    @scala.inline
    def setGenerator(value: String): Self = this.set("generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerator: Self = this.set("generator", js.undefined)
    
    @scala.inline
    def setHub(value: String): Self = this.set("hub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHub: Self = this.set("hub", js.undefined)
    
    @scala.inline
    def setImage_url(value: String): Self = this.set("image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_url: Self = this.set("image_url", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setManagingEditor(value: String): Self = this.set("managingEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagingEditor: Self = this.set("managingEditor", js.undefined)
    
    @scala.inline
    def setPubDate(value: Date | String): Self = this.set("pubDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubDate: Self = this.set("pubDate", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setWebMaster(value: String): Self = this.set("webMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebMaster: Self = this.set("webMaster", js.undefined)
  }
}
