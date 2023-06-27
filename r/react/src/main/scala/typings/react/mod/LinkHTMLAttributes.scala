package typings.react.mod

import typings.react.reactStrings._empty
import typings.react.reactStrings.`use-credentials`
import typings.react.reactStrings.anonymous
import typings.react.reactStrings.auto
import typings.react.reactStrings.high
import typings.react.reactStrings.low
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var as: js.UndefOr[String] = js.undefined
  
  var charSet: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
  
  var fetchpriority: js.UndefOr[high | low | auto] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var hrefLang: js.UndefOr[String] = js.undefined
  
  var imageSizes: js.UndefOr[String] = js.undefined
  
  var imageSrcSet: js.UndefOr[String] = js.undefined
  
  var integrity: js.UndefOr[String] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.undefined
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object LinkHTMLAttributes {
  
  inline def apply[T](): LinkHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkHTMLAttributes[?], T] (val x: Self & LinkHTMLAttributes[T]) extends AnyVal {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setFetchpriority(value: high | low | auto): Self = StObject.set(x, "fetchpriority", value.asInstanceOf[js.Any])
    
    inline def setFetchpriorityUndefined: Self = StObject.set(x, "fetchpriority", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setImageSizes(value: String): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
    
    inline def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
    
    inline def setImageSrcSet(value: String): Self = StObject.set(x, "imageSrcSet", value.asInstanceOf[js.Any])
    
    inline def setImageSrcSetUndefined: Self = StObject.set(x, "imageSrcSet", js.undefined)
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
