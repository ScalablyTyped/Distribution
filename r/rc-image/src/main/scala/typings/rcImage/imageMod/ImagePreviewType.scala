package typings.rcImage.imageMod

import typings.rcImage.rcImageBooleans.`false`
import typings.rcUtil.portalWrapperMod.GetContainer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePreviewType extends js.Object {
  
  var getContainer: js.UndefOr[GetContainer | `false`] = js.native
  
  var onVisibleChange: js.UndefOr[js.Function2[/* value */ Boolean, /* prevValue */ Boolean, Unit]] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ImagePreviewType {
  
  @scala.inline
  def apply(): ImagePreviewType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePreviewType]
  }
  
  @scala.inline
  implicit class ImagePreviewTypeOps[Self <: ImagePreviewType] (val x: Self) extends AnyVal {
    
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
    def setGetContainerFunction0(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainer(value: GetContainer | `false`): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setOnVisibleChange(value: (/* value */ Boolean, /* prevValue */ Boolean) => Unit): Self = this.set("onVisibleChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnVisibleChange: Self = this.set("onVisibleChange", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
