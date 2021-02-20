package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlock extends StObject {
  
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
  implicit class IBlockMutableBuilder[Self <: IBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatches(value: js.Array[IBatch]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchesNull: Self = StObject.set(x, "batches", null)
    
    @scala.inline
    def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    @scala.inline
    def setBatchesVarargs(value: IBatch*): Self = StObject.set(x, "batches", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: Uint8Array): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderNull: Self = StObject.set(x, "header", null)
    
    @scala.inline
    def setHeaderSignature(value: String): Self = StObject.set(x, "headerSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderSignatureNull: Self = StObject.set(x, "headerSignature", null)
    
    @scala.inline
    def setHeaderSignatureUndefined: Self = StObject.set(x, "headerSignature", js.undefined)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
