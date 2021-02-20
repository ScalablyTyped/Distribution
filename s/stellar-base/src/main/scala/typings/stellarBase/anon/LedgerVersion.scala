package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.BucketMetadataExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerVersion extends StObject {
  
  var ext: BucketMetadataExt = js.native
  
  var ledgerVersion: Double = js.native
}
object LedgerVersion {
  
  @scala.inline
  def apply(ext: BucketMetadataExt, ledgerVersion: Double): LedgerVersion = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], ledgerVersion = ledgerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerVersion]
  }
  
  @scala.inline
  implicit class LedgerVersionMutableBuilder[Self <: LedgerVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: BucketMetadataExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerVersion(value: Double): Self = StObject.set(x, "ledgerVersion", value.asInstanceOf[js.Any])
  }
}
