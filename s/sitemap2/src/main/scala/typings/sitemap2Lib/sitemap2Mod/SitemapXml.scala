package typings
package sitemap2Lib.sitemap2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapXml extends js.Object {
  var fileName: java.lang.String
  var xml: java.lang.String
}

object SitemapXml {
  @scala.inline
  def apply(fileName: java.lang.String, xml: java.lang.String): SitemapXml = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[SitemapXml]
  }
}

