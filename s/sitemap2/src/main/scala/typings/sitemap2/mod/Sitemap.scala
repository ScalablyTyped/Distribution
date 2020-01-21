package typings.sitemap2.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sitemap
  extends Instantiable0[Sitemap]
     with Instantiable1[/* conf */ SitemapConfig, Sitemap] {
  var childrens: js.Array[Sitemap] = js.native
  var fileName: String = js.native
  var hostName: String = js.native
  var limit: Double = js.native
  var urls: js.Array[String] = js.native
  def addSitemap(sm: Sitemap): this.type = js.native
  def addUrl(urlData: String): this.type = js.native
  def addUrl(urlData: js.Array[String | UrlData]): this.type = js.native
  def addUrl(urlData: UrlData): this.type = js.native
  def toXML(): js.Array[SitemapXml] = js.native
}

