package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface. */
trait StyleSheet extends StObject {
  
  var disabled: scala.Boolean
  
  val href: java.lang.String | Null
  
  val media: MediaList
  
  val ownerNode: Element | ProcessingInstruction | Null
  
  val parentStyleSheet: CSSStyleSheet | Null
  
  val title: java.lang.String | Null
  
  val `type`: java.lang.String
}
object StyleSheet {
  
  inline def apply(disabled: scala.Boolean, media: MediaList, `type`: java.lang.String): StyleSheet = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], href = null, ownerNode = null, parentStyleSheet = null, title = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  
  extension [Self <: StyleSheet](x: Self) {
    
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
