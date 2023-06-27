package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet)
  */
trait StyleSheet extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/disabled) */
  /* standard dom */
  var disabled: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/href) */
  /* standard dom */
  val href: java.lang.String | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/media) */
  /* standard dom */
  val media: MediaList
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/ownerNode) */
  /* standard dom */
  val ownerNode: Element | ProcessingInstruction | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/parentStyleSheet) */
  /* standard dom */
  val parentStyleSheet: CSSStyleSheet | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/title) */
  /* standard dom */
  val title: java.lang.String | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/type) */
  /* standard dom */
  val `type`: java.lang.String
}
object StyleSheet {
  
  inline def apply(disabled: scala.Boolean, media: MediaList, `type`: java.lang.String): StyleSheet = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], href = null, ownerNode = null, parentStyleSheet = null, title = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: scala.Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefNull: Self = StObject.set(x, "href", null)
    
    inline def setMedia(value: MediaList): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setOwnerNode(value: Element | ProcessingInstruction): Self = StObject.set(x, "ownerNode", value.asInstanceOf[js.Any])
    
    inline def setOwnerNodeNull: Self = StObject.set(x, "ownerNode", null)
    
    inline def setParentStyleSheet(value: CSSStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    inline def setParentStyleSheetNull: Self = StObject.set(x, "parentStyleSheet", null)
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
