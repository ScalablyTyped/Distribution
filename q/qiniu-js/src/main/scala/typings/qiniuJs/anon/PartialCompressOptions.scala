package typings.qiniuJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<qiniu-js.qiniu-js.CompressOptions> */
@js.native
trait PartialCompressOptions extends js.Object {
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidh: js.UndefOr[Double] = js.native
  
  var noCompressIfLarger: js.UndefOr[Boolean] = js.native
  
  var quality: js.UndefOr[Double] = js.native
}
object PartialCompressOptions {
  
  @scala.inline
  def apply(): PartialCompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCompressOptions]
  }
  
  @scala.inline
  implicit class PartialCompressOptionsOps[Self <: PartialCompressOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidh(value: Double): Self = this.set("maxWidh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidh: Self = this.set("maxWidh", js.undefined)
    
    @scala.inline
    def setNoCompressIfLarger(value: Boolean): Self = this.set("noCompressIfLarger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCompressIfLarger: Self = this.set("noCompressIfLarger", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
}
