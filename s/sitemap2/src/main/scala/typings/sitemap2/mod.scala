package typings.sitemap2

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.sitemap2.anon.Contentloc
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sitemap2", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Sitemap {
    def this(conf: SitemapConfig) = this()
  }
  @JSImport("sitemap2", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Sitemap = js.native
  
  @js.native
  trait Sitemap
    extends StObject
       with Instantiable0[Sitemap]
       with Instantiable1[/* conf */ SitemapConfig, Sitemap] {
    
    def addSitemap(sm: Sitemap): this.type = js.native
    
    def addUrl(urlData: String): this.type = js.native
    def addUrl(urlData: js.Array[String | UrlData]): this.type = js.native
    def addUrl(urlData: UrlData): this.type = js.native
    
    var childrens: js.Array[Sitemap] = js.native
    
    var fileName: String = js.native
    
    var hostName: String = js.native
    
    var limit: Double = js.native
    
    def toXML(): js.Array[SitemapXml] = js.native
    
    var urls: js.Array[String] = js.native
  }
  
  trait SitemapConfig extends StObject {
    
    var cacheTime: js.UndefOr[Double] = js.undefined
    
    var childrens: js.UndefOr[js.Array[Sitemap]] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var hostName: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
    var xslUrl: js.UndefOr[String] = js.undefined
  }
  object SitemapConfig {
    
    inline def apply(): SitemapConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SitemapConfig]
    }
    
    extension [Self <: SitemapConfig](x: Self) {
      
      inline def setCacheTime(value: Double): Self = StObject.set(x, "cacheTime", value.asInstanceOf[js.Any])
      
      inline def setCacheTimeUndefined: Self = StObject.set(x, "cacheTime", js.undefined)
      
      inline def setChildrens(value: js.Array[Sitemap]): Self = StObject.set(x, "childrens", value.asInstanceOf[js.Any])
      
      inline def setChildrensUndefined: Self = StObject.set(x, "childrens", js.undefined)
      
      inline def setChildrensVarargs(value: Sitemap*): Self = StObject.set(x, "childrens", js.Array(value :_*))
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
      
      inline def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
      
      inline def setXslUrl(value: String): Self = StObject.set(x, "xslUrl", value.asInstanceOf[js.Any])
      
      inline def setXslUrlUndefined: Self = StObject.set(x, "xslUrl", js.undefined)
    }
  }
  
  trait SitemapXml extends StObject {
    
    var fileName: String
    
    var xml: String
  }
  object SitemapXml {
    
    inline def apply(fileName: String, xml: String): SitemapXml = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
      __obj.asInstanceOf[SitemapXml]
    }
    
    extension [Self <: SitemapXml](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlData extends StObject {
    
    var chengefreq: js.UndefOr[String] = js.undefined
    
    var lastmod: js.UndefOr[Date] = js.undefined
    
    var lastmodInISO: js.UndefOr[Boolean] = js.undefined
    
    var lastmodWithTime: js.UndefOr[Boolean] = js.undefined
    
    var priority: js.UndefOr[Double | String] = js.undefined
    
    var url: String
    
    var video: js.UndefOr[Contentloc] = js.undefined
  }
  object UrlData {
    
    inline def apply(url: String): UrlData = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlData]
    }
    
    extension [Self <: UrlData](x: Self) {
      
      inline def setChengefreq(value: String): Self = StObject.set(x, "chengefreq", value.asInstanceOf[js.Any])
      
      inline def setChengefreqUndefined: Self = StObject.set(x, "chengefreq", js.undefined)
      
      inline def setLastmod(value: Date): Self = StObject.set(x, "lastmod", value.asInstanceOf[js.Any])
      
      inline def setLastmodInISO(value: Boolean): Self = StObject.set(x, "lastmodInISO", value.asInstanceOf[js.Any])
      
      inline def setLastmodInISOUndefined: Self = StObject.set(x, "lastmodInISO", js.undefined)
      
      inline def setLastmodUndefined: Self = StObject.set(x, "lastmod", js.undefined)
      
      inline def setLastmodWithTime(value: Boolean): Self = StObject.set(x, "lastmodWithTime", value.asInstanceOf[js.Any])
      
      inline def setLastmodWithTimeUndefined: Self = StObject.set(x, "lastmodWithTime", js.undefined)
      
      inline def setPriority(value: Double | String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: Contentloc): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  type _To = js.Object & Sitemap
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Sitemap = ^
}
