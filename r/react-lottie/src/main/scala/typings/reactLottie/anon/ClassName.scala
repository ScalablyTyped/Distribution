package typings.reactLottie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var clearCanvas: js.UndefOr[Boolean] = js.native
  
  /**
    * The canvas context
    */
  var context: js.UndefOr[js.Any] = js.native
  
  /**
    * Hides elements when opacity reaches 0. Only with SVG renderer.
    * @default true
    */
  var hideOnTransparent: js.UndefOr[Boolean] = js.native
  
  var preserveAspectRatio: js.UndefOr[String] = js.native
  
  /**
    * Loads DOM elements when needed. Might speed up initialization for large number of elements. Only with SVG renderer.
    */
  var progressiveLoad: js.UndefOr[Boolean] = js.native
  
  var scaleMode: js.UndefOr[js.Any] = js.native
}
object ClassName {
  
  @scala.inline
  def apply(): ClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearCanvas(value: Boolean): Self = this.set("clearCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearCanvas: Self = this.set("clearCanvas", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setHideOnTransparent(value: Boolean): Self = this.set("hideOnTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnTransparent: Self = this.set("hideOnTransparent", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setProgressiveLoad(value: Boolean): Self = this.set("progressiveLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressiveLoad: Self = this.set("progressiveLoad", js.undefined)
    
    @scala.inline
    def setScaleMode(value: js.Any): Self = this.set("scaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleMode: Self = this.set("scaleMode", js.undefined)
  }
}
