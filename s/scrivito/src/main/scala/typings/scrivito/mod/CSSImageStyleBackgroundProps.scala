package typings.scrivito.mod

import typings.csstype.mod.BackgroundAttachmentProperty
import typings.csstype.mod.BackgroundClipProperty
import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BackgroundOriginProperty
import typings.csstype.mod.BackgroundPositionProperty
import typings.csstype.mod.BackgroundRepeatProperty
import typings.csstype.mod.BackgroundSizeProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component definitions
  */
@js.native
trait CSSImageStyleBackgroundProps extends StObject {
  
  var attachment: js.UndefOr[BackgroundAttachmentProperty] = js.native
  
  var clip: js.UndefOr[BackgroundClipProperty] = js.native
  
  var color: js.UndefOr[BackgroundColorProperty] = js.native
  
  var image: Obj | Binary | String = js.native
  
  var origin: js.UndefOr[BackgroundOriginProperty] = js.native
  
  var position: js.UndefOr[BackgroundPositionProperty[String | Double]] = js.native
  
  var repeat: js.UndefOr[BackgroundRepeatProperty] = js.native
  
  var size: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.native
}
object CSSImageStyleBackgroundProps {
  
  @scala.inline
  def apply(image: Obj | Binary | String): CSSImageStyleBackgroundProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSImageStyleBackgroundProps]
  }
  
  @scala.inline
  implicit class CSSImageStyleBackgroundPropsMutableBuilder[Self <: CSSImageStyleBackgroundProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: BackgroundAttachmentProperty): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    @scala.inline
    def setClip(value: BackgroundClipProperty): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setColor(value: BackgroundColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setImage(value: Obj | Binary | String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: BackgroundOriginProperty): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPosition(value: BackgroundPositionProperty[String | Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRepeat(value: BackgroundRepeatProperty): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setSize(value: BackgroundSizeProperty[String | Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
