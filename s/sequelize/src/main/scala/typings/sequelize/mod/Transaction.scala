package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Transaction
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/transaction.js
//
/**
  * The transaction object is used to identify a running transaction. It is created by calling
  * `Sequelize.transaction()`.
  *
  * To run a query under a transaction, you should pass the transaction in the options object.
  */
@js.native
trait Transaction extends js.Object {
  
  /**
    * Possible options for row locking. Used in conjuction with `find` calls:
    *
    * @see TransactionStatic
    */
  var LOCK: TransactionLock = js.native
  
  /**
    * Commit the transaction
    */
  def commit(): typings.bluebird.mod.^[Unit] = js.native
  
  /**
    * Rollback (abort) the transaction
    */
  def rollback(): typings.bluebird.mod.^[Unit] = js.native
}
object Transaction {
  
  @scala.inline
  def apply(
    LOCK: TransactionLock,
    commit: () => typings.bluebird.mod.^[Unit],
    rollback: () => typings.bluebird.mod.^[Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(LOCK = LOCK.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), rollback = js.Any.fromFunction0(rollback))
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    
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
    def setLOCK(value: TransactionLock): Self = this.set("LOCK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: () => typings.bluebird.mod.^[Unit]): Self = this.set("commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRollback(value: () => typings.bluebird.mod.^[Unit]): Self = this.set("rollback", js.Any.fromFunction0(value))
  }
}
