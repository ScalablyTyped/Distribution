package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
@js.native
trait SjclCipherParams extends js.Object {
  
  var adata: js.UndefOr[String] = js.native
  
  var cipher: js.UndefOr[String] = js.native
  
  var iter: js.UndefOr[Double] = js.native
  
  var ks: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var ts: js.UndefOr[Double] = js.native
  
  var v: js.UndefOr[Double] = js.native
}
object SjclCipherParams {
  
  @scala.inline
  def apply(): SjclCipherParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SjclCipherParams]
  }
  
  @scala.inline
  implicit class SjclCipherParamsOps[Self <: SjclCipherParams] (val x: Self) extends AnyVal {
    
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
    def setAdata(value: String): Self = this.set("adata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdata: Self = this.set("adata", js.undefined)
    
    @scala.inline
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipher: Self = this.set("cipher", js.undefined)
    
    @scala.inline
    def setIter(value: Double): Self = this.set("iter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIter: Self = this.set("iter", js.undefined)
    
    @scala.inline
    def setKs(value: Double): Self = this.set("ks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKs: Self = this.set("ks", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTs: Self = this.set("ts", js.undefined)
    
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
}
