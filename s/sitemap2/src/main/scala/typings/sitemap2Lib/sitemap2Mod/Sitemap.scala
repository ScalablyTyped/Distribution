package typings
package sitemap2Lib.sitemap2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sitemap
  extends ScalablyTyped.runtime.Instantiable0[Sitemap]
     with ScalablyTyped.runtime.Instantiable1[/* conf */ SitemapConfig, Sitemap] {
  var childrens: js.Array[Sitemap] = js.native
  var fileName: java.lang.String = js.native
  var hostName: java.lang.String = js.native
  var limit: scala.Double = js.native
  var urls: js.Array[java.lang.String] = js.native
  def addSitemap(sm: Sitemap): this.type = js.native
  def addUrl(urlData: java.lang.String): this.type = js.native
  def addUrl(urlData: js.Array[java.lang.String | UrlData]): this.type = js.native
  def addUrl(urlData: UrlData): this.type = js.native
  def toXML(): js.Array[SitemapXml] = js.native
}

