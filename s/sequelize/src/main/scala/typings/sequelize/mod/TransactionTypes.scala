package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transaction type can be set per-transaction by passing `options.type` to `sequelize.transaction`.
  * Default to `DEFERRED` but you can override the default isolation level by passing
  * `options.transactionType` in `new Sequelize`.
  */
@js.native
trait TransactionTypes extends js.Object {
  
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
  implicit class TransactionTypesOps[Self <: TransactionTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDEFERRED(value: TransactionTypeDeferred): Self = this.set("DEFERRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXCLUSIVE(value: TransactionTypeExclusive): Self = this.set("EXCLUSIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMMEDIATE(value: TransactionTypeImmediate): Self = this.set("IMMEDIATE", value.asInstanceOf[js.Any])
  }
}
