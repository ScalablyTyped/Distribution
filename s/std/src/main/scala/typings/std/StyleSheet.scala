package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface. */
@js.native
trait StyleSheet extends js.Object {
  
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
  implicit class StyleSheetOps[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisabled(value: scala.Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: MediaList): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: java.lang.String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefNull: Self = this.set("href", null)
    
    @scala.inline
    def setOwnerNode(value: Element | ProcessingInstruction): Self = this.set("ownerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNodeNull: Self = this.set("ownerNode", null)
    
    @scala.inline
    def setParentStyleSheet(value: CSSStyleSheet): Self = this.set("parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheetNull: Self = this.set("parentStyleSheet", null)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
}
