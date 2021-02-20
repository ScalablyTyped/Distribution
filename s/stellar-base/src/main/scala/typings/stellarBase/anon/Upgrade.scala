package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import typings.stellarBase.xdrMod.xdr.LedgerUpgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upgrade extends StObject {
  
  var changes: js.Array[LedgerEntryChange] = js.native
  
  var upgrade: LedgerUpgrade = js.native
}
object Upgrade {
  
  @scala.inline
  def apply(changes: js.Array[LedgerEntryChange], upgrade: LedgerUpgrade): Upgrade = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upgrade]
  }
  
  @scala.inline
  implicit class UpgradeMutableBuilder[Self <: Upgrade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[LedgerEntryChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: LedgerEntryChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setUpgrade(value: LedgerUpgrade): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
  }
}
