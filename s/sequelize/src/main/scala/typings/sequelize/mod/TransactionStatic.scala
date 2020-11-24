package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The transaction static object
  *
  * @see Transaction
  */
@js.native
trait TransactionStatic extends js.Object {
  
  /**
    * Isolations levels can be set per-transaction by passing `options.isolationLevel` to
    * `sequelize.transaction`. Default to `REPEATABLE_READ` but you can override the default isolation level
    * by passing
    * `options.isolationLevel` in `new Sequelize`.
    *
    * The possible isolations levels to use when starting a transaction:
    *
    * ```js
    * {
    *   READ_UNCOMMITTED: "READ UNCOMMITTED",
    *   READ_COMMITTED: "READ COMMITTED",
    *   REPEATABLE_READ: "REPEATABLE READ",
    *   SERIALIZABLE: "SERIALIZABLE"
    * }
    * ```
    *
    * Pass in the desired level as the first argument:
    *
    * ```js
    * return sequelize.transaction({
    *   isolationLevel: Sequelize.Transaction.SERIALIZABLE
    * }, function (t) {
    *
    *  // your transactions
    *
    * }).then(function(result) {
    *   // transaction has been committed. Do something after the commit if required.
    * }).catch(function(err) {
    *   // do something with the err.
    * });
    * ```
    *
    * @see ISOLATION_LEVELS
    */
  var ISOLATION_LEVELS: TransactionIsolationLevels = js.native
  
  /**
    * Possible options for row locking. Used in conjuction with `find` calls:
    *
    * ```js
    * t1 // is a transaction
    * t1.LOCK.UPDATE,
    * t1.LOCK.SHARE,
    * t1.LOCK.KEY_SHARE, // Postgres 9.3+ only
    * t1.LOCK.NO_KEY_UPDATE // Postgres 9.3+ only
    * ```
    *
    * Usage:
    * ```js
    * t1 // is a transaction
    * Model.findAll({
    *   where: ...,
    *   transaction: t1,
    *   lock: t1.LOCK...
    * });
    * ```
    *
    * Postgres also supports specific locks while eager loading by using OF:
    * ```js
    * UserModel.findAll({
    *   where: ...,
    *   include: [TaskModel, ...],
    *   transaction: t1,
    *   lock: {
    *     level: t1.LOCK...,
    *     of: UserModel
    *   }
    * });
    * ```
    * UserModel will be locked but TaskModel won't!
    */
  var LOCK: TransactionLock = js.native
  
  /**
    * Transaction type can be set per-transaction by passing `options.type` to
    * `sequelize.transaction`. Default to `DEFERRED` but you can override the default isolation level
    * by passing `options.transactionType` in `new Sequelize`.
    *
    * The transaction types to use when starting a transaction:
    *
    * ```js
    * {
    *   DEFERRED: "DEFERRED",
    *   IMMEDIATE: "IMMEDIATE",
    *   EXCLUSIVE: "EXCLUSIVE"
    * }
    * ```
    *
    * Pass in the transaction type the first argument:
    *
    * ```js
    * return sequelize.transaction({
    *   type: Sequelize.Transaction.EXCLUSIVE
    * }, function (t) {
    *
    *  // your transactions
    *
    * }).then(function(result) {
    *   // transaction has been committed. Do something after the commit if required.
    * }).catch(function(err) {
    *   // do something with the err.
    * });
    * ```
    *
    * @see Sequelize.Transaction.TYPES
    */
  var TYPES: TransactionTypes = js.native
}
object TransactionStatic {
  
  @scala.inline
  def apply(ISOLATION_LEVELS: TransactionIsolationLevels, LOCK: TransactionLock, TYPES: TransactionTypes): TransactionStatic = {
    val __obj = js.Dynamic.literal(ISOLATION_LEVELS = ISOLATION_LEVELS.asInstanceOf[js.Any], LOCK = LOCK.asInstanceOf[js.Any], TYPES = TYPES.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionStatic]
  }
  
  @scala.inline
  implicit class TransactionStaticOps[Self <: TransactionStatic] (val x: Self) extends AnyVal {
    
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
    def setISOLATION_LEVELS(value: TransactionIsolationLevels): Self = this.set("ISOLATION_LEVELS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOCK(value: TransactionLock): Self = this.set("LOCK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTYPES(value: TransactionTypes): Self = this.set("TYPES", value.asInstanceOf[js.Any])
  }
}
