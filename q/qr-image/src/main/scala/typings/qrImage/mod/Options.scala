package typings.qrImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
      // (experimental, default false) try to optimize QR-code for URLs.
  /**
    * (only png) — function to customize qr bitmap before encoding to PNG
    */
  var customize: js.UndefOr[js.Function1[/* bitmap */ Bitmap, Unit]] = js.native
  
  var ec_level: js.UndefOr[ecLevel] = js.native
  
          // (png and svg only) for png and undefined for svg.-(png and svg only) — size of one module in pixels.
  var margin: js.UndefOr[Double] = js.native
  
          // (only png)for png and 1 for others.-white space around QR image in modules.
  var parse_url: js.UndefOr[Boolean] = js.native
  
          // image type. Possible values png(default), svg, pdf and eps.
  var size: js.UndefOr[Double] = js.native
  
      // error correction level. One of L, M, Q, H. Default M.
  var `type`: js.UndefOr[imageType] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCustomize(value: /* bitmap */ Bitmap => Unit): Self = this.set("customize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomize: Self = this.set("customize", js.undefined)
    
    @scala.inline
    def setEc_level(value: ecLevel): Self = this.set("ec_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc_level: Self = this.set("ec_level", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setParse_url(value: Boolean): Self = this.set("parse_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParse_url: Self = this.set("parse_url", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setType(value: imageType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
