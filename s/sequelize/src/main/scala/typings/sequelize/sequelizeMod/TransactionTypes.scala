package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transaction type can be set per-transaction by passing `options.type` to `sequelize.transaction`.
  * Default to `DEFERRED` but you can override the default isolation level by passing
  * `options.transactionType` in `new Sequelize`.
  */
trait TransactionTypes extends js.Object {
  var DEFERRED: TransactionTypeDeferred
   // 'IMMEDIATE'
  var EXCLUSIVE: TransactionTypeExclusive
   // 'DEFERRED'
  var IMMEDIATE: TransactionTypeImmediate
}

object TransactionTypes {
  @scala.inline
  def apply(
    DEFERRED: TransactionTypeDeferred,
    EXCLUSIVE: TransactionTypeExclusive,
    IMMEDIATE: TransactionTypeImmediate
  ): TransactionTypes = {
    val __obj = js.Dynamic.literal(DEFERRED = DEFERRED, EXCLUSIVE = EXCLUSIVE, IMMEDIATE = IMMEDIATE)
  
    __obj.asInstanceOf[TransactionTypes]
  }
}

