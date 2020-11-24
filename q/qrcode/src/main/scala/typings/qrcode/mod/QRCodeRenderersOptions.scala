package typings.qrcode.mod

import typings.qrcode.anon.Dark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRCodeRenderersOptions extends QRCodeOptions {
  
  var color: js.UndefOr[Dark] = js.native
  
  /**
    * Define how much wide the quiet zone should be.
    * Default: 4
    */
  var margin: js.UndefOr[Double] = js.native
  
  /**
    * Scale factor. A value of 1 means 1px per modules (black dots).
    * Default: 4
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * Forces a specific width for the output image.
    * If width is too small to contain the qr symbol, this option will be ignored.
    * Takes precedence over scale.
    */
  var width: js.UndefOr[Double] = js.native
}
object QRCodeRenderersOptions {
  
  @scala.inline
  def apply(): QRCodeRenderersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeRenderersOptions]
  }
  
  @scala.inline
  implicit class QRCodeRenderersOptionsOps[Self <: QRCodeRenderersOptions] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Dark): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
