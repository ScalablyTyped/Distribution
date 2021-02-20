package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.TrustLineEntryV1Ext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtLiabilities extends StObject {
  
  var ext: TrustLineEntryV1Ext = js.native
  
  var liabilities: typings.stellarBase.xdrMod.xdr.Liabilities = js.native
}
object ExtLiabilities {
  
  @scala.inline
  def apply(ext: TrustLineEntryV1Ext, liabilities: typings.stellarBase.xdrMod.xdr.Liabilities): ExtLiabilities = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], liabilities = liabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtLiabilities]
  }
  
  @scala.inline
  implicit class ExtLiabilitiesMutableBuilder[Self <: ExtLiabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: TrustLineEntryV1Ext): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilities(value: typings.stellarBase.xdrMod.xdr.Liabilities): Self = StObject.set(x, "liabilities", value.asInstanceOf[js.Any])
  }
}
