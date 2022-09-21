package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDBTransactionOptions extends StObject {
  
  /* standard dom */
  var durability: js.UndefOr[IDBTransactionDurability] = js.undefined
}
object IDBTransactionOptions {
  
  inline def apply(): IDBTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBTransactionOptions]
  }
  
  extension [Self <: IDBTransactionOptions](x: Self) {
    
    inline def setDurability(value: IDBTransactionDurability): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    inline def setDurabilityUndefined: Self = StObject.set(x, "durability", js.undefined)
  }
}
