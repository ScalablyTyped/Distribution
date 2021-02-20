package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transaction type can be set per-transaction by passing `options.type` to `sequelize.transaction`.
  * Default to `DEFERRED` but you can override the default isolation level by passing
  * `options.transactionType` in `new Sequelize`.
  */
@js.native
trait TransactionTypes extends StObject {
  
  var DEFERRED: TransactionTypeDeferred = js.native
  
  // 'IMMEDIATE'
  var EXCLUSIVE: TransactionTypeExclusive = js.native
  
  // 'DEFERRED'
  var IMMEDIATE: TransactionTypeImmediate = js.native
}
object TransactionTypes {
  
  @scala.inline
  def apply(
    DEFERRED: TransactionTypeDeferred,
    EXCLUSIVE: TransactionTypeExclusive,
    IMMEDIATE: TransactionTypeImmediate
  ): TransactionTypes = {
    val __obj = js.Dynamic.literal(DEFERRED = DEFERRED.asInstanceOf[js.Any], EXCLUSIVE = EXCLUSIVE.asInstanceOf[js.Any], IMMEDIATE = IMMEDIATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionTypes]
  }
  
  @scala.inline
  implicit class TransactionTypesMutableBuilder[Self <: TransactionTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDEFERRED(value: TransactionTypeDeferred): Self = StObject.set(x, "DEFERRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXCLUSIVE(value: TransactionTypeExclusive): Self = StObject.set(x, "EXCLUSIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMMEDIATE(value: TransactionTypeImmediate): Self = StObject.set(x, "IMMEDIATE", value.asInstanceOf[js.Any])
  }
}
