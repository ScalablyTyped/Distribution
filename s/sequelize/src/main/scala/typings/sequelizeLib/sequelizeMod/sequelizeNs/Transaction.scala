package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Transaction extends js.Object {
  /**
    * Possible options for row locking. Used in conjuction with `find` calls:
    *
    * @see TransactionStatic
    */
  var LOCK: TransactionLock
  /**
    * Commit the transaction
    */
  def commit(): bluebirdLib.bluebirdMod.namespaced[scala.Unit]
  /**
    * Rollback (abort) the transaction
    */
  def rollback(): bluebirdLib.bluebirdMod.namespaced[scala.Unit]
}

object Transaction {
  @scala.inline
  def apply(
    LOCK: TransactionLock,
    commit: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]],
    rollback: js.Function0[bluebirdLib.bluebirdMod.namespaced[scala.Unit]]
  ): Transaction = {
    val __obj = js.Dynamic.literal(LOCK = LOCK, commit = commit, rollback = rollback)
  
    __obj.asInstanceOf[Transaction]
  }
}

