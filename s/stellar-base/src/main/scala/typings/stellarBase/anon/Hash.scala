package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends StObject {
  
  var ext: LedgerHeaderHistoryEntryExt = js.native
  
  var hash: Buffer = js.native
  
  var header: typings.stellarBase.xdrMod.xdr.LedgerHeader = js.native
}
object Hash {
  
  @scala.inline
  def apply(
    ext: LedgerHeaderHistoryEntryExt,
    hash: Buffer,
    header: typings.stellarBase.xdrMod.xdr.LedgerHeader
  ): Hash = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: LedgerHeaderHistoryEntryExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: typings.stellarBase.xdrMod.xdr.LedgerHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
