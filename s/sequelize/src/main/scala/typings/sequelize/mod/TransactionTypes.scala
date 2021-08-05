package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transaction type can be set per-transaction by passing `options.type` to `sequelize.transaction`.
  * Default to `DEFERRED` but you can override the default isolation level by passing
  * `options.transactionType` in `new Sequelize`.
  */
trait TransactionTypes extends StObject {
  
  var DEFERRED: TransactionTypeDeferred
  
  // 'IMMEDIATE'
  var EXCLUSIVE: TransactionTypeExclusive
  
  // 'DEFERRED'
  var IMMEDIATE: TransactionTypeImmediate
}
object TransactionTypes {
  
  inline def apply(
    DEFERRED: TransactionTypeDeferred,
    EXCLUSIVE: TransactionTypeExclusive,
    IMMEDIATE: TransactionTypeImmediate
  ): TransactionTypes = {
    val __obj = js.Dynamic.literal(DEFERRED = DEFERRED.asInstanceOf[js.Any], EXCLUSIVE = EXCLUSIVE.asInstanceOf[js.Any], IMMEDIATE = IMMEDIATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionTypes]
  }
  
  extension [Self <: TransactionTypes](x: Self) {
    
    inline def setDEFERRED(value: TransactionTypeDeferred): Self = StObject.set(x, "DEFERRED", value.asInstanceOf[js.Any])
    
    inline def setEXCLUSIVE(value: TransactionTypeExclusive): Self = StObject.set(x, "EXCLUSIVE", value.asInstanceOf[js.Any])
    
    inline def setIMMEDIATE(value: TransactionTypeImmediate): Self = StObject.set(x, "IMMEDIATE", value.asInstanceOf[js.Any])
  }
}
