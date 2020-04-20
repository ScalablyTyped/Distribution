package typings.sitemap2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapXml extends js.Object {
  var fileName: String
  var xml: String
}

object SitemapXml {
  @scala.inline
  def apply(fileName: String, xml: String): SitemapXml = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[SitemapXml]
  }
}

