package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Liabilities extends StObject {
  
  var ext: AccountEntryExtensionV1Ext = js.native
  
  var liabilities: typings.stellarBase.xdrMod.xdr.Liabilities = js.native
}
object Liabilities {
  
  @scala.inline
  def apply(ext: AccountEntryExtensionV1Ext, liabilities: typings.stellarBase.xdrMod.xdr.Liabilities): Liabilities = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], liabilities = liabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Liabilities]
  }
  
  @scala.inline
  implicit class LiabilitiesMutableBuilder[Self <: Liabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: AccountEntryExtensionV1Ext): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiabilities(value: typings.stellarBase.xdrMod.xdr.Liabilities): Self = StObject.set(x, "liabilities", value.asInstanceOf[js.Any])
  }
}
