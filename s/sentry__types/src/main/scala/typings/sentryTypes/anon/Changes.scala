package typings.sentryTypes.anon

import typings.sentryTypes.transactionMod.TransactionNameChange
import typings.sentryTypes.transactionMod.TransactionSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changes extends StObject {
  
  var changes: js.Array[TransactionNameChange]
  
  var propagations: Double
  
  var source: TransactionSource
}
object Changes {
  
  inline def apply(changes: js.Array[TransactionNameChange], propagations: Double, source: TransactionSource): Changes = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], propagations = propagations.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changes]
  }
  
  extension [Self <: Changes](x: Self) {
    
    inline def setChanges(value: js.Array[TransactionNameChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: TransactionNameChange*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setPropagations(value: Double): Self = StObject.set(x, "propagations", value.asInstanceOf[js.Any])
    
    inline def setSource(value: TransactionSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
