package typings.scrivito.mod

import typings.csstype.mod.Property.BackgroundAttachment
import typings.csstype.mod.Property.BackgroundClip
import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.BackgroundOrigin
import typings.csstype.mod.Property.BackgroundPosition
import typings.csstype.mod.Property.BackgroundRepeat
import typings.csstype.mod.Property.BackgroundSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component definitions
  */
trait CSSImageStyleBackgroundProps extends StObject {
  
  var attachment: js.UndefOr[BackgroundAttachment] = js.undefined
  
  var clip: js.UndefOr[BackgroundClip] = js.undefined
  
  var color: js.UndefOr[BackgroundColor] = js.undefined
  
  var image: Obj | Binary | String
  
  var origin: js.UndefOr[BackgroundOrigin] = js.undefined
  
  var position: js.UndefOr[BackgroundPosition[String | Double]] = js.undefined
  
  var repeat: js.UndefOr[BackgroundRepeat] = js.undefined
  
  var size: js.UndefOr[BackgroundSize[String | Double]] = js.undefined
}
object CSSImageStyleBackgroundProps {
  
  inline def apply(image: Obj | Binary | String): CSSImageStyleBackgroundProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSImageStyleBackgroundProps]
  }
  
  extension [Self <: CSSImageStyleBackgroundProps](x: Self) {
    
    inline def setAttachment(value: BackgroundAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setClip(value: BackgroundClip): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setColor(value: BackgroundColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setImage(value: Obj | Binary | String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: BackgroundOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPosition(value: BackgroundPosition[String | Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRepeat(value: BackgroundRepeat): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setSize(value: BackgroundSize[String | Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
