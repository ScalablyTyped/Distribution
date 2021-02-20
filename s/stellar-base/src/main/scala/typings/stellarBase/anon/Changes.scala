package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changes extends StObject {
  
  var changes: js.Array[LedgerEntryChange] = js.native
}
object Changes {
  
  @scala.inline
  def apply(changes: js.Array[LedgerEntryChange]): Changes = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changes]
  }
  
  @scala.inline
  implicit class ChangesMutableBuilder[Self <: Changes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[LedgerEntryChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: LedgerEntryChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
  }
}
