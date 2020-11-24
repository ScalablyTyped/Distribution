package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlock extends js.Object {
  
  /** Block batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.native
  
  /** Block header */
  var header: js.UndefOr[Uint8Array | Null] = js.native
  
  /** Block headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.native
}
object IBlock {
  
  @scala.inline
  def apply(): IBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBlock]
  }
  
  @scala.inline
  implicit class IBlockOps[Self <: IBlock] (val x: Self) extends AnyVal {
    
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
    def setBatchesVarargs(value: IBatch*): Self = this.set("batches", js.Array(value :_*))
    
    @scala.inline
    def setBatches(value: js.Array[IBatch]): Self = this.set("batches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatches: Self = this.set("batches", js.undefined)
    
    @scala.inline
    def setBatchesNull: Self = this.set("batches", null)
    
    @scala.inline
    def setHeader(value: Uint8Array): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderNull: Self = this.set("header", null)
    
    @scala.inline
    def setHeaderSignature(value: String): Self = this.set("headerSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSignature: Self = this.set("headerSignature", js.undefined)
    
    @scala.inline
    def setHeaderSignatureNull: Self = this.set("headerSignature", null)
  }
}
