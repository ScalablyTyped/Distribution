package typings.ssh2SftpClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastGetTransferOptions extends js.Object {
  
  var chunkSize: js.UndefOr[Double] = js.native
  
  var concurrency: js.UndefOr[Double] = js.native
  
  var step: js.UndefOr[
    js.Function3[/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.native
}
object FastGetTransferOptions {
  
  @scala.inline
  def apply(): FastGetTransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastGetTransferOptions]
  }
  
  @scala.inline
  implicit class FastGetTransferOptionsOps[Self <: FastGetTransferOptions] (val x: Self) extends AnyVal {
    
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
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    
    @scala.inline
    def setStep(value: (/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double) => Unit): Self = this.set("step", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
