package typings.sitemap2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitemapXml extends js.Object {
  var fileName: String = js.native
  var xml: String = js.native
}

object SitemapXml {
  @scala.inline
  def apply(fileName: String, xml: String): SitemapXml = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[SitemapXml]
  }
  @scala.inline
  implicit class SitemapXmlOps[Self <: SitemapXml] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setXml(value: String): Self = this.set("xml", value.asInstanceOf[js.Any])
  }
  
}

