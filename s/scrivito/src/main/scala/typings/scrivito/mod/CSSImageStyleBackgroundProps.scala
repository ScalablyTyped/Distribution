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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component definitions
  */
trait CSSImageStyleBackgroundProps extends StObject {
  
  var attachment: js.UndefOr[BackgroundAttachmentProperty] = js.undefined
  
  var clip: js.UndefOr[BackgroundClipProperty] = js.undefined
  
  var color: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var image: Obj | Binary | String
  
  var origin: js.UndefOr[BackgroundOriginProperty] = js.undefined
  
  var position: js.UndefOr[BackgroundPositionProperty[String | Double]] = js.undefined
  
  var repeat: js.UndefOr[BackgroundRepeatProperty] = js.undefined
  
  var size: js.UndefOr[BackgroundSizeProperty[String | Double]] = js.undefined
}
object CSSImageStyleBackgroundProps {
  
  inline def apply(image: Obj | Binary | String): CSSImageStyleBackgroundProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSImageStyleBackgroundProps]
  }
  
  extension [Self <: CSSImageStyleBackgroundProps](x: Self) {
    
    inline def setAttachment(value: BackgroundAttachmentProperty): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setClip(value: BackgroundClipProperty): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setColor(value: BackgroundColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setImage(value: Obj | Binary | String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: BackgroundOriginProperty): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPosition(value: BackgroundPositionProperty[String | Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRepeat(value: BackgroundRepeatProperty): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setSize(value: BackgroundSizeProperty[String | Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
