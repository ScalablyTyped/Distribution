package typings
package sequelizeLib.sequelizeMod

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
  def commit(): bluebirdLib.bluebirdMod.^[scala.Unit]
  /**
    * Rollback (abort) the transaction
    */
  def rollback(): bluebirdLib.bluebirdMod.^[scala.Unit]
}

object Transaction {
  @scala.inline
  def apply(
    LOCK: TransactionLock,
    commit: () => bluebirdLib.bluebirdMod.^[scala.Unit],
    rollback: () => bluebirdLib.bluebirdMod.^[scala.Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(LOCK = LOCK, commit = js.Any.fromFunction0(commit), rollback = js.Any.fromFunction0(rollback))
  
    __obj.asInstanceOf[Transaction]
  }
}

