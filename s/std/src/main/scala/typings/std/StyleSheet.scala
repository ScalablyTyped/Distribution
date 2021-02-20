package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface. */
@js.native
trait StyleSheet extends StObject {
  
  var disabled: scala.Boolean = js.native
  
  val href: java.lang.String | Null = js.native
  
  val media: MediaList = js.native
  
  val ownerNode: Element | ProcessingInstruction | Null = js.native
  
  val parentStyleSheet: CSSStyleSheet | Null = js.native
  
  val title: java.lang.String | Null = js.native
  
  val `type`: java.lang.String = js.native
}
object StyleSheet {
  
  @scala.inline
  def apply(disabled: scala.Boolean, media: MediaList, `type`: java.lang.String): StyleSheet = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  
  @scala.inline
  implicit class StyleSheetMutableBuilder[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: scala.Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefNull: Self = StObject.set(x, "href", null)
    
    @scala.inline
    def setMedia(value: MediaList): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNode(value: Element | ProcessingInstruction): Self = StObject.set(x, "ownerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNodeNull: Self = StObject.set(x, "ownerNode", null)
    
    @scala.inline
    def setParentStyleSheet(value: CSSStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheetNull: Self = StObject.set(x, "parentStyleSheet", null)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
