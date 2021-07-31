package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var coords: js.UndefOr[String] = js.undefined
  
  var download: js.UndefOr[js.Any] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var hrefLang: js.UndefOr[String] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var rel: js.UndefOr[String] = js.undefined
  
  var shape: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object AreaHTMLAttributes {
  
  @scala.inline
  def apply[T](): AreaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class AreaHTMLAttributesMutableBuilder[Self <: AreaHTMLAttributes[?], T] (val x: Self & AreaHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    @scala.inline
    def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
