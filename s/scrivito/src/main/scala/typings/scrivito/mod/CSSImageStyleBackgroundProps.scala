package typings.scrivito.mod

import typings.csstype.mod.BackgroundAttachmentProperty
import typings.csstype.mod.BackgroundClipProperty
import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BackgroundOriginProperty
import typings.csstype.mod.BackgroundPositionProperty
import typings.csstype.mod.BackgroundRepeatProperty
import typings.csstype.mod.BackgroundSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Component definitions
  */
@js.native
trait CSSImageStyleBackgroundProps extends js.Object {
  
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
  implicit class CSSImageStyleBackgroundPropsOps[Self <: CSSImageStyleBackgroundProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImage(value: Obj | Binary | String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachment(value: BackgroundAttachmentProperty): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    
    @scala.inline
    def setClip(value: BackgroundClipProperty): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setColor(value: BackgroundColorProperty): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOrigin(value: BackgroundOriginProperty): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPosition(value: BackgroundPositionProperty[String | Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRepeat(value: BackgroundRepeatProperty): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setSize(value: BackgroundSizeProperty[String | Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
