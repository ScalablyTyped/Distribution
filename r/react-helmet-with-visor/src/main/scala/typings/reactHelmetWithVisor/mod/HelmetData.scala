package typings.reactHelmetWithVisor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HelmetData extends js.Object {
  
  var base: HelmetDatum = js.native
  
  var bodyAttributes: HelmetHTMLBodyDatum = js.native
  
  var htmlAttributes: HelmetHTMLElementDatum = js.native
  
  var link: HelmetDatum = js.native
  
  var meta: HelmetDatum = js.native
  
  var noscript: HelmetDatum = js.native
  
  var openedVisor: HelmetDatum = js.native
  
  var script: HelmetDatum = js.native
  
  var style: HelmetDatum = js.native
  
  var title: HelmetDatum = js.native
  
  var titleAttributes: HelmetDatum = js.native
}
object HelmetData {
  
  @scala.inline
  def apply(
    base: HelmetDatum,
    bodyAttributes: HelmetHTMLBodyDatum,
    htmlAttributes: HelmetHTMLElementDatum,
    link: HelmetDatum,
    meta: HelmetDatum,
    noscript: HelmetDatum,
    openedVisor: HelmetDatum,
    script: HelmetDatum,
    style: HelmetDatum,
    title: HelmetDatum,
    titleAttributes: HelmetDatum
  ): HelmetData = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], bodyAttributes = bodyAttributes.asInstanceOf[js.Any], htmlAttributes = htmlAttributes.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], openedVisor = openedVisor.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleAttributes = titleAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelmetData]
  }
  
  @scala.inline
  implicit class HelmetDataOps[Self <: HelmetData] (val x: Self) extends AnyVal {
    
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
    def setBase(value: HelmetDatum): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyAttributes(value: HelmetHTMLBodyDatum): Self = this.set("bodyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlAttributes(value: HelmetHTMLElementDatum): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: HelmetDatum): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: HelmetDatum): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoscript(value: HelmetDatum): Self = this.set("noscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenedVisor(value: HelmetDatum): Self = this.set("openedVisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: HelmetDatum): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: HelmetDatum): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: HelmetDatum): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAttributes(value: HelmetDatum): Self = this.set("titleAttributes", value.asInstanceOf[js.Any])
  }
}
