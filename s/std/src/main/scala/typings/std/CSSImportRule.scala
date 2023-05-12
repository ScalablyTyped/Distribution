package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSImportRule
  extends StObject
     with CSSRule {
  
  /* standard dom */
  val href: java.lang.String
  
  /* standard dom */
  val layerName: java.lang.String | Null
  
  /* standard dom */
  val media: MediaList
  
  /* standard dom */
  val styleSheet: CSSStyleSheet
}
object CSSImportRule {
  
  inline def apply(
    cssText: java.lang.String,
    href: java.lang.String,
    media: MediaList,
    styleSheet: CSSStyleSheet,
    `type`: Double
  ): CSSImportRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], styleSheet = styleSheet.asInstanceOf[js.Any], layerName = null, parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSImportRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSImportRule] (val x: Self) extends AnyVal {
    
    inline def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setLayerName(value: java.lang.String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
    
    inline def setLayerNameNull: Self = StObject.set(x, "layerName", null)
    
    inline def setMedia(value: MediaList): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setStyleSheet(value: CSSStyleSheet): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
  }
}
