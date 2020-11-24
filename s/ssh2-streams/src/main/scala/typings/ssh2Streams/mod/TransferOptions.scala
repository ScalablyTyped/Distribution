package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferOptions extends js.Object {
  
  /**
    * Size of each read in bytes
    */
  var chunkSize: js.UndefOr[Double] = js.native
  
  /**
    * Number of concurrent reads
    */
  var concurrency: js.UndefOr[Double] = js.native
  
  /**
    * Integer or string representing the file mode to set for the uploaded file.
    */
  var mode: js.UndefOr[Double | String] = js.native
  
  /**
    * Called every time a part of a file was transferred
    */
  var step: js.UndefOr[
    js.Function3[/* total_transferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.native
}
object TransferOptions {
  
  @scala.inline
  def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  
  @scala.inline
  implicit class TransferOptionsOps[Self <: TransferOptions] (val x: Self) extends AnyVal {
    
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
    def setMode(value: Double | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setStep(value: (/* total_transferred */ Double, /* chunk */ Double, /* total */ Double) => Unit): Self = this.set("step", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
